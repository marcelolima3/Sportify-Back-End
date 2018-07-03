package com.Sportify.Entities.notPresist;

public class BreadCumbResponse {
    private int sportID;
    private String sportName;
    private boolean hasModality;
    private int modalityID;
    private String modalityName;

    public BreadCumbResponse() {
    }

    public BreadCumbResponse(int sportID, String sportName, boolean hasModality, int modalityID, String modalityName) {
        this.sportID = sportID;
        this.sportName = sportName;
        this.hasModality = hasModality;
        this.modalityID = modalityID;
        this.modalityName = modalityName;
    }

    public BreadCumbResponse(int sportID, String sportName, boolean hasModality) {
        this.sportID = sportID;
        this.sportName = sportName;
        this.hasModality = hasModality;
    }

    public int getSportID() {
        return sportID;
    }

    public void setSportID(int sportID) {
        this.sportID = sportID;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public boolean isHasModality() {
        return hasModality;
    }

    public void setHasModality(boolean hasModality) {
        this.hasModality = hasModality;
    }

    public int getModalityID() {
        return modalityID;
    }

    public void setModalityID(int modalityID) {
        this.modalityID = modalityID;
    }

    public String getModalityName() {
        return modalityName;
    }

    public void setModalityName(String modalityName) {
        this.modalityName = modalityName;
    }
}
