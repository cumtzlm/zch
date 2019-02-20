package com.sparkchain.pojo.project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sparkchain.pojo.person.Person;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/19 18:00.
 */
@Entity
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class ProjectPool implements Serializable {

    private Long id;

    private String name;

    private String introdution;

    private Date createTime;

    private ProjectPoolStatus projectPoolStatus;

    private Person person;

    @JsonManagedReference
    private List<Project> projectList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getIntrodution() {
        return introdution;
    }

    public void setIntrodution(String introdution) {
        this.introdution = introdution;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id",referencedColumnName = "id")
    public ProjectPoolStatus getProjectPoolStatus() {
        return projectPoolStatus;
    }

    public void setProjectPoolStatus(ProjectPoolStatus projectPoolStatus) {
        this.projectPoolStatus = projectPoolStatus;
    }

    @OneToMany(cascade = {CascadeType.DETACH}, fetch = FetchType.LAZY, mappedBy = "projectPool")
    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id",referencedColumnName = "id")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "ProjectPool{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", introdution='" + introdution + '\'' +
                ", createTime=" + createTime +
                ", projectPoolStatus=" + projectPoolStatus +
                '}';
    }
}
