package com.exerciseTracker.app.dto;

import java.util.List;
import java.util.Objects;

public class PendingNotifications {

    private List<Notification> notificationList;

    public List<Notification> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<Notification> notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PendingNotifications that = (PendingNotifications) o;
        return Objects.equals(notificationList, that.notificationList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(notificationList);
    }
}
