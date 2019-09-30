package org.acme;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class Greeting {

    private final String id;
    private final String content;
    private final LocalDateTime time;
}
