package com.sparkchain.pojo.activity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sparkchain.pojo.ActivityPerson;
import com.sparkchain.pojo.person.Person;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/19 17:56.
 */
@Entity
public class Activity implements Serializable {

    private Long id;

    private String  theme;

    private ActivityType activityType;

    private Date time;

    private String address;

    private String contact;

    private String phone;

    private ActivityStatus activityStatus;

    private String urlImage;

    @JsonManagedReference
    private List<ActivityPerson> activityPersonList;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id",referencedColumnName = "id")
    public ActivityType getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id",referencedColumnName = "id")
    public ActivityStatus getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(ActivityStatus activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @OneToMany(cascade = {CascadeType.DETACH}, fetch = FetchType.LAZY, mappedBy = "activity")
    public List<ActivityPerson> getActivityPersonList() {
        return activityPersonList;
    }

    public void setActivityPersonList(List<ActivityPerson> activityPersonList) {
        this.activityPersonList = activityPersonList;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", theme='" + theme + '\'' +
                ", activityType=" + activityType +
                ", time=" + time +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", phone='" + phone + '\'' +
                ", activityStatus=" + activityStatus +
                ", urlImage='" + urlImage + '\'' +
                '}';
    }
}
