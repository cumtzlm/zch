package com.sparkchain.pojo.project;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sparkchain.pojo.person.Person;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 张立明
 * @date 2019/2/19 17:59.
 */
@Entity
public class Project implements Serializable{

    private Long id;

    private String name;

    @JsonBackReference
    private ProjectPool projectPool;

    private String projectCompany;

    private String projectCreateBy;

    private Date createTime;

    private ProjectStatus projectStatus;

    private ProjectStage projectStage;

    private String introdution;

    private Person person;

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

    @ManyToOne(cascade = {CascadeType.DETACH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "project_pool_id", referencedColumnName = "id")
    public ProjectPool getProjectPool() {
        return projectPool;
    }

    public void setProjectPool(ProjectPool projectPool) {
        this.projectPool = projectPool;
    }

    public String getProjectCompany() {
        return projectCompany;
    }

    public void setProjectCompany(String projectCompany) {
        this.projectCompany = projectCompany;
    }

    public String getProjectCreateBy() {
        return projectCreateBy;
    }

    public void setProjectCreateBy(String projectCreateBy) {
        this.projectCreateBy = projectCreateBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id",referencedColumnName = "id")
    public ProjectStatus getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(ProjectStatus projectStatus) {
        this.projectStatus = projectStatus;
    }

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "project_stage_id",referencedColumnName = "id")
    public ProjectStage getProjectStage() {
        return projectStage;
    }

    public void setProjectStage(ProjectStage projectStage) {
        this.projectStage = projectStage;
    }

    public String getIntrodution() {
        return introdution;
    }

    public void setIntrodution(String introdution) {
        this.introdution = introdution;
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
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", projectPool=" + projectPool +
                ", projectCompany='" + projectCompany + '\'' +
                ", projectCreateBy='" + projectCreateBy + '\'' +
                ", createTime=" + createTime +
                ", projectStatus=" + projectStatus +
                ", projectStage=" + projectStage +
                ", introdution='" + introdution + '\'' +
                '}';
    }
}
