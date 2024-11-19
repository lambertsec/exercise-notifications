package com.exerciseTracker.app.service;

import com.exerciseTracker.app.dto.Notification;
import com.exerciseTracker.app.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;


    public Optional<List<Notification>> getPendingNotifications(String user){
        return Optional.of(notificationRepository.getPendingNotifications(user));
    }

}
