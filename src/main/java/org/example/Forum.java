package org.example;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private List<Topic> topics;
    private static Forum instance = new Forum();
    private Forum(){this.topics = new ArrayList<>();}


    public static Forum getInstance(){
        return instance;
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void getEntireForum(){
        for(Topic t : topics){
            System.out.println(t.getTitle());
            List<Comment> moderatedComments = t.getOnlyModeratedComments();
            for (int i = 0; i < moderatedComments.size(); i++) {

                System.out.println(moderatedComments.get(i).getMessage());
            }
        }
    }
    public static void main(String[] args) {
        Topic topic1 = new Topic("World", "Hello", TopicType.ANNOUNCEMENT);
        Topic topic2 = new Topic("Hi", "Gigi", TopicType.NEWS);
        Comment comment = new Comment("World", topic1);
        Comment comment2 = new Comment("Spania", topic2);
        comment.changeCommentState();
        comment2.changeCommentState();
        topic1.addComment(comment);
        topic2.addComment(comment2);
        getInstance().addTopic(topic1);
        getInstance().addTopic(topic2);


        getInstance().getEntireForum();
    }

}
