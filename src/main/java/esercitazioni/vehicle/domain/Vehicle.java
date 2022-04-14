package esercitazioni.vehicle.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Document(collection = "Vehicle")
public class Vehicle {

    @Id
    private String id;

    private String brand;
    private String model;
    private String modelYear;
}
