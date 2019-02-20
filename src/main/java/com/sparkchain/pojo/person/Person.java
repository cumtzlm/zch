package com.sparkchain.pojo.person;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sparkchain.pojo.ActivityPerson;
import com.sparkchain.pojo.company.Company;
import com.sparkchain.pojo.Level;
import com.sparkchain.pojo.Status;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/19 17:11.
 */
@Entity
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Person implements Serializable {

    private Long id;

    private String name;

    private String phone;

    private String idCardNo;

    private String introdution;

    private Company company;

    private Status status;

    private Level level;

    private String urlImageFront;

    private String urlImageBack;

    @JsonManagedReference
    private List<ActivityPerson> activityPersonList;

    @JsonManagedReference
    private List<PersonHistory> personHistoryList;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getIntrodution() {
        return introdution;
    }

    public void setIntrodution(String introdution) {
        this.introdution = introdution;
    }

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id",referencedColumnName = "id")
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id",referencedColumnName = "id")
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "level_id",referencedColumnName = "id")
    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getUrlImageFront() {
        return urlImageFront;
    }

    public void setUrlImageFront(String urlImageFront) {
        this.urlImageFront = urlImageFront;
    }

    public String getUrlImageBack() {
        return urlImageBack;
    }

    public void setUrlImageBack(String urlImageBack) {
        this.urlImageBack = urlImageBack;
    }

    @OneToMany(cascade = {CascadeType.DETACH}, fetch = FetchType.LAZY, mappedBy = "person")
    public List<PersonHistory> getPersonHistoryList() {
        return personHistoryList;
    }

    public void setPersonHistoryList(List<PersonHistory> personHistoryList) {
        this.personHistoryList = personHistoryList;
    }

    @OneToMany(cascade = {CascadeType.DETACH}, fetch = FetchType.LAZY, mappedBy = "person")
    public List<ActivityPerson> getActivityPersonList() {
        return activityPersonList;
    }

    public void setActivityPersonList(List<ActivityPerson> activityPersonList) {
        this.activityPersonList = activityPersonList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", introdution='" + introdution + '\'' +
                ", company=" + company +
                ", status=" + status +
                ", level=" + level +
                ", urlImageFront='" + urlImageFront + '\'' +
                ", urlImageBack='" + urlImageBack + '\'' +
                '}';
    }
}
