package com.example.moodjournal;

public class MoodNode {

    private int rating;
    private String date;
    private String entry;

    //Constructor
    MoodNode(){
        this.rating = -1;
        this.date = "";
        this.entry = "";
    }

    //Setters
    void setRating(int rating){
        this.rating = rating;
    }
    void setDate(String date){
        this.date = date;
    }
    void setEntry(String entry){
        this.entry = entry;
    }

    //Getters
    int getRating(){
        return this.rating;
    }
    String getDate(){
        return this.date;
    }
    String getEntry(){
        return this.entry;
    }
}
