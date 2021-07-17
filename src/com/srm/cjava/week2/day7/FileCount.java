package week2.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileCount {

    private static final String FILE_PATH = "E:/SRMB1Corejava/src/com/srm/cjava/week2/day7/ReadFile.txt";

    public static void main(String args[]) throws IOException {
        FileUtil fileUtil1 = new FileUtil(FILE_PATH);
        System.out.println("No. of Characters in file: " + fileUtil1.getCharCount());
        FileUtil fileUtil2 = new FileUtil(FILE_PATH);
        System.out.println("No. of Vowels in file: " + fileUtil2.getVowelCount());
        FileUtil fileUtil3 = new FileUtil(FILE_PATH);
        System.out.println("No. of Words in file: " + fileUtil3.getWordCount());
    }
}

class FileUtil {

    static BufferedReader reader = null;

    public FileUtil(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        reader = new BufferedReader(input);
    }

    public int getCharCount() throws IOException {
        int charCount = 0;
        String data1;
        while ((data1 = reader.readLine()) != null) {
            System.out.println(data1);
            charCount += data1.length();
        }
        return charCount;
    }

    public int getVowelCount() throws IOException {
        int vowCount = 0;
        String data2;
        while ((data2 = reader.readLine()) != null) {
            String condata = data2.toLowerCase();
            for (int i = 0; i < condata.length(); i++) {
                if (condata.charAt(i) == 'a' || condata.charAt(i) == 'e' || condata.charAt(i) == 'i'
                        || condata.charAt(i) == 'o' || condata.charAt(i) == 'u') {
                    vowCount += 1;
                }
            }
        }
        return vowCount;
    }

    public int getWordCount() throws IOException{
        int wodCount = 0;
        String data3;
        while((data3 = reader.readLine())!= null){
            String[] word = data3.split(" ");
            wodCount+= word.length;
        }
        return wodCount;
    }
}
