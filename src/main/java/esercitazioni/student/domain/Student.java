package esercitazioni.student.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Document(collection = "student")
public class Student {

    @Id
    private String id;

    private String name;
    private String lastname;
    private String facolta;
}
