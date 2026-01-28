package hello.resources;

import java.util.Map;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloResource {
    
    private final String greeting;

    public HelloResource(String greeting){
        this.greeting = greeting;
    }

    @GET
    public Map<String,String> hello(@QueryParam("name") String name){
        return Map.of("message",greeting + " " + name);
    }
}
