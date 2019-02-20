package com.sparkchain.pojo.company;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sparkchain.pojo.Level;
import com.sparkchain.pojo.Status;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author 张立明
 * @date 2019/2/19 17:40.
 */
@Entity
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Company implements Serializable {
    private Long id;

    private String companyName;

    private String companyNo;

    private String companySimpleName;

    private String legalPersonName;

    private String legalPersonPhone;

    private String legalPersonIdCardNo;

    private String logo;

    private String license;

    private String applicationForm;

    private Status status;

    private Level level;

    @JsonManagedReference
    private List<CompanyHistory> companyHistoryList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }

    public String getCompanySimpleName() {
        return companySimpleName;
    }

    public void setCompanySimpleName(String companySimpleName) {
        this.companySimpleName = companySimpleName;
    }

    public String getLegalPersonName() {
        return legalPersonName;
    }

    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
    }

    public String getLegalPersonPhone() {
        return legalPersonPhone;
    }

    public void setLegalPersonPhone(String legalPersonPhone) {
        this.legalPersonPhone = legalPersonPhone;
    }

    public String getLegalPersonIdCardNo() {
        return legalPersonIdCardNo;
    }

    public void setLegalPersonIdCardNo(String legalPersonIdCardNo) {
        this.legalPersonIdCardNo = legalPersonIdCardNo;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getApplicationForm() {
        return applicationForm;
    }

    public void setApplicationForm(String applicationForm) {
        this.applicationForm = applicationForm;
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

    @OneToMany(cascade = {CascadeType.DETACH}, fetch = FetchType.LAZY, mappedBy = "company")
    public List<CompanyHistory> getCompanyHistoryList() {
        return companyHistoryList;
    }

    public void setCompanyHistoryList(List<CompanyHistory> companyHistoryList) {
        this.companyHistoryList = companyHistoryList;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", companyNo='" + companyNo + '\'' +
                ", companySimpleName='" + companySimpleName + '\'' +
                ", legalPersonName='" + legalPersonName + '\'' +
                ", legalPersonPhone='" + legalPersonPhone + '\'' +
                ", legalPersonIdCardNo='" + legalPersonIdCardNo + '\'' +
                ", logo='" + logo + '\'' +
                ", license='" + license + '\'' +
                ", applicationForm='" + applicationForm + '\'' +
                ", status=" + status +
                ", level=" + level +
                '}';
    }
}
