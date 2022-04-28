package lesson7;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lesson7.car.Car;
import lesson7.car.CarrWrapper;
import lesson7.dataForecastPars.DailyForecasts;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;


public class psvm {


    @SneakyThrows
    public static void main(String[] args) {

//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
//
//
//
//       // String[] str = {"df","dsf","sdgdfhs"};
//
//        Car car = new Car("white", "sportCar");
//
//        System.out.println(objectMapper.writer().withDefaultPrettyPrinter().writeValueAsString(car));
//
//
//        String json ="{\"Car\":{\"color\":\"white\",\"type\":\"sportCar\"}}";
//
//        JsonNode jsonNode = objectMapper
//                .readTree(json)
//                .at("/Car");
//
//        if(jsonNode.isArray())
//            if(jsonNode.isObject())
//
//        System.out.println(jsonNode.toString());
//
//
//        System.out.println(json);
//
//        CarrWrapper car1 = objectMapper.readValue(json,CarrWrapper.class);
//
//
//
//        System.out.println(car1);

        RestAssured.baseURI = "http://dataservice.accuweather.com/";
        Response response = given()
                .when()
                .get("forecasts/v1/daily/5day/332287?apikey=yODGgbTvYC5fkSQNmG0rOnvPB1V8vo89");

        System.out.println(response.asPrettyString());

        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode = objectMapper
                .readTree(response.asPrettyString())
                .at("/DailyForecasts");

        List<DailyForecasts> dailyForecasts = new ArrayList<>();

        if(jsonNode.isArray()){
            for (JsonNode arrayItem : jsonNode) {
                dailyForecasts.add(objectMapper.convertValue(arrayItem,DailyForecasts.class));
            }

        }

        for (DailyForecasts dailyForecast : dailyForecasts) {
            System.out.println("В Санкт-Петербурге " + dailyForecast.getDate() + " максимальная темпиратура " +
                    dailyForecast.getTemperature().getMaximum().getValue() + " минимальная темпиратура " +
                    dailyForecast.getTemperature().getMinimum().getValue());
        }


        

    }

}
