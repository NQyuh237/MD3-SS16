import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main(String[] args) throws IOException {
        File data = new File("data");
        data.mkdir();
        File input = new File("data/input.txt");
        input.createNewFile();
        File demo = new File("data/Demo.java");
        demo.createNewFile();
        File sub1 = new File("data/sub1");
        sub1.mkdir();
        File output = new File("data/sub1/output.txt");
        output.createNewFile();
        File student = new File("data/sub1/student.dat");
        student.createNewFile();
        File sub2 = new File("data/sub2");
        sub2.mkdir();

        File[] listFile = data.listFiles();
        for (int i = 0; i < listFile.length; i++) {
            if (listFile[i].isDirectory()){
                File[] file = listFile[i].listFiles();
                for (File f : file) {
                    System.out.println(f.getName());
                }
            }
            System.out.println(listFile[i].getName());
        }
    }
}