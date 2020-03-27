package com.ll.pojo;

import java.io.Serializable;

public class CbSubjectWithBLOBs extends CbSubject implements Serializable {
    private String logo2x;

    private String logo3x;

    private static final long serialVersionUID = 1L;

    public String getLogo2x() {
        return logo2x;
    }

    public void setLogo2x(String logo2x) {
        this.logo2x = logo2x == null ? null : logo2x.trim();
    }

    public String getLogo3x() {
        return logo3x;
    }

    public void setLogo3x(String logo3x) {
        this.logo3x = logo3x == null ? null : logo3x.trim();
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
        CbSubjectWithBLOBs other = (CbSubjectWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSchoolId() == null ? other.getSchoolId() == null : this.getSchoolId().equals(other.getSchoolId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getModified() == null ? other.getModified() == null : this.getModified().equals(other.getModified()))
            && (this.getLogo2x() == null ? other.getLogo2x() == null : this.getLogo2x().equals(other.getLogo2x()))
            && (this.getLogo3x() == null ? other.getLogo3x() == null : this.getLogo3x().equals(other.getLogo3x()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSchoolId() == null) ? 0 : getSchoolId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getModified() == null) ? 0 : getModified().hashCode());
        result = prime * result + ((getLogo2x() == null) ? 0 : getLogo2x().hashCode());
        result = prime * result + ((getLogo3x() == null) ? 0 : getLogo3x().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logo2x=").append(logo2x);
        sb.append(", logo3x=").append(logo3x);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}