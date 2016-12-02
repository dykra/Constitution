package main;

import agh.cs.constitution.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Joanna on 2016-11-30.
 */
public class ConstitutionStart {
    public static void main(String[] args) {

        try{

            String path="C:\\Users\\Joanna\\Documents\\Konstytucja.txt";
            Reader a = new Reader(path);
            a.read(); //moze lepiej zeby zwracal obiekt Constitution?

            //a -> article; c-> chapter; zakres do oczytu

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
