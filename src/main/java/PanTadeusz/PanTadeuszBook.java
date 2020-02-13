package PanTadeusz;

import java.util.Map;
import java.util.TreeMap;

import static PanTadeusz.URLReader.panTadeuszString;

public class PanTadeuszBook {
    public static Map<String, Integer> panTadeuszBookTekstToTreeSet() throws Exception {
        Map<String, Integer> map = new TreeMap<String, Integer>();

        //String[] panTadeuszAsArray = panTadeuszString().replaceAll("[\\\\W]|_—,.:!", "").split(" ");
        String[] panTadeuszAsArray = panTadeuszString().replaceAll("[,.();…/0-9*«»?:!—\\-]", "").split(" ");
        //String[] panTadeuszAsArray = panTadeuszString().replaceAll("^[^a-zA-Z0-9,.!]", "").split(" ");

        for(int i =0;i<panTadeuszAsArray.length;i++){
            System.out.println(panTadeuszAsArray[i]);
        }


        for (String s : panTadeuszAsArray) {
            if (!map.containsKey(s.toLowerCase()))
                map.put(s.toLowerCase(), 1);
            else{
                int count = map.get(s.toLowerCase());
                map.put(s.toLowerCase(), count + 1);
            }
        }

        return map;
    }
}
