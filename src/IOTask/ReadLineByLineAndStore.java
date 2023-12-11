package IOTask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLineAndStore {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String strLine = "";
        String str_data = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\projects\\JavaTask\\src\\IOTask\\text.csv"));
            while (strLine != null){
                if(strLine == null)
                    break;
                str_data += strLine;
                strLine = bufferedReader.readLine();
            }
            System.out.println(str_data+"\n");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
