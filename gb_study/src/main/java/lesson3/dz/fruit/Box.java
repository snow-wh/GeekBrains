package lesson3.dz.fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> boxList = new ArrayList<>();


    public void addFruitInBox(T fruit) {
        boxList.add(fruit);
    }

    public boolean compare(Box<? extends Fruit> anotherBox) {
        return this.boxList.size() * boxList.get(0).weight == anotherBox.boxList.size() * anotherBox.boxList.get(0).weight;
    }

    public void transfer(Box<T> anotherBox){
        this.boxList.addAll(anotherBox.boxList);
        anotherBox.boxList.clear();
    }

    public List<T> getBoxList(){
        return boxList;
    }


}
