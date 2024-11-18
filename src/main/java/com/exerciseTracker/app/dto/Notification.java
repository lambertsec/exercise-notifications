package com.exerciseTracker.app.dto;

import java.util.Objects;

public class Notification {

    private String notificationType;
    private String message;
    private String User;

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return Objects.equals(notificationType, that.notificationType) && Objects.equals(message, that.message) && Objects.equals(User, that.User);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationType, message, User);
    }
}
