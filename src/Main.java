import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String fileName = "D:\\Module3\\MD3-SS16\\src\\File.txt";

        try {
            List<String> words = readWordsFromFile(fileName);
            List<String> duplicateWords = findDuplicateWords(words);

            System.out.println("Các từ trùng lặp trong tệp là:");
            for (String word : duplicateWords) {
                System.out.println(word);
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc tệp: " + e.getMessage());
        }
    }
    private static List<String> readWordsFromFile(String fileName) throws IOException {
        List<String> words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {
                    words.add(word);
                }
            }
        }
        return words;
    }
    private static List<String> findDuplicateWords(List<String> words) {
        List<String> duplicateWords = new ArrayList<>();
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateWords.add(entry.getKey());
            }
        }
        return duplicateWords;
    }
}
