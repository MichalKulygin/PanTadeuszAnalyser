package PanTadeusz;

import java.util.Map;
import java.util.TreeMap;

import static PanTadeusz.URLReader.panTadeuszString;

public class PanTadeuszBook {
    public static Map<String, Integer> panTadeuszBookTekstToTreeSet() throws Exception {
        Map<String, Integer> map = new TreeMap<String, Integer>();

        //String[] panTadeuszAsArray = panTadeuszString().replaceAll("[\\\\W]|_—,.:!", "").split(" ");
        String[] panTadeuszAsArray = panTadeuszString().replaceAll("[,.();…/0-9*«»?:!—\\-]", "").split("\\s");

        for(int i =0;i<panTadeuszAsArray.length;i++){
            System.out.println(panTadeuszAsArray[i]);
        }


        for (String s : panTadeuszAsArray) {
            if (!map.containsKey(s))
                map.put(s, 1);
            else{
                int count = map.get(s);
                map.put(s, count + 1);
            }
        }

        return map;
    }
}
