package lesson7.dataForecastPars;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Temperature {

    @JsonProperty(value = "Minimum")
    private Minimum minimum;
    @JsonProperty(value = "Maximum")
    private Maximum maximum;

}
