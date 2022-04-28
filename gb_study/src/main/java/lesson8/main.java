package lesson8;

import lesson7.dataForecastPars.DailyForecasts;
import lesson8.dbConnection.DbConnection;
import lesson8.parseResponse.ParseResponse;

public class main {

    public static void main(String[] args) {

        DbConnection dbConnection = new DbConnection();
        ParseResponse parseResponse = new ParseResponse();

        for (DailyForecasts dailyForecast: parseResponse.getDailyForecasts()) {

            dbConnection.insertValue("St. Petersburg",
                    dailyForecast.getDate(),
                    dailyForecast.getDay().getIconPhrase(),
                    Double.parseDouble(dailyForecast.getTemperature().getMinimum().getValue()));

        }

        System.out.println(dbConnection.getValue("localDate","temperature", 70.0));

    }

}
