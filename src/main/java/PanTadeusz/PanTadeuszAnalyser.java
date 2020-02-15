package PanTadeusz;

import java.util.Map;

import static PanTadeusz.PanTadeuszStringToMap.panTadeuszBookTekstToTreeMap;

public class PanTadeuszAnalyser {

    private Map<String, Integer> panTadeuszWordsMap;
    private String mostCommonWordInPanTadeusz;
    private int mostCommonWordInPanTadeuszOccurs = 0;

    public String getMostCommonWordInPanTadeusz() {
        return mostCommonWordInPanTadeusz;
    }

    public void setMostCommonWordInPanTadeusz(String mostCommonWordInPanTadeusz) {
        this.mostCommonWordInPanTadeusz = mostCommonWordInPanTadeusz;
    }

    public int getMostCommonWordInPanTadeuszOccurs() {
        return mostCommonWordInPanTadeuszOccurs;
    }

    public void setMostCommonWordInPanTadeuszOccurs(int mostCommonWordInPanTadeuszOccurs) {
        this.mostCommonWordInPanTadeuszOccurs = mostCommonWordInPanTadeuszOccurs;
    }

    public Map<String, Integer> getPanTadeuszWordsMap() {
        return panTadeuszWordsMap;
    }

    public PanTadeuszAnalyser() {
        this.panTadeuszWordsMap = panTadeuszBookTekstToTreeMap();
    }

    public void panTadeuszStatistics() {
        System.out.println("PanTadeusz statistics.");
        panTadeuszHowManyDistinctWords();
        panTadeuszWordTadeuszOccurrences();
        panTadeuszMostCommonWord();
        System.out.println();
        System.out.println("Most common word in Pan Tadeusz book is: \"" + getMostCommonWordInPanTadeusz()
                + "\". It occurs " + getMostCommonWordInPanTadeuszOccurs() + " times.");

    }

    private void panTadeuszWordTadeuszOccurrences() {
        System.out.println();
        System.out.print("Word \"Tadeusz\" occurs in Pan Tadeusz book: ");
        System.out.print(howManyTimesMyWordOccursInPanTadeuszBook("Tadeusz"));
        System.out.print(" times.");
    }

    private void panTadeuszHowManyDistinctWords() {
        System.out.println();
        System.out.print("There are ");
        System.out.print(getPanTadeuszWordsMap().size());
        System.out.print(" distinct words in Pan Tadeusz book.");
    }

    private void panTadeuszMostCommonWord() {

        for (Map.Entry<String, Integer> entry : getPanTadeuszWordsMap().entrySet()) {

            if (entry.getValue() > getMostCommonWordInPanTadeuszOccurs()) {
                setMostCommonWordInPanTadeusz(entry.getKey());
                setMostCommonWordInPanTadeuszOccurs(entry.getValue());
            }

        }
    }

    public int howManyTimesMyWordOccursInPanTadeuszBook(String myWord) {
        return getPanTadeuszWordsMap().get(myWord.toLowerCase());
    }

    // entrySetToArray - prints map values
    public void entrySetToArray() {
        System.out.println(getPanTadeuszWordsMap().values());
    }

    // entryKeySetToArray - prints map key set
    public void entryKeySetToArray() {
        System.out.println(getPanTadeuszWordsMap().keySet());
    }

}
