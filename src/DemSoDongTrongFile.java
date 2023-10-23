import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemSoDongTrongFile {
    public static void main(String[] args) {
        String tenTep = "D:\\Module3\\MD3-SS16\\src\\File.txt";
        try {
            FileReader fileReader = new FileReader(tenTep);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int soDong = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                soDong++;
            }
            bufferedReader.close();
            System.out.println("Số dòng trong tệp: " + soDong);
        } catch (IOException e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
}
