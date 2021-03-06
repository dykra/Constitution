package agh.cs.constitution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joanna on 2016-11-30.
 */
public class Constitution {
    public ArrayList<Chapter> chapters;
    public List<String> introduction;


    public Constitution() {
        this.chapters = new ArrayList<>();
        this.introduction = new ArrayList<>();
    }

    public  void printIntroduction(){
        for(int i=0; i < introduction.size(); i ++){
            System.out.println(introduction.get(i));
        }
    }

    public String printArticle(int first, int last) {
        String result="";
        if (first < 0 ){
            throw new IllegalArgumentException(first + "Podałes liczbę ujemną.");
        }if (last < chapters.get(chapters.size() - 1).indeksMax) {

            int i = giveFirstChapter(first);
            int j = giveLastChapter(last);

            int tmp = 0;
            while (first > chapters.get(i).articles.get(tmp).number)
                tmp++;

            for (int k = i; k <= j; k++) {
                //l to wewnetrzny licznij a nie prawdziwego artykulu
                for (int l = tmp; l < chapters.get(k).articles.size() && chapters.get(k).articles.get(l).number <= last; l++) {
                    result=result+chapters.get(k).articles.get(l).print();
                }
                tmp = 0;
            }
        }else
        throw new IllegalArgumentException(last + "Podałes artykuł spoza zakresu.");

    return result;}

    private int giveFirstChapter(int first){

        int i=0;
        while ( first-1 > chapters.get(i).indeksMax){
            i++;
        }
    return i;}
    public int getFirstChapter(int first){
        return giveFirstChapter(first);
    }

    private int giveLastChapter(int last){
        int j=0;
        while (chapters.get(j).indeksMax < last-1){
            j++;
        }
    return j;}

    public int getLastChapter(int last){
        return giveLastChapter(last);
    }

    public String printChapter(int number) {
        String res="";
        if (number < 1)
            throw new IllegalArgumentException(number + "  Podałes liczbę ujemną.");
        if (number <= chapters.size())
            res+=chapters.get(number-1).print();
            //chapters.get(number - 1).print(); //bo nr w tablicy od 0

        else throw new IllegalArgumentException(number + "  Podałes numer większy niż zakres rozdziałów.");
    return res;}
}
