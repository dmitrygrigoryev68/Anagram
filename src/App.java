import java.util.*;
import java.util.stream.Collectors;

public class App {
    static Map<String, List<String>> ret = new HashMap<>();

    public static void main(String[] args) {

        String[] dict = {
                "ivan", "vani", "navi", "mir", "rim", "car", "to", "as",
                "sa", "war", "raw", "world", "maria"};
        createDict(dict);
        List<String> findAnagram = check("ivan");
        System.out.println(findAnagram);
    }

    public static Map<String, List<String>> createDict(String[] voc) {
        return Arrays.asList(voc)
        .stream()
                .collect(Collectors.groupingBy(s->App.alfa(s)));

        /*   for (String s : voc) {
            String alf = alfa(s);
            List<String> list = ret.get(alf);
            if (list == null) {
                List<String> words = new LinkedList<>();
                words.add(s);
                ret.put(alf, words);
            } else {
                list.add(s);
            }
        }
        return ret;*/
    }

    public static String alfa(String input) {
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static List<String> check(String str) {
        String alfa = alfa(str);
        return ret.get(alfa);
    }
}



