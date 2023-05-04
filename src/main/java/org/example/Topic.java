package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Topic extends  Post{


    private List<Comment> comments;

    public String getTitle() {
        return title;
    }

    public TopicType getTopicType() {
        return topicType;
    }

    private String title;
    private TopicType topicType;

    public Topic(String message, String title, TopicType topicType) {
        super( message);
            this.comments = new ArrayList<>();
            this.title = title;
            this.topicType = topicType;
    }
    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment){
       comments.add(comment);
    }
    public List<Comment> getOnlyModeratedComments(){
        List<Comment> moderatedComments = new ArrayList<>();
        for(Comment c : comments){
            if(c.isModerated()){
                moderatedComments.add(c);
            }
        }
        return moderatedComments;
    }
}
