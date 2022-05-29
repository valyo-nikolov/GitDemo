package lections.seventh;

import java.io.FileInputStream;
import java.io.IOException;
import java.rmi.RemoteException;

public class ThrowsExample {

    static FileInputStream file;
    static String fileName;

    public static void main(String[] args) throws IOException {
        fileName = "src/lections/seventh/text.txt";
        checkFile();
        checkThrowException();
    }

    static void checkFile() throws IOException {

        file = new FileInputStream(fileName);
        byte x = (byte) file.read();
    }

    static void checkThrowException() throws RemoteException {
        throw new RemoteException();
   //     throw new RuntimeException(); // this is unreachable statement
    }
}
