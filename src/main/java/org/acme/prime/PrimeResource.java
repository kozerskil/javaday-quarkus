package org.acme.prime;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("prime")
public class PrimeResource {

    @Inject
    private DataService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public PrimeRepresentation prime(@QueryParam("number") int number) {
        boolean prime = service.isPrime(number);
        System.out.printf("isPrime(%d)==%b%n", number, prime);
        return new PrimeRepresentation(number, prime);
    }
}
