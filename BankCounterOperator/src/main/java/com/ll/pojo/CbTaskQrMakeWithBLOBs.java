package com.ll.pojo;

import java.io.Serializable;

public class CbTaskQrMakeWithBLOBs extends CbTaskQrMake implements Serializable {
    private String imageBackground;

    private String imageLogo;

    private static final long serialVersionUID = 1L;

    public String getImageBackground() {
        return imageBackground;
    }

    public void setImageBackground(String imageBackground) {
        this.imageBackground = imageBackground == null ? null : imageBackground.trim();
    }

    public String getImageLogo() {
        return imageLogo;
    }

    public void setImageLogo(String imageLogo) {
        this.imageLogo = imageLogo == null ? null : imageLogo.trim();
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
        CbTaskQrMakeWithBLOBs other = (CbTaskQrMakeWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSchoolId() == null ? other.getSchoolId() == null : this.getSchoolId().equals(other.getSchoolId()))
            && (this.getStartNo() == null ? other.getStartNo() == null : this.getStartNo().equals(other.getStartNo()))
            && (this.getEndNo() == null ? other.getEndNo() == null : this.getEndNo().equals(other.getEndNo()))
            && (this.getScheduleStart() == null ? other.getScheduleStart() == null : this.getScheduleStart().equals(other.getScheduleStart()))
            && (this.getStarted() == null ? other.getStarted() == null : this.getStarted().equals(other.getStarted()))
            && (this.getEnded() == null ? other.getEnded() == null : this.getEnded().equals(other.getEnded()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getProgressNo() == null ? other.getProgressNo() == null : this.getProgressNo().equals(other.getProgressNo()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getImageBackground() == null ? other.getImageBackground() == null : this.getImageBackground().equals(other.getImageBackground()))
            && (this.getImageLogo() == null ? other.getImageLogo() == null : this.getImageLogo().equals(other.getImageLogo()));
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
        result = prime * result + ((getImageBackground() == null) ? 0 : getImageBackground().hashCode());
        result = prime * result + ((getImageLogo() == null) ? 0 : getImageLogo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", imageBackground=").append(imageBackground);
        sb.append(", imageLogo=").append(imageLogo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}