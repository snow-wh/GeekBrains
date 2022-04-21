package lesson6;

public class NoCompareException extends Exception {

    public NoCompareException(String firsName, String lastName){
        super(firsName + " и " +lastName  + " Из запроса не соответсвуют тестовым" );
    }

}
