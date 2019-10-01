package org.acme;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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

    @GET
    @Path("foo")
    @Produces(MediaType.TEXT_PLAIN)
    public Response foo(@QueryParam("msg") String msg) {
        return Response.ok(service.bar(msg)).build();
    }
}
