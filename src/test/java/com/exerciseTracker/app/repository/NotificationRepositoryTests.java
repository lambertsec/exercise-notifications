package com.exerciseTracker.app.repository;

import com.exerciseTracker.app.dto.PendingNotifications;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class NotificationRepositoryTests {





    @Test
    void returnsPendingNotifications() {
        assertInstanceOf(PendingNotifications.class, NotificationRepository.getPendingNotifications());
    }
}
