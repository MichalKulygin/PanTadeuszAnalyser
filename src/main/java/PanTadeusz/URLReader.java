package PanTadeusz;

import java.net.*;
import java.io.*;

public class URLReader {
    public static String panTadeuszString() throws Exception {
        String panTadeuszAsString;

        URL oracle = new URL("https://wolnelektury.pl/media/book/txt/pan-tadeusz.txt");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        panTadeuszAsString = new StringBuilder().append(inputLine).toString();
        in.close();

    return panTadeuszAsString;
    }
}