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
        public void print() {
//pamietac zeby po Art. number wypisac jeszcze kropke -> (Art. 1.)
                System.out.println("Art. "+this.number+ ".");
                for (int i=0; i < subsections.size(); i ++) {
                        System.out.println(subsections.get(i));
                }
        }
}
