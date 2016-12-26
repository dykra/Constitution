package tests;

import agh.cs.constitution.Article;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Joanna on 2016-12-08.
 */
public class ArticleTest {
    @Test
    public void print() throws Exception {
        Article a = new Article(2);
        a.subsections.add("Ala ma kota.");
        assertEquals(a.print(), "Art. 2.\n" + "Ala ma kota.\n");

    }

}