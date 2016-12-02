package agh.cs.constitution;

import java.util.ArrayList;

/**
 * Created by Joanna on 2016-11-30.
 */
public class Chapter implements IConstitutionElement {
    public ArrayList<IConstitutionElement> articles;
    private int number; //korzysta z metody roman to decimal, ale czy ona na pewno potrzebna? lepiej nr po kolei dodawani
    private String title;
    int articleMin;
    int articleMax;

    @Override
    public void toString(int number) {

    }
}
