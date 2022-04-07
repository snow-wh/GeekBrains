package lesson1.package1;

import lesson1.package2.Cat;

public class main2 {

   public static void changeCat(){
      Cat cat = Cat.getInstance("Русская голобая", "Алекстраза", "male", 3);
      cat.setColor("серый");
      System.out.println(cat);
   }
}
