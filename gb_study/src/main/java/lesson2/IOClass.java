package lesson2;

import java.io.FileWriter;
import java.io.IOException;

public class IOClass implements AutoCloseable{

    private FileWriter fileWriter;

    IOClass (String str) throws IOException {

        FileWriter fileWriter = new FileWriter("gb_study/src/main/java/lesson2/testLesson2.txt");
        String text = "gb top students";

        fileWriter.append(text);

        fileWriter.flush();
    }

    public void sout(){
        System.out.println("HI");
    }



    @Override
    public void close() throws Exception {
        fileWriter.close();
    }


}
