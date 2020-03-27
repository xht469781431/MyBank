package com.ll.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CbTransferLine implements Serializable {
    private Integer id;

    private Integer schoolId;

    private Integer studentId;

    private String nfcNumber;

    private Integer deviceType;

    private String deviceId;

    private Integer toStudentId;

    private String toNfcNumber;

    private BigDecimal amount;

    private Integer operatorId;

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

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getNfcNumber() {
        return nfcNumber;
    }

    public void setNfcNumber(String nfcNumber) {
        this.nfcNumber = nfcNumber == null ? null : nfcNumber.trim();
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public Integer getToStudentId() {
        return toStudentId;
    }

    public void setToStudentId(Integer toStudentId) {
        this.toStudentId = toStudentId;
    }

    public String getToNfcNumber() {
        return toNfcNumber;
    }

    public void setToNfcNumber(String toNfcNumber) {
        this.toNfcNumber = toNfcNumber == null ? null : toNfcNumber.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
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
        CbTransferLine other = (CbTransferLine) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSchoolId() == null ? other.getSchoolId() == null : this.getSchoolId().equals(other.getSchoolId()))
            && (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()))
            && (this.getNfcNumber() == null ? other.getNfcNumber() == null : this.getNfcNumber().equals(other.getNfcNumber()))
            && (this.getDeviceType() == null ? other.getDeviceType() == null : this.getDeviceType().equals(other.getDeviceType()))
            && (this.getDeviceId() == null ? other.getDeviceId() == null : this.getDeviceId().equals(other.getDeviceId()))
            && (this.getToStudentId() == null ? other.getToStudentId() == null : this.getToStudentId().equals(other.getToStudentId()))
            && (this.getToNfcNumber() == null ? other.getToNfcNumber() == null : this.getToNfcNumber().equals(other.getToNfcNumber()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getOperatorId() == null ? other.getOperatorId() == null : this.getOperatorId().equals(other.getOperatorId()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSchoolId() == null) ? 0 : getSchoolId().hashCode());
        result = prime * result + ((getStudentId() == null) ? 0 : getStudentId().hashCode());
        result = prime * result + ((getNfcNumber() == null) ? 0 : getNfcNumber().hashCode());
        result = prime * result + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        result = prime * result + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        result = prime * result + ((getToStudentId() == null) ? 0 : getToStudentId().hashCode());
        result = prime * result + ((getToNfcNumber() == null) ? 0 : getToNfcNumber().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getOperatorId() == null) ? 0 : getOperatorId().hashCode());
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
        sb.append(", studentId=").append(studentId);
        sb.append(", nfcNumber=").append(nfcNumber);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", toStudentId=").append(toStudentId);
        sb.append(", toNfcNumber=").append(toNfcNumber);
        sb.append(", amount=").append(amount);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", created=").append(created);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}