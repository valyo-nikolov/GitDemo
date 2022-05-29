package lections.seventh;

import java.io.FileInputStream;
import java.io.IOException;

public class CatchingMultipleExceptions {

    static FileInputStream file;
    static String fileName;

    public static void main(String[] args) {
        fileName = "src/lections/seventh/text.txt";
        System.out.println("Is it true: " + checkFile());
    }

    static boolean checkFile() {
        try {
            System.out.println("Within the try clause");
            file = new FileInputStream(fileName);
            byte x = (byte) file.read();
        } catch (IOException ioe) {
            System.out.println("Into IOException catch clause");
            ioe.printStackTrace();
            return false;
        } catch (NullPointerException npe) {
            System.out.println("Into NullPointerException catch clause");
            npe.printStackTrace();
            return false;
        } finally
        {
            System.out.println("This is within the final block");
        }
        System.out.println("This is after protected code print.");
        return true;
    }

}
