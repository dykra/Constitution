package agh.cs.constitution;

import java.util.ArrayList;

/**
 * Created by Joanna on 2016-11-30.
 */

public class Article implements IConstitutionElement {
        public ArrayList<String> subsections;
        int number;

        public Article(int number) {
                this.subsections = new ArrayList<>();
                this.number=number;
        }

        @Override
        public String print() {
                String result="";
                result+="Art. ";
                result+=this.number;
                result+=".\n";
                for (int i=0; i < subsections.size(); i ++) {
                        result=result+subsections.get(i);
                        result+="\n";
                }
        return result;}
}
