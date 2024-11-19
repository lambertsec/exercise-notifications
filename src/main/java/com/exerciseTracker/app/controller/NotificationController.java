package com.exerciseTracker.app.controller;

import com.exerciseTracker.app.dto.Notification;
import com.exerciseTracker.app.service.NotificationService;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class NotificationController {

    @Autowired
    private NotificationService notificationService;



    @GetMapping("/notification/{user}")
    ResponseEntity<Optional<List<Notification>>> getNotifications(@PathVariable("user") String user) {
        if(StringUtils.isEmpty(user)) {
            return new ResponseEntity<>(Optional.of(new ArrayList<Notification>()), HttpStatus.BAD_REQUEST);

        }
        return new ResponseEntity<>(notificationService.getPendingNotifications(user), HttpStatus.OK);



    }

}
