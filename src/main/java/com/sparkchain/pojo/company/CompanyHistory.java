package com.sparkchain.pojo.company;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sparkchain.pojo.Level;
import com.sparkchain.pojo.Status;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 张立明
 * @date 2019/2/19 17:40.
 */
@Entity
public class CompanyHistory {
    private Long id;

    @JsonBackReference
    private Company company;

    private String companyName;

    private String companyNo;

    private String companySimpleName;

    private String legalPersonName;

    private String legalPersonPhone;

    private String legalPersonIdCardNo;

    private String logo;

    private String license;

    private String applicationForm;

    private Date onChainHistoryTime;

    private Status status;

    private Level level;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(cascade = {CascadeType.DETACH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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

    @Override
    public String toString() {
        return "CompanyHistory{" +
                "id=" + id +
                ", company=" + company +
                ", companyName='" + companyName + '\'' +
                ", companyNo='" + companyNo + '\'' +
                ", companySimpleName='" + companySimpleName + '\'' +
                ", legalPersonName='" + legalPersonName + '\'' +
                ", legalPersonPhone='" + legalPersonPhone + '\'' +
                ", legalPersonIdCardNo='" + legalPersonIdCardNo + '\'' +
                ", logo='" + logo + '\'' +
                ", license='" + license + '\'' +
                ", applicationForm='" + applicationForm + '\'' +
                ", onChainHistoryTime=" + onChainHistoryTime +
                ", status=" + status +
                ", level=" + level +
                '}';
    }
}
