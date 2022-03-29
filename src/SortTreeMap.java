import java.util.*;
import java.lang.StringBuilder;

public class SortTreeMap {
    public TreeMap<StringBuilder, Integer> SortByValue(TreeMap <StringBuilder, Integer> data) {
        TreeMap <StringBuilder, Integer> sortedData;
        Comparator<StringBuilder> cmp = (o1, o2) -> {
            int result = data.get(o1).compareTo(data.get(o2));
            if (result == 0)
                return o1.compareTo(o2);
            return -result;
        };

        sortedData = new TreeMap<>(cmp);
        sortedData.putAll(data);
        for(Map.Entry<StringBuilder, Integer> entry : sortedData.entrySet()) {
            StringBuilder key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " => " + value);
        }

        return sortedData;
    }
}
