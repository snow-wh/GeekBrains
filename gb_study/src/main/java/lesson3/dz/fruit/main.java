package lesson3.dz.fruit;

public class main {

    public static void main(String[] args) {

        Box<Orange> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();

        box1.addFruitInBox(new Orange());
        box1.addFruitInBox(new Orange());
        box1.addFruitInBox(new Orange());

        box3.addFruitInBox(new Orange());
        box3.addFruitInBox(new Orange());
        box3.addFruitInBox(new Orange());

        box2.addFruitInBox(new Apple());
        box2.addFruitInBox(new Apple());
        box2.addFruitInBox(new Apple());


        System.out.println(box1.compare(box3));
        System.out.println("-----------------");
        System.out.println(box1.compare(box2));


        box1.transfer(box3);

        System.out.println(box1.getBoxList());
        System.out.println("-----------------");
        System.out.println(box3.getBoxList());


    }

}
