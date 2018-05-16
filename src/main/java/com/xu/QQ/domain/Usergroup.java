package com.xu.QQ.domain;

import java.io.Serializable;

/**
 * usergroup
 * @author 
 */
public class Usergroup implements Serializable {
    private Integer usergroupid;

    private Integer userid;

    private Integer groupid;

    private String ename;

    private Integer unreadnum;

    private static final long serialVersionUID = 1L;

    public Integer getUsergroupid() {
        return usergroupid;
    }

    public void setUsergroupid(Integer usergroupid) {
        this.usergroupid = usergroupid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getUnreadnum() {
        return unreadnum;
    }

    public void setUnreadnum(Integer unreadnum) {
        this.unreadnum = unreadnum;
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
        Usergroup other = (Usergroup) that;
        return (this.getUsergroupid() == null ? other.getUsergroupid() == null : this.getUsergroupid().equals(other.getUsergroupid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getGroupid() == null ? other.getGroupid() == null : this.getGroupid().equals(other.getGroupid()))
            && (this.getEname() == null ? other.getEname() == null : this.getEname().equals(other.getEname()))
            && (this.getUnreadnum() == null ? other.getUnreadnum() == null : this.getUnreadnum().equals(other.getUnreadnum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUsergroupid() == null) ? 0 : getUsergroupid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getGroupid() == null) ? 0 : getGroupid().hashCode());
        result = prime * result + ((getEname() == null) ? 0 : getEname().hashCode());
        result = prime * result + ((getUnreadnum() == null) ? 0 : getUnreadnum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usergroupid=").append(usergroupid);
        sb.append(", userid=").append(userid);
        sb.append(", groupid=").append(groupid);
        sb.append(", ename=").append(ename);
        sb.append(", unreadnum=").append(unreadnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}