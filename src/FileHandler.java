import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {


    FileHandler() {
    }

    public static String[] bestWholeFileRead(String fileName) {
        String[] fileData;
        int lineCount = 0;
        ArrayList<String> names = new ArrayList<>();
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
                for (int i = 0; i < lineCount; i++) {
                    String line = br.readLine();
                    fileData[i] = line;
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        fileData = new String[lineCount];
        }

    }
