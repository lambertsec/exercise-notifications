package com.exerciseTracker.app.repository.mapper;

import com.exerciseTracker.app.dto.Notification;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class NotificationsMapper implements RowMapper<Notification> {


    @Override
    public Notification mapRow(ResultSet rs, int rowNum) throws SQLException {

            Notification notification = new Notification();
            notification.setUser(rs.getString("USER_NAME"));
            notification.setMessage(rs.getString("MESSAGE"));
            notification.setNotificationType(rs.getString("NOTIFICATION_TYPE"));


        return notification;
    }
}
