package com.example.demo.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 7/31/2017.
 */
@Entity
public class Thirdtabe {
    private int thirdid;
    private String fn;
    private String ln;
    private String address;
    private int secondid;

    @Id
    @Column(name = "thirdid")
    public int getThirdid() {
        return thirdid;
    }

    public void setThirdid(int thirdid) {
        this.thirdid = thirdid;
    }

    @Basic
    @Column(name = "fn")
    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    @Basic
    @Column(name = "ln")
    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "secondid")
    public int getSecondid() {
        return secondid;
    }

    public void setSecondid(int secondid) {
        this.secondid = secondid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Thirdtabe thirdtabe = (Thirdtabe) o;

        if (thirdid != thirdtabe.thirdid) return false;
        if (secondid != thirdtabe.secondid) return false;
        if (fn != null ? !fn.equals(thirdtabe.fn) : thirdtabe.fn != null) return false;
        if (ln != null ? !ln.equals(thirdtabe.ln) : thirdtabe.ln != null) return false;
        if (address != null ? !address.equals(thirdtabe.address) : thirdtabe.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = thirdid;
        result = 31 * result + (fn != null ? fn.hashCode() : 0);
        result = 31 * result + (ln != null ? ln.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + secondid;
        return result;
    }
}
