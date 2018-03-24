package com.github.pahlevikun.slidinguplayout;

/**
 * Created by AisyahAstindraR on 22, 3/22/2018.
 */

public class TimelineTrackerData {

    int id;
    String date;
    String time;
    String detail;

    public TimelineTrackerData() {
    }

    public TimelineTrackerData(int id, String date, String time, String detail) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
