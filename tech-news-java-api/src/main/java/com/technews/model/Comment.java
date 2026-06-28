package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "comment")
public class Comment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String commentText;
    private Integer userId;
    private Integer postId;

    public Comment() {
    }

    public Comment(Integer id, Integer postId, Integer userId, String commentText) {
        this.id = id;
        this.postId = postId;
        this.userId = userId;
        this.commentText = commentText;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Comment comment = (Comment) object;
        return java.util.Objects.equals(id, comment.id) && java.util.Objects.equals(commentText, comment.commentText) && java.util.Objects.equals(userId, comment.userId) && java.util.Objects.equals(postId, comment.postId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, commentText, userId, postId);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Comment{" +
                "id=" + id +
                ", commentText='" + commentText + '\'' +
                ", userId=" + userId +
                ", postId=" + postId +
                '}';
    }
}