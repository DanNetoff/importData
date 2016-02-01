package com.company;

import java.util.Date;

/**
 * Created by DanNetoff on 30.01.2016.
 */
public class importPojo {
    private Integer numberFilial;
    private Integer codeFilial;
    //private Date loadDate;

    public importPojo() {
    }

    public importPojo(Integer numberFilial, Integer codeFilial) {
        this.numberFilial = numberFilial;
        this.codeFilial = codeFilial;
    }

    @Override
    public String toString() {
        return "\n" +
                "numberFilial=" + numberFilial +
                ", codeFilial=" + codeFilial ;
    }

    public void setcode_filial(Integer codeFilial) {
        this.codeFilial = codeFilial;
    }

    public void setnumber_filial(Integer numberFilial) {
        this.numberFilial = numberFilial;
    }

    @Override
    public boolean equals(Object o) {
            return false;
    }

    @Override
    public int hashCode() {
        int result = numberFilial != null ? numberFilial.hashCode() : 0;
        result = 31 * result + (codeFilial != null ? codeFilial.hashCode() : 0);
        return result;
    }







}
