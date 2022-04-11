package lesson2;

public class DivisionT022Exception extends  ArithmeticException{

    private static String str = "Деление на 22 строго запрещено";

    public DivisionT022Exception() {
        super(str);
    }

    public DivisionT022Exception(String s) {
        super(s);
    }

}
