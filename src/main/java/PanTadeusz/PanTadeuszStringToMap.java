package PanTadeusz;

import java.util.Map;
import java.util.TreeMap;

import static PanTadeusz.URLReader.panTadeuszString;

public class PanTadeuszStringToMap {
    public static Map<String, Integer> panTadeuszBookTekstToTreeMap() {
        Map<String, Integer> map = new TreeMap<String, Integer>();

        String[] panTadeuszAsArray = panTadeuszString().toLowerCase().replaceAll("[,.();…/0-9*«»?:!—\\-]", "").split("\\s");

        for (String s : panTadeuszAsArray) {
            if (s.length() > 1) {

                if (!map.containsKey(s))
                    map.put(s, 1);
                else {
                    int count = map.get(s);
                    map.put(s, count + 1);
                }
            }
        }

        return map;
    }
}
