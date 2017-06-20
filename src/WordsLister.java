import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Valentin on 20/06/2017.
 */
public class WordsLister {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Map map = new HashMap();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Valentin\\Desktop\\ALLEZ.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (map.get(words[i]) == null) {
                        map.put(words[i], 1);
                    } else {
                        int newValue = Integer.valueOf(String.valueOf(map.get(words[i])));
                        newValue++;
                        map.put(words[i], newValue);
                    }
                }
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        }
        Map<String, String> sorted = new TreeMap<String, String>(map);
        for (Object key : sorted.keySet())

        {
            System.out.println("Word: " + key + "\tCounts: " + map.get(key));
        }
    }
}