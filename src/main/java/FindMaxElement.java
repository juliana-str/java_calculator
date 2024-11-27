import java.util.Comparator;
import java.util.List;

public class FindMaxElement {
    /**
     * @param words list of entered words
     */
    public static void findMaxElement(List<String> words, int arrayLenth) {
        words.sort(Comparator.comparingInt(String::length));
        String maxLenthWord = words.get(arrayLenth-1);
        for(String word: words){
            if(word.length()==maxLenthWord.length()) {
                System.out.println(word);
            }
        }
    }
}
