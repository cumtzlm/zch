package com.sparkchain.service.activity;

import com.sparkchain.pojo.activity.Activity;

import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/20 9:07.
 */
public interface ActivityService {
    List<Activity> getAllActivity();

    List<Activity> getActivityByTypeAndPerson();
}
