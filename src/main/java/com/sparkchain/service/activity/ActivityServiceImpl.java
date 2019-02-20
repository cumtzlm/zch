package com.sparkchain.service.activity;

import com.sparkchain.dao.repository.ActivityRepository;
import com.sparkchain.pojo.activity.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/20 9:07.
 */
@Service
public class ActivityServiceImpl implements ActivityService{
    @Autowired
    ActivityRepository activityRepository;
    @Override
    public List<Activity> getAllActivity() {
        return activityRepository.findAll();
    }
}
