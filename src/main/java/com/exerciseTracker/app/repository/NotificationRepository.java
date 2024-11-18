package com.exerciseTracker.app.repository;

import com.exerciseTracker.app.dto.PendingNotifications;

public class NotificationRepository {
    public static Object getPendingNotifications() {

        return new PendingNotifications();
    }
}
