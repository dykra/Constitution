package agh.cs.constitution;

import java.io.*;

/**
 * Created by Joanna on 2016-11-30.
 */
public class Reader {
    private String path;

    public Reader(String path) {
        this.path=path;
    }

    public void read() throws IOException {

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(new FileReader(path));

        String sCurrentLine;

        while ((sCurrentLine = br.readLine()) != null) {
            System.out.println(sCurrentLine);
        }
        //class file, scanner

        //wczytuje plik
        //wywoluje deleteFragments i toObject
        //zwraca forme obiektowa (tzn Constitution) a ona ma pod soba wszystko
    }


    private void deleteFragments(){
        //usuwa z niego zbedne linie i znaki
    }

    private void toObjects(){
//tworzenie formy obiektowej pliku
    }

    private void getTitle(){//do ustawiania tytulu rozdzialu

    }

    private void joinWorlds(){
//do usuwania - na koncu linii
    }

}
