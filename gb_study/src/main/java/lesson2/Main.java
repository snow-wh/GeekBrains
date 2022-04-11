package lesson2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

//    public static int delenie(int a, int b) {
//
//        if (b == 22) {
//            throw new DivisionT022Exception();
//        }
//        return a / b;
//
//    }

    public static void createReport() throws IOException {

        PrintWriter printWriter = new PrintWriter("test.text");
        printWriter.close();
        int[] mas2 = {2,5,10};




//        try {
//            PrintWriter printWriter = new PrintWriter("test.text");
//            printWriter.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

    }


    public static void main(String[] args) {

        int b = 40;
        int a = 0;
        int c = 0;


        try (IOClass ioClass = new IOClass("gb top")) {

            ioClass.sout();

        }catch (IOException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


//        FileWriter fileWriter = null;
//
//        try {
//            fileWriter = new FileWriter("gb_study/src/main/java/lesson2/testLesson2.txt");
//            String text = "gb top students";
//
//            fileWriter.append(text);
//
//            c = b / a;
//
//            fileWriter.flush();
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("some code after");


//        try {
//            createReport();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        //  System.out.println(delenie(b,a));
//
//
//        int[] mas = {2,3,4};
//
//        int random = new Random().ints(1, 1, 6).findFirst().getAsInt();
//
//
//        try {
//
//            mas[random] = 25;
//            c=b/a;
//
//
//            System.out.println("вот этот кусок у нас не будет воспроизводиться");
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//            System.out.println(mas[mas.length-1]);
//
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//            a = 1;
//            c=b/a;
//        }finally {
//
//        }
//
//        System.out.println(c);

    }


}
