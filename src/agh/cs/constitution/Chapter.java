package agh.cs.constitution;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Joanna on 2016-11-30.
 */
public class Chapter implements IConstitutionElement{
    public ArrayList<Article> articles;
    private int number; //korzysta z metody roman to decimal, ale czy ona na pewno potrzebna? lepiej nr po kolei dodawani
    private String titleWithRoman;
    private String title;
    public int indeksMin;
    public int indeksMax; //zeby sprawdzic jak artykuly z kilku rozdzialow


    public Chapter(int number, int indeksMin, String sCurrentLine) {
        this.articles = new ArrayList<>();
        this.number = number;
        this.titleWithRoman=sCurrentLine;
        this.title="";              //tytul ustawiamy w kolejnej linii
        this.indeksMin = indeksMin;
        this.indeksMax = indeksMin; //gdy tworzymy kolejny rozdzial to ustawiamy ideks maksymalny artykułu
    }

    @Override
    public String print() {
        String res= "";
        res=res+titleWithRoman;
        res+="\n";
        res+=title+"\n";

        for (int i=0; i < articles.size(); i ++){
            res+=articles.get(i).print();
        }
    return res;}

    public void updateIndeksMax(int indeksMax){
        this.indeksMax=indeksMax;
    }

    public void giveTitle(String sCurrentLine) {
        this.title=sCurrentLine;
    }


}
