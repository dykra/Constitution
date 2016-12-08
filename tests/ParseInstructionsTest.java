package tests;

import agh.cs.constitution.ParseInstructions;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Joanna on 2016-12-08.
 */
public class ParseInstructionsTest {

    @Test
    public void parseArgumentsChapterTest() throws Exception {
        String[] argss = new String[3];
        argss[0]="C:\\Users\\Joanna\\Documents\\Konstytucja.txt";
        argss[1]="chapter";
        argss[2]="45";
        ParseInstructions a = new ParseInstructions();
        int[] result = a.parseArguments(argss);
        assertEquals(result[0],1);
        assertEquals(result[1],45);
        assertEquals(result.length,3);

        argss[1]="C";
        int[] result2 = a.parseArguments(argss);
        assertEquals(result2[0],1);
        assertEquals(result2[1],45);
        assertEquals(result2.length,3);
    }

    @Test
    public void parseArgumentsArticleTest() throws Exception {
        String[] argss = new String[4];
        argss[0]="C:\\Users\\Joanna\\Documents\\Konstytucja.txt";
        argss[1]="a";
        argss[2]="67";
        argss[3]="89";
        ParseInstructions a = new ParseInstructions();
        int[] result = a.parseArguments(argss);

        assertEquals(result[0],0);
        assertEquals(result[1],67);
        assertEquals(result[2],89);
        assertEquals(result.length,3);

        argss[1]="Article";
        int[] result2 = a.parseArguments(argss);
        assertEquals(result2[0],0);
        assertEquals(result2[1],67);
        assertEquals(result[2],89);
        assertEquals(result.length,3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseArgumentsTest() throws Exception {
        String[] argss = new String[4];
        argss[0]="C:\\Users\\Joanna\\Documents\\Konstytucja.txt";
        argss[1]="aajdhsksuad";
        argss[2]="67";
        argss[3]="89";
        ParseInstructions a = new ParseInstructions();
        int[] result = a.parseArguments(argss);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseArgumentsTest2() throws Exception {
        String[] argss = new String[4];
        argss[0]="C:\\Users\\Joanna\\Documents\\Konstytucja.txt";
        argss[1]="a";
        argss[2]="123";
        argss[3]="89";
        ParseInstructions a = new ParseInstructions();
        int[] result = a.parseArguments(argss);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseArgumentsTest3() throws Exception {
        String[] argss = new String[5];
        argss[0]="C:\\Users\\Joanna\\Documents\\Konstytucja.txt";
        argss[1]="a";
        argss[2]="34";
        argss[3]="89";
        argss[4]="23";
        ParseInstructions a = new ParseInstructions();
        int[] result = a.parseArguments(argss);
    }





}