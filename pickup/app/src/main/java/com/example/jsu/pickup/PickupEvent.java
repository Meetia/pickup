package com.example.jsu.pickup;

import java.util.ArrayList;

/**
 * Created by Meet Patel on 10/15/2016.
 */



public class PickupEvent {
    String EventName;
    int Host;
    String StartTime;
    String EndTime;
    String Loc;
    ArrayList<Integer> PlayersAttending;
    String GameType;

    public PickupEvent(String EventName, int Host, String StartTime, String EndTime, String Loc, String GameType) {
        this.EventName = EventName;
        this.Host = Host;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        this.Loc = Loc;
        this.GameType = GameType;
        PlayersAttending.add(Host);
    }

    public void addPlayer(int id) {
        PlayersAttending.add(id);
    }

    public void removePlayer(int id) {
        if (PlayersAttending.contains(id)) {
            PlayersAttending.remove(PlayersAttending.indexOf(id));
        }
        else {
                System.err.println("Can't remove nonexistent player");
        }
    }

    public void changeTime(String StartTime, String EndTime) {
        this.StartTime = StartTime;
        this.EndTime = EndTime;
    }

    public void changeLoc(String Loc){
        this.Loc = Loc;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public int getHost() {
        return Host;
    }
    public String getStartTime() {
        return StartTime;
    }
    public void setStartTime(String startTime) {
        StartTime = startTime;
    }
    public String getEndTime() {
        return EndTime;
    }
    public void setEndTime(String endTime) {
        EndTime = endTime;
    }
    public String getLoc() {
        return Loc;
    }
    public void setLoc(String loc) {
        Loc = loc;
    }
    public String getGameType() {
        return GameType;
    }
}