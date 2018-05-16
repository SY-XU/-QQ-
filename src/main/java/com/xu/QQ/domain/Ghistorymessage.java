package com.xu.QQ.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * ghistorymessage
 * @author 
 */
public class Ghistorymessage implements Serializable {
    private Integer id;

    private Integer usergroupid;

    private Date stime;

    private String message;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsergroupid() {
        return usergroupid;
    }

    public void setUsergroupid(Integer usergroupid) {
        this.usergroupid = usergroupid;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
        Ghistorymessage other = (Ghistorymessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsergroupid() == null ? other.getUsergroupid() == null : this.getUsergroupid().equals(other.getUsergroupid()))
            && (this.getStime() == null ? other.getStime() == null : this.getStime().equals(other.getStime()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsergroupid() == null) ? 0 : getUsergroupid().hashCode());
        result = prime * result + ((getStime() == null) ? 0 : getStime().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", usergroupid=").append(usergroupid);
        sb.append(", stime=").append(stime);
        sb.append(", message=").append(message);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}