package com.ll.pojo;

import java.io.Serializable;
import java.util.Date;

public class CbTaskQrMake implements Serializable {
    private Integer id;

    private Integer schoolId;

    private Integer startNo;

    private Integer endNo;

    private Date scheduleStart;

    private Date started;

    private Date ended;

    private Integer status;

    private Integer progressNo;

    private Date created;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getStartNo() {
        return startNo;
    }

    public void setStartNo(Integer startNo) {
        this.startNo = startNo;
    }

    public Integer getEndNo() {
        return endNo;
    }

    public void setEndNo(Integer endNo) {
        this.endNo = endNo;
    }

    public Date getScheduleStart() {
        return scheduleStart;
    }

    public void setScheduleStart(Date scheduleStart) {
        this.scheduleStart = scheduleStart;
    }

    public Date getStarted() {
        return started;
    }

    public void setStarted(Date started) {
        this.started = started;
    }

    public Date getEnded() {
        return ended;
    }

    public void setEnded(Date ended) {
        this.ended = ended;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getProgressNo() {
        return progressNo;
    }

    public void setProgressNo(Integer progressNo) {
        this.progressNo = progressNo;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CbTaskQrMake other = (CbTaskQrMake) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSchoolId() == null ? other.getSchoolId() == null : this.getSchoolId().equals(other.getSchoolId()))
            && (this.getStartNo() == null ? other.getStartNo() == null : this.getStartNo().equals(other.getStartNo()))
            && (this.getEndNo() == null ? other.getEndNo() == null : this.getEndNo().equals(other.getEndNo()))
            && (this.getScheduleStart() == null ? other.getScheduleStart() == null : this.getScheduleStart().equals(other.getScheduleStart()))
            && (this.getStarted() == null ? other.getStarted() == null : this.getStarted().equals(other.getStarted()))
            && (this.getEnded() == null ? other.getEnded() == null : this.getEnded().equals(other.getEnded()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getProgressNo() == null ? other.getProgressNo() == null : this.getProgressNo().equals(other.getProgressNo()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSchoolId() == null) ? 0 : getSchoolId().hashCode());
        result = prime * result + ((getStartNo() == null) ? 0 : getStartNo().hashCode());
        result = prime * result + ((getEndNo() == null) ? 0 : getEndNo().hashCode());
        result = prime * result + ((getScheduleStart() == null) ? 0 : getScheduleStart().hashCode());
        result = prime * result + ((getStarted() == null) ? 0 : getStarted().hashCode());
        result = prime * result + ((getEnded() == null) ? 0 : getEnded().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getProgressNo() == null) ? 0 : getProgressNo().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", startNo=").append(startNo);
        sb.append(", endNo=").append(endNo);
        sb.append(", scheduleStart=").append(scheduleStart);
        sb.append(", started=").append(started);
        sb.append(", ended=").append(ended);
        sb.append(", status=").append(status);
        sb.append(", progressNo=").append(progressNo);
        sb.append(", created=").append(created);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}