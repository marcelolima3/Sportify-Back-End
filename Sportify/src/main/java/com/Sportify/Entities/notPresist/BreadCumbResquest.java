package com.Sportify.Entities.notPresist;

public class BreadCumbResquest {
    private int id;
    private boolean isSport;
    private int modalityID;

    public int getModalityID() {
        return modalityID;
    }

    public void setModalityID(int modalityID) {
        this.modalityID = modalityID;
    }

    public BreadCumbResquest() { }

    public BreadCumbResquest(int id, boolean isSport) {
        this.id = id;
        this.isSport = isSport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSport() {
        return isSport;
    }

    public void setSport(boolean sport) {
        isSport = sport;
    }
}
