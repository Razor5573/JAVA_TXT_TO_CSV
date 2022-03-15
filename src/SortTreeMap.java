import java.util.*;
import java.lang.StringBuilder;

public class SortTreeMap {
    public TreeMap<StringBuilder, Integer> SortByValue(TreeMap <StringBuilder, Integer> data) {
        TreeMap <StringBuilder, Integer> sortedData;
        Comparator<StringBuilder> cmp = new Comparator<StringBuilder>() {
            @Override
            public int compare(StringBuilder o1, StringBuilder o2) {
                if (data.get(o1).equals(data.get(o2)))
                {
                    //System.out.println("key1: " + data.get(o1) + " word1: " + o1 + " \nkey2: " + data.get(o2) + " word2: " + o2 + "\n\n");
                    return 0;
                }

                if (data.get(o1).compareTo(data.get(o2)) > 0)
                {
                    //System.out.println("key1: " + data.get(o1) + " word1: " + o1 + " \nkey2: " + data.get(o2) + " word2: " + o2 + "\n\n");
                    return -1;
                }

                else {
                    //System.out.println("key1: " + data.get(o1) + " word1: " + o1 + " \nkey2: " + data.get(o2) + " word2: " + o2 + "\n\n");
                    return 1;
                }
            }
        };

        sortedData = new TreeMap<>(cmp);

        return sortedData;
    }
}
