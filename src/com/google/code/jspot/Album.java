/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.google.code.jspot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author plamere
 */
public class Album extends SpotifyItem {
    private String artistName;
    private String artistID;
    private String[] availableTerritories = {};
    private Map<String, String> ids = new HashMap<String, String>();
    private int released = -1;


    public Album(String id, String name, float popularity) {
        super(id, name, popularity);
    }

    public String getArtistID() {
        return artistID;
    }

    public String getArtistName() {
        return artistName;
    }

    public String[] getAvailableTerritories() {
        return availableTerritories;
    }

    public Map<String, String> getIds() {
        return ids;
    }

    void setAvailableTerritories(String[] s) {
        this.availableTerritories = s;
    }

    void addID(String id, String url) {
        ids.put(id, url);
    }

    void setArtistID(String artistID) {
        this.artistID = artistID;
    }

    void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String toString() {
        return  " " + super.toString() + "\n" +
                " artistName " + artistName + "\n" +
                " artistID " + artistID + "\n" +
                " territories " + availableTerritories.length + "\n" +
                " ids " + ids.size() + "\n" ;
    }

    public int getReleased() {
        return released;
    }

    void setReleased(int released) {
        this.released = released;
    }

}
