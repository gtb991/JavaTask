package IOTask;

import java.io.*;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class IOFiles {

    public static void main(String[] args) throws Exception {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader(new File("C:\\javaxAutomation\\inPut.txt"));
            out = new FileWriter("C:\\javaxAutomation\\outPut.txt");

            int c;
            while ((c = in.read()) != -1) {
//                System.out.println("value : " + (char) c);
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }

        Path path = Paths.get("C:\\javaxAutomation\\inPut.txt");
        List<String> contents = Files.readAllLines(path);
        for (String content : contents) {
//            System.out.println(content);
        }

        FileReader fileReader = new FileReader("C:\\javaxAutomation\\inPut.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int i;
        while ((i = bufferedReader.read()) != -1) ;
        System.out.println((char) i);
         bufferedReader.close();
         fileReader.close();


        FileInputStream inputStream = new FileInputStream("C:\\javaxAutomation\\inPut.txt");
        ReadableByteChannel source = inputStream.getChannel();
        FileOutputStream outputStream = new FileOutputStream("C:\\javaxAutomation\\outPut.txt");
        WritableByteChannel destination = outputStream.getChannel();
//        copyData(source,destination);
        source.close();
        destination.close();

    
    }
}
