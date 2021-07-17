package week2.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LowerUpper {
    private static final String FILE_PATH = "E:/SRMB1Corejava/src/com/srm/cjava/week2/day7/ReadFile.txt";
    public static void main(String[] args) throws IOException {
        FileWrite filewrite1 = new FileWrite(FILE_PATH);
        System.out.println("Writing UpperCase file");
        filewrite1.createUpperCaseFile();

        FileWrite filewrite2 = new FileWrite(FILE_PATH);
        System.out.println("Writing LowerCase file");
        filewrite2.createLowerCaseFile();

    }
}

class FileWrite{
    static BufferedReader reader = null;

    public FileWrite(String path) throws FileNotFoundException{
        File file = new File(path);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        reader = new BufferedReader(input);
    }

    public void createUpperCaseFile() throws IOException{
        String data1;
        FileOutputStream fos1 = new FileOutputStream("UpperCase.txt");
        while((data1 = reader.readLine())!= null){
            String Updata = data1.toUpperCase();
            byte[] bt1 = Updata.getBytes();
            fos1.write(bt1);
        }
        System.out.println("File created for UpperCase!");
        fos1.close();
    }

    public void createLowerCaseFile() throws IOException{
        String data2;
        FileOutputStream fos2 = new FileOutputStream("LowerCase.txt");
        while((data2 = reader.readLine())!= null){
            String Lwdata = data2.toLowerCase();
            byte[] bt2 = Lwdata.getBytes();
            fos2.write(bt2);
        }
        System.out.println("File created for LowerCase!");
        fos2.close();
    }
}
