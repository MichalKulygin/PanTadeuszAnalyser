package PanTadeusz;

import java.util.Map;

import static PanTadeusz.PanTadeuszBook.panTadeuszBookTekstToTreeMap;

public class App {
    public static void main(String[] args) throws Exception {

        PanTadeuszAnalyser panTadeuszAnalyser = new PanTadeuszAnalyser();

        panTadeuszAnalyser.panTadeuszStatistics();
        panTadeuszAnalyser.entrySetToArray();
        panTadeuszAnalyser.entryKeySetToArray();

    }
}
