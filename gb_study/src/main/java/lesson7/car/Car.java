package lesson7.car;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@JsonRootName(value = "Car")
public class Car {

    @JsonProperty(value = "color")
    private String color;
    @JsonProperty(value = "type")
    private String type;

}
