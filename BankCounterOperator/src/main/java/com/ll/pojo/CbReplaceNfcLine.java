package com.ll.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CbReplaceNfcLine implements Serializable {
    private Integer id;

    private Integer schoolId;

    private Integer studentId;

    private String oldNfcNumber;

    private String newNfcNumber;

    private BigDecimal balance;

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

    public String getOldNfcNumber() {
        return oldNfcNumber;
    }

    public void setOldNfcNumber(String oldNfcNumber) {
        this.oldNfcNumber = oldNfcNumber == null ? null : oldNfcNumber.trim();
    }

    public String getNewNfcNumber() {
        return newNfcNumber;
    }

    public void setNewNfcNumber(String newNfcNumber) {
        this.newNfcNumber = newNfcNumber == null ? null : newNfcNumber.trim();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
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
        CbReplaceNfcLine other = (CbReplaceNfcLine) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSchoolId() == null ? other.getSchoolId() == null : this.getSchoolId().equals(other.getSchoolId()))
            && (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()))
            && (this.getOldNfcNumber() == null ? other.getOldNfcNumber() == null : this.getOldNfcNumber().equals(other.getOldNfcNumber()))
            && (this.getNewNfcNumber() == null ? other.getNewNfcNumber() == null : this.getNewNfcNumber().equals(other.getNewNfcNumber()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
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
        result = prime * result + ((getOldNfcNumber() == null) ? 0 : getOldNfcNumber().hashCode());
        result = prime * result + ((getNewNfcNumber() == null) ? 0 : getNewNfcNumber().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
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
        sb.append(", oldNfcNumber=").append(oldNfcNumber);
        sb.append(", newNfcNumber=").append(newNfcNumber);
        sb.append(", balance=").append(balance);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", created=").append(created);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}