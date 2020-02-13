package PanTadeusz;

import com.sun.source.tree.Tree;

import java.util.Map;

import static PanTadeusz.PanTadeuszBook.panTadeuszBookTekstToTreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        Map<String, Integer> map = panTadeuszBookTekstToTreeSet();

        System.out.println(map.get("tadeusz"));
    }
}
