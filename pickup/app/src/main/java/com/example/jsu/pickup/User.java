package com.example.jsu.pickup;

import java.util.ArrayList;

/**
 * Created by Meet Patel on 10/15/2016.
 */

public class User {
    int id;
    String username;
    String sports_pref;
    int rep;

    public User(int id, String username, String sports_pref){
        this.id = id;
        this.username = username;
        this.sports_pref = sports_pref;
        rep = 0;
    }

    public String getSports_Pref(){
        return sports_pref;
    }

    public void remove_pref(String pref){
        if(sports_pref.contains(pref)){
            sports_pref = pref;
        }
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getRep() {
        return rep;
    }

    public void incrementRep() {
        rep++;
    }
}
