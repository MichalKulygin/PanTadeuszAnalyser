package PanTadeusz;

public class App {
    public static void main(String[] args) {

        PanTadeuszAnalyser panTadeuszAnalyser = new PanTadeuszAnalyser();
        panTadeuszAnalyser.panTadeuszStatistics();

        System.out.print("Word \"Robak\" occures: ");
        System.out.println(panTadeuszAnalyser.howManyTimesMyWordOccursInPanTadeuszBook("Robak") + " times.");

    }
}
