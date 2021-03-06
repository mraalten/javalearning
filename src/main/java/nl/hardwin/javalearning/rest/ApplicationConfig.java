package nl.hardwin.javalearning.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


@ApplicationPath("/hardwinbank")
public class ApplicationConfig extends Application {

    public ApplicationConfig() {
    }

    public Set<Class<?>> getClasses() {
        return new HashSet(Arrays.asList(new Class[]{BankResource.class}));
    }

}
