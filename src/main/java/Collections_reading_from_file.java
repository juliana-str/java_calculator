import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Collections_reading_from_file {
    public static void main(String[] args) throws IOException {
        StringBuilder text = new StringBuilder();
        try (FileReader reader = new FileReader("filePushkin.txt")) {
            while (reader.ready()) {
                int data = reader.read();
                if ((char) data == '\n') {
                    text.append(" ");
                } else if (Character.isLetter((char) data) | Character.isSpaceChar((char) data)) {
                    text.append((char) data);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> textArray = new ArrayList<>(Arrays.asList(text.toString().toLowerCase().split(" ")));
        Collections.sort(textArray);
        Map<Object, Integer> wordsCollection = new LinkedHashMap<>();
        int wordsCount = 1;
        for (int i = 1; i < textArray.size(); i++) {
            wordsCollection.put(textArray.get(i - 1), wordsCount);
            if (textArray.get(i - 1).equals(textArray.get(i))) {
                wordsCount++;
            } else {
                wordsCount = 1;
            }
        }
        System.out.println(wordsCollection);
        Object word = Collections.max(wordsCollection.entrySet(), Map.Entry.comparingByValue()).getKey();
        int value = wordsCollection.get(word);
        System.out.println("Слово '" + word + "' встречется " + value + " раз.");
    }
}
