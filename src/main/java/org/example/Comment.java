package org.example;

import java.time.LocalDateTime;

public class Comment extends Post {
    private boolean moderated;
    private Topic topic;

    public Topic getTopic() {
        return topic;
    }
    public boolean isModerated() {
        return moderated;
    }

    public Comment( String message, Topic topic) {
        super( message);
            this.topic = topic;
            this.moderated = false;
        }

    public void changeCommentState(){
        this.moderated = !moderated;
    }
}
