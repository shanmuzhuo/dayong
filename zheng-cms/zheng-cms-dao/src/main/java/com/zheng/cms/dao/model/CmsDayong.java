package com.zheng.cms.dao.model;

import java.io.Serializable;

public class CmsDayong implements Serializable {
    private Integer dayongId;

    private String dayongName;

    /**
     * 名称
     *
     * @mbg.generated
     */
    private String dayongEnname;

    private String longitude;

    private String latitude;

    private String address;

    private String price;

    private String route;

    private String summary;

    /**
     * 类别
     *
     * @mbg.generated
     */
    private String catelog;

    /**
     * 级别
     *
     * @mbg.generated
     */
    private String level;

    private String desc;

    private static final long serialVersionUID = 1L;

    public Integer getDayongId() {
        return dayongId;
    }

    public void setDayongId(Integer dayongId) {
        this.dayongId = dayongId;
    }

    public String getDayongName() {
        return dayongName;
    }

    public void setDayongName(String dayongName) {
        this.dayongName = dayongName;
    }

    public String getDayongEnname() {
        return dayongEnname;
    }

    public void setDayongEnname(String dayongEnname) {
        this.dayongEnname = dayongEnname;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCatelog() {
        return catelog;
    }

    public void setCatelog(String catelog) {
        this.catelog = catelog;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dayongId=").append(dayongId);
        sb.append(", dayongName=").append(dayongName);
        sb.append(", dayongEnname=").append(dayongEnname);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", address=").append(address);
        sb.append(", price=").append(price);
        sb.append(", route=").append(route);
        sb.append(", summary=").append(summary);
        sb.append(", catelog=").append(catelog);
        sb.append(", level=").append(level);
        sb.append(", desc=").append(desc);
        sb.append("]");
        return sb.toString();
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
        CmsDayong other = (CmsDayong) that;
        return (this.getDayongId() == null ? other.getDayongId() == null : this.getDayongId().equals(other.getDayongId()))
            && (this.getDayongName() == null ? other.getDayongName() == null : this.getDayongName().equals(other.getDayongName()))
            && (this.getDayongEnname() == null ? other.getDayongEnname() == null : this.getDayongEnname().equals(other.getDayongEnname()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getRoute() == null ? other.getRoute() == null : this.getRoute().equals(other.getRoute()))
            && (this.getSummary() == null ? other.getSummary() == null : this.getSummary().equals(other.getSummary()))
            && (this.getCatelog() == null ? other.getCatelog() == null : this.getCatelog().equals(other.getCatelog()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDayongId() == null) ? 0 : getDayongId().hashCode());
        result = prime * result + ((getDayongName() == null) ? 0 : getDayongName().hashCode());
        result = prime * result + ((getDayongEnname() == null) ? 0 : getDayongEnname().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getRoute() == null) ? 0 : getRoute().hashCode());
        result = prime * result + ((getSummary() == null) ? 0 : getSummary().hashCode());
        result = prime * result + ((getCatelog() == null) ? 0 : getCatelog().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        return result;
    }
}