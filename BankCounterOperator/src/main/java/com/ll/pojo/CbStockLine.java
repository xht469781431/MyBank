package com.ll.pojo;

import java.io.Serializable;
import java.util.Date;

public class CbStockLine implements Serializable {
    private Integer id;

    private Integer schoolId;

    private Integer goodId;

    private Integer saleQuantity;

    private Integer inQuantity;

    private Integer otherQuantity;

    private Integer balance;

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

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getSaleQuantity() {
        return saleQuantity;
    }

    public void setSaleQuantity(Integer saleQuantity) {
        this.saleQuantity = saleQuantity;
    }

    public Integer getInQuantity() {
        return inQuantity;
    }

    public void setInQuantity(Integer inQuantity) {
        this.inQuantity = inQuantity;
    }

    public Integer getOtherQuantity() {
        return otherQuantity;
    }

    public void setOtherQuantity(Integer otherQuantity) {
        this.otherQuantity = otherQuantity;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
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
        CbStockLine other = (CbStockLine) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSchoolId() == null ? other.getSchoolId() == null : this.getSchoolId().equals(other.getSchoolId()))
            && (this.getGoodId() == null ? other.getGoodId() == null : this.getGoodId().equals(other.getGoodId()))
            && (this.getSaleQuantity() == null ? other.getSaleQuantity() == null : this.getSaleQuantity().equals(other.getSaleQuantity()))
            && (this.getInQuantity() == null ? other.getInQuantity() == null : this.getInQuantity().equals(other.getInQuantity()))
            && (this.getOtherQuantity() == null ? other.getOtherQuantity() == null : this.getOtherQuantity().equals(other.getOtherQuantity()))
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
        result = prime * result + ((getGoodId() == null) ? 0 : getGoodId().hashCode());
        result = prime * result + ((getSaleQuantity() == null) ? 0 : getSaleQuantity().hashCode());
        result = prime * result + ((getInQuantity() == null) ? 0 : getInQuantity().hashCode());
        result = prime * result + ((getOtherQuantity() == null) ? 0 : getOtherQuantity().hashCode());
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
        sb.append(", goodId=").append(goodId);
        sb.append(", saleQuantity=").append(saleQuantity);
        sb.append(", inQuantity=").append(inQuantity);
        sb.append(", otherQuantity=").append(otherQuantity);
        sb.append(", balance=").append(balance);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", created=").append(created);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}