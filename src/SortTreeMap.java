import java.io.*;
import java.util.*;
import java.lang.StringBuilder;

import java.util.Map.Entry;

public class SortTreeMap {
    /*Comparator<Integer> cmp = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    }; */

    /*public ArrayList<Integer> sortByValue(TreeMap<StringBuilder, Integer> data){
        ArrayList<Integer> list = new ArrayList<Integer>(data.values());
        list.sort(cmp);
        System.out.println(list);
        return list;
    } */

    public List<Entry<StringBuilder, Integer>> sortByValue(Map<StringBuilder, Integer> data){
        List<Entry<StringBuilder, Integer>> list = new ArrayList<>(data.entrySet());
        list.sort(Entry.comparingByValue());
        return list;
    }
}
