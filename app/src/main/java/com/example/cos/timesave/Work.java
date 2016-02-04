package com.example.cos.timesave;

public class Work {
    private String work;
    private int time;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Work(String work, int time) {
        this.work = work;
        this.time = time;
    }
}
