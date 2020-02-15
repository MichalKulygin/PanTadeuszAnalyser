package PanTadeusz;

import java.net.*;
import java.io.*;

public class URLReader {

    public static String panTadeuszString() {
        StringBuilder panTadeuszAsString = new StringBuilder();

        try {
            URL url = new URL("https://wolnelektury.pl/media/book/txt/pan-tadeusz.txt");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                panTadeuszAsString.append(inputLine).

                        append("\n");
            in.close();

        } catch (
                Exception e) {
            System.out.println(e);
        }
        return panTadeuszAsString.substring(panTadeuszAsString.indexOf("Księga pierwsza"), panTadeuszAsString.indexOf("-----"));
    }
}