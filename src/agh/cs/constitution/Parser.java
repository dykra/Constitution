package agh.cs.constitution;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Joanna on 2016-11-30.
 */
public class Parser {
    private String path;

    public Parser(String path) {
        this.path=path;
    }

    public Constitution parse() throws IOException {
             String charset = "UTF-8";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), charset))) {
            Scanner scanner = new Scanner();
            Constitution constitution = new Constitution();
            String sCurrentLine;
            String tmp = "";

            while ((sCurrentLine = reader.readLine()) != null) {

                tmp=tmp+sCurrentLine;
                sCurrentLine=tmp;
                tmp="";
                if (sCurrentLine.endsWith("©Kancelaria Sejmu")) {
                    sCurrentLine = reader.readLine();
                } else {
                    if (sCurrentLine.equals("2009-11-16")) {
                        sCurrentLine = reader.readLine();
                    } else {
                        if (sCurrentLine.endsWith("-")) {
                            sCurrentLine = sCurrentLine.substring(0, sCurrentLine.length() - 1);
                            int lastWord = sCurrentLine.lastIndexOf(" ");
                            tmp = sCurrentLine.substring(lastWord + 1);
                            sCurrentLine = sCurrentLine.substring(0, lastWord);
                        }
                        scanner.lineToObject(constitution, sCurrentLine);
                    }
                }
            }

        return constitution;
        }
    }
}
