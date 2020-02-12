package PanTadeusz;

import java.net.*;
import java.io.*;

public class URLReader {
    public static String panTadeuszString() throws Exception {
        String panTadeuszAsString = null;

        URL url = new URL("https://wolnelektury.pl/media/book/txt/pan-tadeusz.txt");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            panTadeuszAsString = panTadeuszAsString + inputLine + "\n";
        in.close();

        return panTadeuszAsString.substring(panTadeuszAsString.indexOf("Księga pierwsza"),panTadeuszAsString.indexOf("-----"));
    }
}