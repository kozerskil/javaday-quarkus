package org.acme.prime;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.BadRequestException;

@RequestScoped
public class DataService {

    public boolean isPrime(int number) {
        if (number < 0) {
            throw new BadRequestException();
        }
        if (number < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
