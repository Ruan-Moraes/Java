package edu.nelioalves.curso.exercicios.excs10.exc2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private int likes;
    private Comment[] comments = new Comment[2];

    public Post() {
    }

    public Post(Date moment, String title, String content, int likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void addComment(Comment comment) {
        for (int i = 0; i < comments.length; i++) {
            if (comments[i] == null) {
                comments[i] = comment;

                break;
            }
        }
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Comment[] getComments() {
        return comments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");

        for (Comment comment : comments) {
            if (comment != null) {
                sb.append(comment.getText() + "\n");
            }
        }

        return sb.toString();
    }
}
