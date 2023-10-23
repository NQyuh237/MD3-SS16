import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        String filePath = "D:\\Module3\\MD3-SS16\\src\\File.txt";
        try {
            String content = readFile(filePath);
            String[] words = content.split("\\s+");
            int wordCount = words.length;
            System.out.println("Số lượng từ trong tệp: " + wordCount);
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc tệp văn bản: " + e.getMessage());
        }
    }
    public static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
