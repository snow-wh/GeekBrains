package lesson4;

import java.util.*;

public class main {

    public static void main(String[] args) {


        String str1 = "sdf";

        int i = 5;


        Apple apple1 = new Apple(10,"1");

        Map<String,List<String>> map = new HashMap<>();

        map.put("Человек1", new ArrayList<>(Arrays.asList("8921213820" ,"8921213820")));
        map.put("Человек2", new ArrayList<>(Arrays.asList("8921213820")));

       if(map.containsKey("Человек1"))
           System.out.println("Такой человек есть");
       if(map.containsValue("8921213820"))
           System.out.println("Такой номер есть");


        for (Map.Entry<String,List<String>> entry : map.entrySet() ) {
            for (String str  : entry.getValue() ) {
                System.out.println(entry.getKey() + " - " +  str);
            }

        }

        for (String key : map.keySet() ) {
            for (String str : map.get(key)) {
                System.out.println(key + " - " +  str);
            }

        }

        for (List<String> key : map.values() ) {
            for (String str : key) {
                System.out.println(map + " - " +  str);
            }

        }

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        Iterator<Integer> iterator = list.iterator();

        int sum = 0;

        while (iterator.hasNext()){

            sum += iterator.next();

            iterator.remove();

        }

        System.out.println(sum);
        System.out.println(list);












//        LinkedHashSet<Apple> stringSet = new LinkedHashSet<>();
//        HashSet<Apple> stringSet2 = new HashSet<>();
//        TreeSet<Apple> stringSet3 = new TreeSet<>();
//
//        Apple apple1 = new Apple(10,"1");
//        Apple apple2 = new Apple(500,"2");
//        Apple apple3 = new Apple(50,"3");
//        Apple apple4 = new Apple(20, "4");
//
//
//        stringSet.add(apple1);
//        stringSet.add(apple2);
//        stringSet.add(apple3);
//        stringSet.add(apple4);
//
//        stringSet2.add(apple1);
//        stringSet2.add(apple2);
//        stringSet2.add(apple3);
//        stringSet2.add(apple4);
//
//        stringSet3.add(apple1);
//        stringSet3.add(apple2);
//        stringSet3.add(apple3);
//        stringSet3.add(apple4);
//
//
//
//        for (Apple someInt : stringSet) {
//            System.out.println(someInt);
//        }
//        System.out.println("------------");
//        for (Apple someInt : stringSet2) {
//            System.out.println(someInt);
//        }
//        System.out.println("------------");
//        for (Apple someInt : stringSet3) {
//            System.out.println(someInt);
//        }



    }

    public static boolean isInteger(String s) {
        try {
            s.matches("[-+]?\\d+");
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}
