import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LongestWordsFinder {
    public static void main(String[] args) {
        String filePath = "D:\\Module3\\MD3-SS16\\src\\File.txt";
        List<String> words = new ArrayList<>();
        int maxLength = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath)) ) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {
                    word = word.replaceAll("[^a-zA-Z]", "");
                    if (!word.isEmpty()) {
                        words.add(word);
                        maxLength = Math.max(maxLength, word.length());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> longestWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }

        System.out.println("Các từ có độ dài lớn nhất trong file:");
        for (String word : longestWords) {
            System.out.println(word + " (Độ dài: " + maxLength + ")");
        }
    }
}
