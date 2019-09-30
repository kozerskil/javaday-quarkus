package org.acme;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class DataService {

    public String bar(String msg) {
        return String.format("'%s'", msg);
    }
}
