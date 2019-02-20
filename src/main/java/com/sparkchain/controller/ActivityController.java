package com.sparkchain.controller;

import com.sparkchain.pojo.activity.Activity;
import com.sparkchain.service.activity.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/20 9:05.
 */
@RestController
@RequestMapping("activity")
public class ActivityController {

    @Autowired
    ActivityService activityService;

    @RequestMapping("all")
    public List<Activity> getAllActivity(){
        return activityService.getAllActivity();
    }
}
