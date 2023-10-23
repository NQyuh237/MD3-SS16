import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SortWordsInFile {
    public static void main(String[] args) {
        String fileName = "D:\\Module3\\MD3-SS16\\src\\File.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                Arrays.sort(words);
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
