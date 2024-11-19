package com.exerciseTracker.app.repository;

import com.exerciseTracker.app.dto.Notification;
import com.exerciseTracker.app.repository.mapper.NotificationsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class NotificationRepository {

    private static final String QUERY = """
            Select N.USER_NAME as USER_NAME,
            N.MESSAGE as MESSAGE,
            NT.NOTIFICATION_TYPE as NOTIFICATION_TYPE
            FROM PUBLIC.NOTIFICATION N
            LEFT JOIN PUBLIC.NOTIFICATION_TYPE NT on NT.NOTIFICATION_ID = N.NOTIFICATION_ID
            where  N.USER_NAME = ?
            """;

   private static JdbcTemplate jdbcTemplate;

    public static List<Notification> getPendingNotifications(String user) {

        return jdbcTemplate.query(QUERY, new NotificationsMapper(), user);
    }

    @Autowired
    public void notificationRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
