package org.acme;

import java.net.MalformedURLException;
import java.net.URL;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.prime.DataService;
import org.acme.prime.SpringService;
import org.eclipse.microprofile.rest.client.RestClientBuilder;

@Path("/hello")
public class ExampleResource {

    @Inject
    private DataService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting hello() throws MalformedURLException {
        SpringService service = RestClientBuilder.newBuilder()
            .baseUrl(new URL("http://localhost:8081"))
            .build(SpringService.class);
        Greeting greetings = service.getGreetings();
        return greetings;
    }
}
