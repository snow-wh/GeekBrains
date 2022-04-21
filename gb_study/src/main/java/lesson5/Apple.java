package lesson5;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Apple implements Serializable {

    private String[] header;

    private String[][] values;

    private Map<String, List<String>> tables;

    public void save(){

    }

//    public Apple(String name, int weight) {
//
//        this.name = name;
//        this.weight = weight;
//
//    }
//
//    @Override
//    public String toString(){
//        return "Яблоко " + name + " " + weight;
//    }

}
