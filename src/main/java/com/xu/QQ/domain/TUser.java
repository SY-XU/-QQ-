package com.xu.QQ.domain;

import java.io.Serializable;

/**
 * t_user
 * @author 
 */
public class TUser implements Serializable {
    private Integer userid;

    private String tnum;

    private String emaile;

    private String phone;

    private String password;

    private String name;

    private Boolean isonline;

    private String touxiang;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTnum() {
        return tnum;
    }

    public void setTnum(String tnum) {
        this.tnum = tnum;
    }

    public String getEmaile() {
        return emaile;
    }

    public void setEmaile(String emaile) {
        this.emaile = emaile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsonline() {
        return isonline;
    }

    public void setIsonline(Boolean isonline) {
        this.isonline = isonline;
    }

    public String getTouxiang() {
        return touxiang;
    }

    public void setTouxiang(String touxiang) {
        this.touxiang = touxiang;
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
        TUser other = (TUser) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getTnum() == null ? other.getTnum() == null : this.getTnum().equals(other.getTnum()))
            && (this.getEmaile() == null ? other.getEmaile() == null : this.getEmaile().equals(other.getEmaile()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIsonline() == null ? other.getIsonline() == null : this.getIsonline().equals(other.getIsonline()))
            && (this.getTouxiang() == null ? other.getTouxiang() == null : this.getTouxiang().equals(other.getTouxiang()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getTnum() == null) ? 0 : getTnum().hashCode());
        result = prime * result + ((getEmaile() == null) ? 0 : getEmaile().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIsonline() == null) ? 0 : getIsonline().hashCode());
        result = prime * result + ((getTouxiang() == null) ? 0 : getTouxiang().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", tnum=").append(tnum);
        sb.append(", emaile=").append(emaile);
        sb.append(", phone=").append(phone);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", isonline=").append(isonline);
        sb.append(", touxiang=").append(touxiang);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}