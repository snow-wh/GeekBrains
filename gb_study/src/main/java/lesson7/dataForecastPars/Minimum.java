package lesson7.dataForecastPars;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Minimum {

    @JsonProperty(value = "Value")
    private String value;
    @JsonProperty(value = "Unit")
    private String unit;
    @JsonProperty(value = "UnitType")
    private String unitType;

}
