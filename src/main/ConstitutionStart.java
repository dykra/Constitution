package main;

import agh.cs.constitution.Constitution;
import agh.cs.constitution.ParseInstructions;
import agh.cs.constitution.Parser;

import java.io.IOException;

/**
 * Created by Joanna on 2016-11-30.
 */
public class ConstitutionStart {
    public static void main(String[] args) {
        try{
            ParseInstructions instructions = new ParseInstructions();//a -> article; c-> chapter; zakres do oczytu
            int instr[]= instructions.parseArguments(args);
            Constitution C = new Parser(args[0]).parse();
            if(instr[0]==1){
                System.out.println(C.printChapter(instr[1]));
            }else{
                System.out.println(C.printArticle(instr[1],instr[2]));
            }

        }catch (IllegalArgumentException ex ){
            System.out.print(ex.getMessage());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

