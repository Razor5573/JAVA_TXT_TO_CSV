import java.io.*;
import java.util.*;
import java.lang.StringBuilder;
import java.util.Map.Entry;

public class Output {
    public static void csvOutput(Map<StringBuilder, Integer> data, List<Entry<StringBuilder, Integer>> list, String out){
        for (ListIterator<Map.Entry<StringBuilder, Integer>> it1 = list.listIterator(list.size()); it1.hasPrevious(); ){
            try(FileWriter writer = new FileWriter(out, false))
            {
                String temp = String.valueOf(it1.previous().getKey());
                writer.write(temp);
                writer.flush();
                it1.next();
                temp = String.valueOf(it1.previous().getValue());
                writer.write(temp);
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
                break;
            }
        }
    }
}
