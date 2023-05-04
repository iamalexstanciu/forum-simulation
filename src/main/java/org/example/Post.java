package org.example;

import java.time.LocalDateTime;
import java.util.UUID;

public class Post {
    private LocalDateTime creationTime;

    public String getMessage() {
        return message;
    }

    private String message;
    private UUID id;

    public Post(String message) {
        this.creationTime = LocalDateTime.now();
        this.message = message;
        this.id = UUID.randomUUID();
    }
}
