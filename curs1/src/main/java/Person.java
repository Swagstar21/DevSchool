import lombok.*;

@AllArgsConstructor
@Data
@Builder
public class Person {
    private String lastname, firstname;
    private int age;
    private String job;


}
