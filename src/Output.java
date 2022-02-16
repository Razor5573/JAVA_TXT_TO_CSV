import java.io.*;
import java.util.*;
import java.lang.StringBuilder;
import java.util.Map.Entry;

public class Output {
    public static void csvOutput(List<Entry<StringBuilder, Integer>> list, String out, int totalCounter){
        for (ListIterator<Map.Entry<StringBuilder, Integer>> it1 = list.listIterator(list.size()); it1.hasPrevious(); ){
            try(FileWriter writer = new FileWriter(out, true))
            {
                String temp = String.valueOf(it1.previous().getKey());
                writer.write(temp);
                it1.next();
                writer.write(";");
                temp = String.valueOf(it1.previous().getValue());
                writer.write(temp);
                writer.write(";");
                it1.next();
                double finalCount;
                finalCount = (double)it1.previous().getValue()/(double)totalCounter;
                writer.write(String.format("%f",finalCount));

                writer.write("\n");
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
                break;
            }
        }
    }
}
