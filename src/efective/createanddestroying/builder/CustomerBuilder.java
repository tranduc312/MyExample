package efective.createanddestroying.builder;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CustomerBuilder {

    private String name;

    private Integer age;

    private Integer salary;

}
