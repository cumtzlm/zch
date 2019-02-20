package com.sparkchain.pojo.person;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sparkchain.pojo.Level;
import com.sparkchain.pojo.Status;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 张立明
 * @date 2019/2/19 17:11.
 */
@Entity
public class PersonHistory {

    private Long id;

    @JsonBackReference
    private Person person;

    private String name;

    private String phone;

    private String idCardNo;

    private String introdution;

    private Date onChainHistoryTime;

    private Status status;

    private Level level;

    private String urlImageFront;

    private String urlImageBack;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(cascade = {CascadeType.DETACH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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

    public Date getOnChainHistoryTime() {
        return onChainHistoryTime;
    }

    public void setOnChainHistoryTime(Date onChainHistoryTime) {
        this.onChainHistoryTime = onChainHistoryTime;
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

    @Override
    public String toString() {
        return "PersonHistory{" +
                "id=" + id +
                ", person=" + person +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", introdution='" + introdution + '\'' +
                ", onChainHistoryTime=" + onChainHistoryTime +
                ", status=" + status +
                ", level=" + level +
                ", urlImageFront='" + urlImageFront + '\'' +
                ", urlImageBack='" + urlImageBack + '\'' +
                '}';
    }
}
