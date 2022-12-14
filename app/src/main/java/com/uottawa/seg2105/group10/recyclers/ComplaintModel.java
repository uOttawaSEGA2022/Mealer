package com.uottawa.seg2105.group10.recyclers;

import com.google.firebase.firestore.DocumentReference;

public class ComplaintModel{

    String cookName;
    String clientName;
    String time;
    String title;
    String description;
    String cookUid, clientUid;
    String docID;
    boolean status = true;



    public ComplaintModel(String nameOfClient, String cookName, String time, String title, String description, String cookUid, String clientUid){
        this.clientName = nameOfClient;
        this.cookName = cookName;
        this.time = time;
        this.title = title;
        this.description = description;
        this.cookUid = cookUid;
        this.clientUid = clientUid;
    }

    public String getDocID(){
        return docID;
    }

    public String getCookName() {
        return cookName;
    }
    public String getClientName() {return clientName;}
    public String getTime() {
        return time;
    }
    public String getTitle(){return title;}
    public String getDescription(){return description;}
    public String getCookUid(){return cookUid;}
    public String getClientUid(){return clientUid;}
    public boolean getStatus(){return status;}

    public void setDocID(String id){this.docID = id;}
}


