package lesson2.dz.ex;

public class MyArrayDataException extends Exception{

    public MyArrayDataException(int i, int j){
        super("В ячейке " + i + " " + j + " элемент не является Int");
    }

}
