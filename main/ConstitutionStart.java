package main;

import agh.cs.constitution.Parser;

import java.io.IOException;

/**
 * Created by Joanna on 2016-11-30.
 */
public class ConstitutionStart {
    public static void main(String[] args) {

        try{

            String path="C:\\Users\\Joanna\\Documents\\Konstytucja.txt";
            Parser a = new Parser(path);
            a.parse(); //moze lepiej zeby zwracal obiekt Constitution?

            //a -> article; c-> chapter; zakres do oczytu



        }catch (IOException e) {
            e.printStackTrace();

        }

        //wyodrebnienie klasy do wczytywanie z linii polecen
    }
}
