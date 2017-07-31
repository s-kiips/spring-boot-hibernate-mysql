package com.example.demo.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Administrator on 7/31/2017.
 */
@Entity
public class Table4 {
    private int tid;
    private String asdasd;
    private String asd;

    @Id
    @Column(name = "tid")
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "asdasd")
    public String getAsdasd() {
        return asdasd;
    }

    public void setAsdasd(String asdasd) {
        this.asdasd = asdasd;
    }

    @Basic
    @Column(name = "asd")
    public String getAsd() {
        return asd;
    }

    public void setAsd(String asd) {
        this.asd = asd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table4 table4 = (Table4) o;

        if (tid != table4.tid) return false;
        if (asdasd != null ? !asdasd.equals(table4.asdasd) : table4.asdasd != null) return false;
        if (asd != null ? !asd.equals(table4.asd) : table4.asd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid;
        result = 31 * result + (asdasd != null ? asdasd.hashCode() : 0);
        result = 31 * result + (asd != null ? asd.hashCode() : 0);
        return result;
    }
}
