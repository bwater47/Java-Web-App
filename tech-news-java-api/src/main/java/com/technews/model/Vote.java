package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "vote")
public class Vote implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer userId;
    private Integer postId;

    public Vote() {
    }

    public Vote(Integer id, Integer userId, Integer postId) {
        this.id = id;
        this.userId = userId;
        this.postId = postId;
    }

    public Vote(Integer userId, Integer postId) {
        this.userId = userId;
        this.postId = postId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Vote vote = (Vote) object;
        return java.util.Objects.equals(id, vote.id) && java.util.Objects.equals(userId, vote.userId) && java.util.Objects.equals(postId, vote.postId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, userId, postId);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Vote{" +
                "id=" + id +
                ", userId=" + userId +
                ", postId=" + postId +
                '}';
    }
}