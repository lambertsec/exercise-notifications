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

    @Autowired
    private static JdbcTemplate jdbcTemplate;

    public static List<Notification> getPendingNotifications(String user) {

        return jdbcTemplate.query("Select * FROM dbo.NOTIFICATIONS where USER = ?",new Object[]{user}, new NotificationsMapper());
    }




    void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
