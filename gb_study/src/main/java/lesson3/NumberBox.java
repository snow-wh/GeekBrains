package lesson3;

import java.util.ArrayList;
import java.util.List;

public class NumberBox<T extends Number>{

    private List<T> listNumber = new ArrayList<>();

    public NumberBox() {
    }

    public NumberBox(List<T> listNumber){
        this.listNumber = listNumber;
    }

    public void addIntegerNumber(T number){
        listNumber.add(number);
    }

    public double getAverageValue(){

        int sum = 0;

        for (T number : listNumber) {
            sum +=number.intValue();
        }
        return sum/listNumber.size();

    }

    public boolean comparisonOfAverages(NumberBox<? extends Number> anotherBox){
        return this.getAverageValue() == anotherBox.getAverageValue();
    }

    public void addBoxToBox(NumberBox<T> anotherBox){

        this.listNumber.addAll(anotherBox.listNumber);
        anotherBox.listNumber.clear();
    }

    public List<T> getListNumber(){
        return listNumber;

    }



}
