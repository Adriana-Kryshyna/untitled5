package org.example;


public class Forjson {
    private String id;
    private String pointDate;
    private String date;
    private String ask;
    private String bid;
    private String currency;

    public Forjson() {
    }

    public Forjson(String id, String pointDate, String date, String ask, String bid, String currency) {
        this.id = id;
        this.pointDate = pointDate;
        this.date = date;
        this.ask = ask;
        this.bid = bid;
        this.currency = currency;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPointDate() {
        return pointDate;
    }

    public void setPointDate(String pointDate) {
        this.pointDate = pointDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Forjson{" +
                "id='" + id + '\'' +
                ", pointDate='" + pointDate + '\'' +
                ", date='" + date + '\'' +
                ", ask='" + ask + '\'' +
                ", bid='" + bid + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
