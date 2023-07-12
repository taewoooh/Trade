package com.example.trade.tradelist;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by taewoo on 2019-11-16.
 */

public class Buytradelistitem {

    public Buytradelistitem(String si, int year, int month, int yearmonth, int trade, String per , int hightrade,
                            int highyear, int highmonth, int rowtrade, int rowyear, int rowmonth, String updatetime) {

        this.si = si;
        this.year = year;
        this.month = month;
        this.yearmonth = yearmonth;
        this.trade = trade;

        this.per = per;

        this.hightrade = hightrade;
        this.highyear = highyear;
        this.highmonth = highmonth;

        this.rowtrade = rowtrade;
        this.rowyear = rowyear;
        this.rowmonth = rowmonth;
        this.updatetime = updatetime;
        this.ym = ym;



    }
    public Buytradelistitem(String si, int year, int month, int yearmonth, int trade, String per , int hightrade,
                            int highyear, int highmonth, int rowtrade, int rowyear, int rowmonth, String updatetime, String ym) {

        this.si = si;
        this.year = year;
        this.month = month;
        this.yearmonth = yearmonth;
        this.trade = trade;

        this.per = per;

        this.hightrade = hightrade;
        this.highyear = highyear;
        this.highmonth = highmonth;

        this.rowtrade = rowtrade;
        this.rowyear = rowyear;
        this.rowmonth = rowmonth;
        this.updatetime = updatetime;
        this.ym = ym;



    }




    @SerializedName("si")
    @Expose
    public
    String si;


    @SerializedName("year")
    @Expose
    public
    int year;

    @SerializedName("month")
    @Expose
    public
    int month;

    @SerializedName("yearmonth")
    @Expose
    public
    int yearmonth;



    @SerializedName("trade")
    @Expose
    public
    int trade;




    @SerializedName("updatetime")
    @Expose
    public
    String updatetime;




    @SerializedName("ym")
    @Expose
    public
    String ym;

    public int getHightrade() {
        return hightrade;
    }

    public void setHightrade(int hightrade) {
        this.hightrade = hightrade;
    }

    public int getHighyear() {
        return highyear;
    }

    public void setHighyear(int highyear) {
        this.highyear = highyear;
    }

    public int getHighmonth() {
        return highmonth;
    }

    public void setHighmonth(int highmonth) {
        this.highmonth = highmonth;
    }

    public int getRowtrade() {
        return rowtrade;
    }

    public void setRowtrade(int rowtrade) {
        this.rowtrade = rowtrade;
    }

    public int getRowyear() {
        return rowyear;
    }

    public void setRowyear(int rowyear) {
        this.rowyear = rowyear;
    }

    public int getRowmonth() {
        return rowmonth;
    }

    public void setRowmonth(int rowmonth) {
        this.rowmonth = rowmonth;
    }

    public String getPer() {
        return per;
    }

    public void setPer(String per) {
        this.per = per;
    }
    public String getYm() {
        return ym;
    }

    public void setYm(String ym) {
        this.ym = ym;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    @SerializedName("hightrade")
    @Expose
    public
    int hightrade;

    @SerializedName("highyear")
    @Expose
    public
    int highyear;

    @SerializedName("highmonth")
    @Expose
    public
    int highmonth;



    @SerializedName("rowtrade")
    @Expose
    public
    int rowtrade;




    @SerializedName("rowyear")
    @Expose
    public
    int rowyear;

    @SerializedName("rowmonth")
    @Expose
    public
    int rowmonth;

    @SerializedName("per")
    @Expose
    public
    String per;







    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYearmonth() {
        return yearmonth;
    }

    public void setYearmonth(int yearmonth) {
        this.yearmonth = yearmonth;
    }
    public int getTrade() {
        return trade;
    }

    public void setTrade(int trade) {
        this.trade = trade;
    }


}