package lesson6;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import lesson6.jsonParse.Booking;
import lesson6.jsonParse.BookingClass;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class main {

    public static void main(String[] args) throws IOException {

        String lastNameTest = "Tr";
        String firstNameTest = "Es";
        

        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking/21";
        Response response = given()
                .when()
                .get();

        System.out.println(response.asPrettyString());

        System.out.println();

        Booking bookingClass = response.as(Booking.class);

        System.out.println(bookingClass.getFirstname());
        System.out.println(bookingClass.getLastname());

        try {
            if(bookingClass.getFirstname().equals(firstNameTest) && bookingClass.getLastname().equals(lastNameTest)){
                System.out.println("Тест пройден");
            }else {
                throw new NoCompareException(bookingClass.getFirstname(),bookingClass.getLastname());
            }


        }catch (NoCompareException e){
            e.printStackTrace();
        }

        System.out.println(bookingClass);

        




//        OkHttpClient client = new OkHttpClient();
//
//        Request request1 = new Request.Builder()
//                .url("https://gb.ru")
//                .build();
//
//        Response response1 = client.newCall(request1).execute();
//
//
//
//
//
//        Request request = new Request.Builder()
//                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/332287?apikey=0OOjKgEwzkAAFMinvVQvevQpWVBykWio&language=en")
//                .build();
//
//        Response response = client.newCall(request).execute();
//
//        System.out.println(response.body().string());


//        RestAssured.baseURI = "http://dataservice.accuweather.com/forecasts/v1/daily/5day/";
//        Response response = given()
//                .when()
//                .get("332287?apikey=0OOjKgEwzkAAFMinvVQvevQpWVBykWio&language=en");
//
//        JSONObject jsonObject = new JSONObject(response.asPrettyString());
//
//        Map<String, Object> map = jsonObject.toMap();
//
//
//        System.out.println();
//
//        List<DailyForecasts> dailyForecastsList = new ArrayList<>();
//
//        for (Map.Entry<String,Object>  entryMap : map.entrySet() ) {
//            if(entryMap.getKey().equals("DailyForecasts")){
//                for (Object object: (ArrayList<Object>)entryMap.getValue()) {
//                    dailyForecastsList.add((DailyForecasts)object);
//                }
//            }
//        }
//
//        System.out.println();
//
    }

}
