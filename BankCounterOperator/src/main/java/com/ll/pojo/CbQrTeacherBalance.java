package com.ll.pojo;

import java.io.Serializable;

public class CbQrTeacherBalance extends CbQrTeacherBalanceKey implements Serializable {
    private Integer receivedTotal;

    private Integer usedTotal;

    private static final long serialVersionUID = 1L;

    public Integer getReceivedTotal() {
        return receivedTotal;
    }

    public void setReceivedTotal(Integer receivedTotal) {
        this.receivedTotal = receivedTotal;
    }

    public Integer getUsedTotal() {
        return usedTotal;
    }

    public void setUsedTotal(Integer usedTotal) {
        this.usedTotal = usedTotal;
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
        CbQrTeacherBalance other = (CbQrTeacherBalance) that;
        return (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()))
            && (this.getSubjectId() == null ? other.getSubjectId() == null : this.getSubjectId().equals(other.getSubjectId()))
            && (this.getReceivedTotal() == null ? other.getReceivedTotal() == null : this.getReceivedTotal().equals(other.getReceivedTotal()))
            && (this.getUsedTotal() == null ? other.getUsedTotal() == null : this.getUsedTotal().equals(other.getUsedTotal()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        result = prime * result + ((getSubjectId() == null) ? 0 : getSubjectId().hashCode());
        result = prime * result + ((getReceivedTotal() == null) ? 0 : getReceivedTotal().hashCode());
        result = prime * result + ((getUsedTotal() == null) ? 0 : getUsedTotal().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", receivedTotal=").append(receivedTotal);
        sb.append(", usedTotal=").append(usedTotal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}