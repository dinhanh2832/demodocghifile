import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class kdsjfsdf {
    public static void main(String[] args) throws IOException {
        BufferedReader bFile1 = new BufferedReader(new FileReader("demo.txt"));
        String line;
        while ((line = bFile1.readLine()) != null) {
            System.out.println(line);
        }
    }
}
