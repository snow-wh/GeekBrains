package lesson7.car;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CarrWrapper {

    @JsonProperty(value = "Car")
    private Car car;

}
