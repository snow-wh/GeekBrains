package lesson5;

import javax.annotation.processing.Filer;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) throws FileNotFoundException {


//        byte[] outData = "GeekBrains".getBytes();
//
//        ByteArrayInputStream in = new ByteArrayInputStream(outData);
//
//        int someValue;
//
//        List<Byte> inData = new ArrayList<>();
//
//        while ((someValue = in.read()) != -1){
//            inData.add(Byte.parseByte((Integer.toString(someValue))));
//        }
//
//        for (Byte byteToString : inData ) {
//            System.out.print((char) byteToString.intValue());
//        }


//        byte[] outData = "GeekBrains".getBytes();
//
//        File file = new File("test.txt");
//
//
//        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file))) {
//
//           // outputStream.write(outData);
//
//            for (byte outDataByte : outData) {
//                outputStream.write(outDataByte);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file))){
//
//            int x;
//            while ((x=inputStream.read()) !=-1){
//                System.out.print((char) x);
//            }
//
//        }catch (IOException e) {
//            e.printStackTrace();
//        }


//        Apple apple = new Apple("Анттоновка", 2);
//
//        byte[] appleByByte = null;
//
//
//        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
//             ObjectOutputStream objectOutputStream = new ObjectOutputStream(out)) {
//
//            objectOutputStream.writeObject(apple);
//            appleByByte = out.toByteArray();
//
//            System.out.println(Arrays.toString(appleByByte));
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (ByteArrayInputStream in = new ByteArrayInputStream(appleByByte);
//             ObjectInputStream objectInputStream = new ObjectInputStream(in)) {
//
//            Apple apple1 = (Apple) objectInputStream.readObject();
//
//            System.out.println(apple1.toString());
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }


//        SequenceInputStream sequenceInputStream = new SequenceInputStream(new FileInputStream(),new FileInputStream());
//
//        sequenceInputStream.read()

        File file = new File("test.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))) {
            writer.write("\nGeekBrains2");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            String[] strMass;
            while ((str = reader.readLine()) != null){
              //  System.out.println(str);
                strMass = str.split(";");
                System.out.println(Arrays.toString(strMass));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
