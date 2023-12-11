package IOTask;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class IOFiles {

    public static void main(String[] args) throws Throwable {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader(new File("C:\\projects\\JavaTask\\src\\IOTask\\text.txt"));
            out = new FileWriter("C:\\projects\\JavaTask\\src\\IOTask\\textout.txt");

            int c;
            while ((c = in.read()) != -1) {
                System.out.println("value : " + (char) c);
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
