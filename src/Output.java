import java.io.*;
import java.util.*;
import java.lang.StringBuilder;

public class Output {
    public static void csvOutput(TreeMap<StringBuilder, Integer> data, String out, int totalCounter){
        Set<StringBuilder> keys = data.keySet();

        keys.forEach(key -> {
            try(FileWriter writer = new FileWriter(out, true))
            {
                double finalCount;
                finalCount = (double)data.get(key)/(double)totalCounter;
                writer.write(key + ";" + data.get(key) + String.format("%f",finalCount) + "\n");
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        });
    }
}
