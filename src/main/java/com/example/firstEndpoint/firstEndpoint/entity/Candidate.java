package com.example.firstEndpoint.firstEndpoint.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tblcandidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer srno;
    private String firstname;
    private String lastname;
    private String emailid;
    private Boolean genderid;
    private String contactnumber;
    private Integer qualificationid;
    private String specialization;
    private Short locationid;
    private Boolean workexpyr;
    private Boolean workexpmonth;
    private Integer candidatedob;
    private Float currentsalary;
    private Float salaryexpectation;
    private String resume;
    private String resumefilename;
    private Boolean willingtorelocate;
    private String lastorganisation;
    private String currentstatus;
    private Integer noticeperiod;
    private Integer currencyid;
    private String slug;
    private String authid;
    private Integer resumeupdatedon;
    private Integer resumeupdaterequestedon;
    private Boolean requestresumelinkstatus;
    private Integer resumeaddedon;
    private String profilepic;
    private String profilefacebook;
    private String profilegithub;
    private String profiletwitter;
    private String profilelinkedin;
    private Boolean deleted;
    private Integer ownerid;
    private Integer accountid;
    private Integer createdby;
    private Integer createdon;
    private Integer updatedby;
    private Integer updatedon;
    private String locality;
    private String city;
    private String state;
    private String country;
    private Integer lng;
    private Integer relevantexperience;
    private String position;
    private String canaccess;
    private Integer availablefrom;
    private String salarytype;
    private String source;
    private String sourceadded;
    private String languageskills;
    private String skill;
    private Boolean isduplicate;
    private String address;
    private Integer lat;
    private Integer sourceid;
    private String migration_reserved1;
    private String migration_reserved2;
    private Boolean email_opt_out;
    private String profilexing;
    private Boolean unavailable;
    private Integer availability_updated_by;
    private String sovren_document_id;

    public Candidate(){

    }

    public Candidate(Long id, Integer srno, String firstname, String lastname, String emailid, Boolean genderid, String contactnumber, Integer qualificationid, String specialization, Short locationid, Boolean workexpyr, Boolean workexpmonth, Integer candidatedob, Float currentsalary, Float salaryexpectation, String resume, String resumefilename, Boolean willingtorelocate, String lastorganisation, String currentstatus, Integer noticeperiod, Integer currencyid, String slug, String authid, Integer resumeupdatedon, Integer resumeupdaterequestedon, Boolean requestresumelinkstatus, Integer resumeaddedon, String profilepic, String profilefacebook, String profilegithub, String profiletwitter, String profilelinkedin, Boolean deleted, Integer ownerid, Integer accountid, Integer createdby, Integer createdon, Integer updatedby, Integer updatedon, String locality, String city, String state, String country, Integer lng, Integer relevantexperience, String position, String canaccess, Integer availablefrom, String salarytype, String source, String sourceadded, String languageskills, String skill, Boolean isduplicate, String address, Integer lat, Integer sourceid, String migration_reserved1, String migration_reserved2, Boolean email_opt_out, String profilexing, Boolean unavailable, Integer availability_updated_by, String sovren_document_id) {
        this.id = id;
        this.srno = srno;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailid = emailid;
        this.genderid = genderid;
        this.contactnumber = contactnumber;
        this.qualificationid = qualificationid;
        this.specialization = specialization;
        this.locationid = locationid;
        this.workexpyr = workexpyr;
        this.workexpmonth = workexpmonth;
        this.candidatedob = candidatedob;
        this.currentsalary = currentsalary;
        this.salaryexpectation = salaryexpectation;
        this.resume = resume;
        this.resumefilename = resumefilename;
        this.willingtorelocate = willingtorelocate;
        this.lastorganisation = lastorganisation;
        this.currentstatus = currentstatus;
        this.noticeperiod = noticeperiod;
        this.currencyid = currencyid;
        this.slug = slug;
        this.authid = authid;
        this.resumeupdatedon = resumeupdatedon;
        this.resumeupdaterequestedon = resumeupdaterequestedon;
        this.requestresumelinkstatus = requestresumelinkstatus;
        this.resumeaddedon = resumeaddedon;
        this.profilepic = profilepic;
        this.profilefacebook = profilefacebook;
        this.profilegithub = profilegithub;
        this.profiletwitter = profiletwitter;
        this.profilelinkedin = profilelinkedin;
        this.deleted = deleted;
        this.ownerid = ownerid;
        this.accountid = accountid;
        this.createdby = createdby;
        this.createdon = createdon;
        this.updatedby = updatedby;
        this.updatedon = updatedon;
        this.locality = locality;
        this.city = city;
        this.state = state;
        this.country = country;
        this.lng = lng;
        this.relevantexperience = relevantexperience;
        this.position = position;
        this.canaccess = canaccess;
        this.availablefrom = availablefrom;
        this.salarytype = salarytype;
        this.source = source;
        this.sourceadded = sourceadded;
        this.languageskills = languageskills;
        this.skill = skill;
        this.isduplicate = isduplicate;
        this.address = address;
        this.lat = lat;
        this.sourceid = sourceid;
        this.migration_reserved1 = migration_reserved1;
        this.migration_reserved2 = migration_reserved2;
        this.email_opt_out = email_opt_out;
        this.profilexing = profilexing;
        this.unavailable = unavailable;
        this.availability_updated_by = availability_updated_by;
        this.sovren_document_id = sovren_document_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSrno() {
        return srno;
    }

    public void setSrno(Integer srno) {
        this.srno = srno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Boolean getGenderid() {
        return genderid;
    }

    public void setGenderid(Boolean genderid) {
        this.genderid = genderid;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public Integer getQualificationid() {
        return qualificationid;
    }

    public void setQualificationid(Integer qualificationid) {
        this.qualificationid = qualificationid;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Short getLocationid() {
        return locationid;
    }

    public void setLocationid(Short locationid) {
        this.locationid = locationid;
    }

    public Boolean getWorkexpyr() {
        return workexpyr;
    }

    public void setWorkexpyr(Boolean workexpyr) {
        this.workexpyr = workexpyr;
    }

    public Boolean getWorkexpmonth() {
        return workexpmonth;
    }

    public void setWorkexpmonth(Boolean workexpmonth) {
        this.workexpmonth = workexpmonth;
    }

    public Integer getCandidatedob() {
        return candidatedob;
    }

    public void setCandidatedob(Integer candidatedob) {
        this.candidatedob = candidatedob;
    }

    public Float getCurrentsalary() {
        return currentsalary;
    }

    public void setCurrentsalary(Float currentsalary) {
        this.currentsalary = currentsalary;
    }

    public Float getSalaryexpectation() {
        return salaryexpectation;
    }

    public void setSalaryexpectation(Float salaryexpectation) {
        this.salaryexpectation = salaryexpectation;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getResumefilename() {
        return resumefilename;
    }

    public void setResumefilename(String resumefilename) {
        this.resumefilename = resumefilename;
    }

    public Boolean getWillingtorelocate() {
        return willingtorelocate;
    }

    public void setWillingtorelocate(Boolean willingtorelocate) {
        this.willingtorelocate = willingtorelocate;
    }

    public String getLastorganisation() {
        return lastorganisation;
    }

    public void setLastorganisation(String lastorganisation) {
        this.lastorganisation = lastorganisation;
    }

    public String getCurrentstatus() {
        return currentstatus;
    }

    public void setCurrentstatus(String currentstatus) {
        this.currentstatus = currentstatus;
    }

    public Integer getNoticeperiod() {
        return noticeperiod;
    }

    public void setNoticeperiod(Integer noticeperiod) {
        this.noticeperiod = noticeperiod;
    }

    public Integer getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(Integer currencyid) {
        this.currencyid = currencyid;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getAuthid() {
        return authid;
    }

    public void setAuthid(String authid) {
        this.authid = authid;
    }

    public Integer getResumeupdatedon() {
        return resumeupdatedon;
    }

    public void setResumeupdatedon(Integer resumeupdatedon) {
        this.resumeupdatedon = resumeupdatedon;
    }

    public Integer getResumeupdaterequestedon() {
        return resumeupdaterequestedon;
    }

    public void setResumeupdaterequestedon(Integer resumeupdaterequestedon) {
        this.resumeupdaterequestedon = resumeupdaterequestedon;
    }

    public Boolean getRequestresumelinkstatus() {
        return requestresumelinkstatus;
    }

    public void setRequestresumelinkstatus(Boolean requestresumelinkstatus) {
        this.requestresumelinkstatus = requestresumelinkstatus;
    }

    public Integer getResumeaddedon() {
        return resumeaddedon;
    }

    public void setResumeaddedon(Integer resumeaddedon) {
        this.resumeaddedon = resumeaddedon;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getProfilefacebook() {
        return profilefacebook;
    }

    public void setProfilefacebook(String profilefacebook) {
        this.profilefacebook = profilefacebook;
    }

    public String getProfilegithub() {
        return profilegithub;
    }

    public void setProfilegithub(String profilegithub) {
        this.profilegithub = profilegithub;
    }

    public String getProfiletwitter() {
        return profiletwitter;
    }

    public void setProfiletwitter(String profiletwitter) {
        this.profiletwitter = profiletwitter;
    }

    public String getProfilelinkedin() {
        return profilelinkedin;
    }

    public void setProfilelinkedin(String profilelinkedin) {
        this.profilelinkedin = profilelinkedin;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    public Integer getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Integer createdon) {
        this.createdon = createdon;
    }

    public Integer getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(Integer updatedby) {
        this.updatedby = updatedby;
    }

    public Integer getUpdatedon() {
        return updatedon;
    }

    public void setUpdatedon(Integer updatedon) {
        this.updatedon = updatedon;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getLng() {
        return lng;
    }

    public void setLng(Integer lng) {
        this.lng = lng;
    }

    public Integer getRelevantexperience() {
        return relevantexperience;
    }

    public void setRelevantexperience(Integer relevantexperience) {
        this.relevantexperience = relevantexperience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCanaccess() {
        return canaccess;
    }

    public void setCanaccess(String canaccess) {
        this.canaccess = canaccess;
    }

    public Integer getAvailablefrom() {
        return availablefrom;
    }

    public void setAvailablefrom(Integer availablefrom) {
        this.availablefrom = availablefrom;
    }

    public String getSalarytype() {
        return salarytype;
    }

    public void setSalarytype(String salarytype) {
        this.salarytype = salarytype;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceadded() {
        return sourceadded;
    }

    public void setSourceadded(String sourceadded) {
        this.sourceadded = sourceadded;
    }

    public String getLanguageskills() {
        return languageskills;
    }

    public void setLanguageskills(String languageskills) {
        this.languageskills = languageskills;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Boolean getIsduplicate() {
        return isduplicate;
    }

    public void setIsduplicate(Boolean isduplicate) {
        this.isduplicate = isduplicate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getLat() {
        return lat;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

    public Integer getSourceid() {
        return sourceid;
    }

    public void setSourceid(Integer sourceid) {
        this.sourceid = sourceid;
    }

    public String getMigration_reserved1() {
        return migration_reserved1;
    }

    public void setMigration_reserved1(String migration_reserved1) {
        this.migration_reserved1 = migration_reserved1;
    }

    public String getMigration_reserved2() {
        return migration_reserved2;
    }

    public void setMigration_reserved2(String migration_reserved2) {
        this.migration_reserved2 = migration_reserved2;
    }

    public Boolean getEmail_opt_out() {
        return email_opt_out;
    }

    public void setEmail_opt_out(Boolean email_opt_out) {
        this.email_opt_out = email_opt_out;
    }

    public String getProfilexing() {
        return profilexing;
    }

    public void setProfilexing(String profilexing) {
        this.profilexing = profilexing;
    }

    public Boolean getUnavailable() {
        return unavailable;
    }

    public void setUnavailable(Boolean unavailable) {
        this.unavailable = unavailable;
    }

    public Integer getAvailability_updated_by() {
        return availability_updated_by;
    }

    public void setAvailability_updated_by(Integer availability_updated_by) {
        this.availability_updated_by = availability_updated_by;
    }

    public String getSovren_document_id() {
        return sovren_document_id;
    }

    public void setSovren_document_id(String sovren_document_id) {
        this.sovren_document_id = sovren_document_id;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", srno=" + srno +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", emailid='" + emailid + '\'' +
                ", genderid=" + genderid +
                ", contactnumber='" + contactnumber + '\'' +
                ", qualificationid=" + qualificationid +
                ", specialization='" + specialization + '\'' +
                ", locationid=" + locationid +
                ", workexpyr=" + workexpyr +
                ", workexpmonth=" + workexpmonth +
                ", candidatedob=" + candidatedob +
                ", currentsalary=" + currentsalary +
                ", salaryexpectation=" + salaryexpectation +
                ", resume='" + resume + '\'' +
                ", resumefilename='" + resumefilename + '\'' +
                ", willingtorelocate=" + willingtorelocate +
                ", lastorganisation='" + lastorganisation + '\'' +
                ", currentstatus='" + currentstatus + '\'' +
                ", noticeperiod=" + noticeperiod +
                ", currencyid=" + currencyid +
                ", slug='" + slug + '\'' +
                ", authid='" + authid + '\'' +
                ", resumeupdatedon=" + resumeupdatedon +
                ", resumeupdaterequestedon=" + resumeupdaterequestedon +
                ", requestresumelinkstatus=" + requestresumelinkstatus +
                ", resumeaddedon=" + resumeaddedon +
                ", profilepic='" + profilepic + '\'' +
                ", profilefacebook='" + profilefacebook + '\'' +
                ", profilegithub='" + profilegithub + '\'' +
                ", profiletwitter='" + profiletwitter + '\'' +
                ", profilelinkedin='" + profilelinkedin + '\'' +
                ", deleted=" + deleted +
                ", ownerid=" + ownerid +
                ", accountid=" + accountid +
                ", createdby=" + createdby +
                ", createdon=" + createdon +
                ", updatedby=" + updatedby +
                ", updatedon=" + updatedon +
                ", locality='" + locality + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", lng=" + lng +
                ", relevantexperience=" + relevantexperience +
                ", position='" + position + '\'' +
                ", canaccess='" + canaccess + '\'' +
                ", availablefrom=" + availablefrom +
                ", salarytype='" + salarytype + '\'' +
                ", source='" + source + '\'' +
                ", sourceadded='" + sourceadded + '\'' +
                ", languageskills='" + languageskills + '\'' +
                ", skill='" + skill + '\'' +
                ", isduplicate=" + isduplicate +
                ", address='" + address + '\'' +
                ", lat=" + lat +
                ", sourceid=" + sourceid +
                ", migration_reserved1='" + migration_reserved1 + '\'' +
                ", migration_reserved2='" + migration_reserved2 + '\'' +
                ", email_opt_out=" + email_opt_out +
                ", profilexing='" + profilexing + '\'' +
                ", unavailable=" + unavailable +
                ", availability_updated_by=" + availability_updated_by +
                ", sovren_document_id='" + sovren_document_id + '\'' +
                '}';
    }
}
