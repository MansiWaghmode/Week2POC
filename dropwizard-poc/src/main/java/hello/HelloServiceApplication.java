package hello;

import hello.resources.HelloResource;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class HelloServiceApplication extends Application<HelloServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "HelloService";
    }

    @Override
    public void initialize(final Bootstrap<HelloServiceConfiguration> bootstrap) {
        // TODO: application initialization

    }

    @Override
    public void run(final HelloServiceConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        environment.jersey().register(new HelloResource(configuration.getGreeting()));
    }

}
