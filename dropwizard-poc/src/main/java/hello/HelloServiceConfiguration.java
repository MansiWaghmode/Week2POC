package hello;

import io.dropwizard.core.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import jakarta.validation.constraints.*;

public class HelloServiceConfiguration extends Configuration {
    // TODO: implement service configuration
    @JsonProperty
    private String greeting;

    public String getGreeting(){
        return greeting;
    }

}
