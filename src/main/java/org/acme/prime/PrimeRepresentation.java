package org.acme.prime;

public class PrimeRepresentation {

    private int number;
    private boolean prime;

    public PrimeRepresentation(int number, boolean prime) {
        this.number = number;
        this.prime = prime;
    }

    public int getNumber() {
        return number;
    }

    public boolean isPrime() {
        return prime;
    }
}
