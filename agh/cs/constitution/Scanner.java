package agh.cs.constitution;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Joanna on 2016-12-02.
 */
public class Scanner {
    private boolean chapterAdded;
    private  int chapterNb;
    private int articleNb;
    private int currentArticle; //nr artykulu w rozdziale

    public Scanner() {
        this.chapterAdded = false;
        this.chapterNb = 0;
        this.articleNb = 0;
        this.currentArticle= 0;
    }

    //class which should make objects from txt file

    public void linetoObject(Constitution constitution,String sCurrentLine) {

        if (chapterNb==0 && chapterAdded==false){
            //ustawiamy preambułę konstytucji
            constitution.title.add(sCurrentLine);
        }else if (sCurrentLine.startsWith("Rozdział")){
            chapterNb++;
            chapterAdded= true;
            currentArticle=0;
            constitution.chapters.add(new Chapter(chapterNb,articleNb+1,sCurrentLine));
            //co gdy rozdzial nie ma zadnego artykulu?

        }else if (chapterAdded==true){
            //ustawiamy tytul rozdziału np "prawa i obowiazki"
            constitution.chapters.get(chapterNb-1).giveTitle(sCurrentLine);
            chapterAdded=false;
        }else if(sCurrentLine.startsWith("Art.")){
            articleNb++;
            currentArticle++;
            constitution.chapters.get(chapterNb-1).articles.add(new Article(articleNb));
            constitution.chapters.get(chapterNb-1).updateIndekxMax(articleNb);
        }else {
            //jestesmy w srodku artykulu
            constitution.chapters.get(chapterNb-1).articles.get(currentArticle-1).subsections.add(sCurrentLine);
        }
        System.out.println(sCurrentLine);

    }


    private void getTitle(){//do ustawiania tytulu rozdzialu

    }
}
