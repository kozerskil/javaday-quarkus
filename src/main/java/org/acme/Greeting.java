package org.acme;

import java.time.LocalDateTime;

public class Greeting {

    private String id;
    private String content;
    private LocalDateTime time;

    public Greeting() {
    }

    public Greeting(String id, String content, LocalDateTime now) {
        this.id = id;
        this.content = content;
        this.time = now;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
