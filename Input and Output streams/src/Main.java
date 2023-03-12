import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        try {
            fileIn = new FileInputStream("/home/senaid/Desktop/text.txt");
            fileOut = new FileOutputStream("/home/senaid/Desktop/copy.txt");

            int content;
            while ((content = fileIn.read()) != -1){
                fileOut.write((byte) content);
            }
        }finally {
            if(fileIn != null){
                fileIn.close();
            }
            if(fileOut != null){
                fileOut.close();
            }
        }

    }
}