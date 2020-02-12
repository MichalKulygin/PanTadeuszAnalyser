package PanTadeusz;

import static PanTadeusz.PanTadeuszBook.panTadeuszBookTekstOnly;
import static PanTadeusz.URLReader.panTadeuszString;

public class App {
    public static void main(String[] args) throws Exception {

        String panTadeusz2 = panTadeuszString();
        String panTadeusz = panTadeuszBookTekstOnly();

        System.out.println(panTadeusz2);

    }
}
