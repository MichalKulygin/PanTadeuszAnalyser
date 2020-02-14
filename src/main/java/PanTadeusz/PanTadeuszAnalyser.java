package PanTadeusz;

import java.util.Map;

import static PanTadeusz.PanTadeuszBook.panTadeuszBookTekstToTreeMap;

public class PanTadeuszAnalyser {

    private Map<String, Integer> panTadeuszWordsMap;

    public Map<String, Integer> getPanTadeuszWordsMap() {
        return panTadeuszWordsMap;
    }

    public PanTadeuszAnalyser() throws Exception {
        this.panTadeuszWordsMap = panTadeuszBookTekstToTreeMap();
    }

    public void panTadeuszStatistics() {
        System.out.println("PanTadeusz statistics.");
        panTadeuszHowManyDistinctWords();
        panTadeuszWordTadeuszOccurances();
        panTadeuszMostCommonWord();

    }

    private void panTadeuszWordTadeuszOccurances() {
        System.out.println();
        System.out.print("Word 'Tadeusz' occures in Pan Tadeusz book: ");
        System.out.print(getPanTadeuszWordsMap().get("Tadeusz"));
        System.out.print(" times.");
    }

    private void panTadeuszHowManyDistinctWords() {
        System.out.println();
        System.out.print("There are  ");
        System.out.print(getPanTadeuszWordsMap().size());
        System.out.print(" distinct words in Pan Tadeusz book.");
    }

    private void panTadeuszMostCommonWord() {
        int count = 0;
        String mostCommonWord = "";

        for (int i = 0; i < getPanTadeuszWordsMap().size(); i++) {

        }
    }

    public void entrySetToArray() {
        System.out.println(getPanTadeuszWordsMap().values());
    }

    public void entryKeySetToArray() {
        System.out.println(getPanTadeuszWordsMap().keySet());
    }

}
