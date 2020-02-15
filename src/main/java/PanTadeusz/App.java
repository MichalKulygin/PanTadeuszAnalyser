package PanTadeusz;

public class App {
    public static void main(String[] args) {

        PanTadeuszAnalyser panTadeuszAnalyser = new PanTadeuszAnalyser();
        panTadeuszAnalyser.panTadeuszStatistics();


        String testWord = "Robak";
        System.out.print("Word " + testWord + " occures: ");
        System.out.println(panTadeuszAnalyser.howManyTimesMyWordOccursInPanTadeuszBook(testWord) + " times.");

    }
}
