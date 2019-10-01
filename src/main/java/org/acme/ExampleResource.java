package org.acme;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.prime.DataService;

@Path("/hello")
public class ExampleResource {

    @Inject
    private DataService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting hello() {
        return new Greeting(
            UUID.randomUUID().toString(),
            "Greetings from Quarkus!",
            LocalDateTime.now()
        );
    }
}
