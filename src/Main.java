import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        String word = "yourapp the quick brown fox jumps over the lazy dog";
        String[] split = word.split(" ");
        for (String w : split) {
            words.add(w);
        }
        System.out.println(words);
    }
}