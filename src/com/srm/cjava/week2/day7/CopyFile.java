package week2.day7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile{

    public static void main(String[] args) {

        File sourceFile = new File("E:/SRMB1Corejava/src/com/srm/cjava/week2/day7/ReadFile.txt");
        File destFile = new File("E:/SRMB1Corejava/src/com/srm/cjava/week2/day7/WriteFile.txt");
        if (!destFile.exists()) {
            try {
                destFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        InputStream input = null;
        OutputStream output = null;

        try {
            input = new FileInputStream(sourceFile);
            output = new FileOutputStream(destFile);

            byte[] buf = new byte[1024];
            int bytesRead;

            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
            }
            System.out.println("File Copied.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            try {

                if (null != input) {
                    input.close();
                }

                if (null != output) {
                    output.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
