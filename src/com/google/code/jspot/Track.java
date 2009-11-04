/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.google.code.jspot;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author plamere
 */
public class Track extends SpotifyItem {
    private Album album;
    private int trackNumber;
    private float length;
    private String artistName;
    private String artistId;
    private Map<String, String> idMap = new HashMap<String, String>();

    public Track(String id, String name, float popularity) {
        super(id, name, popularity);
    }

    public Album getAlbum() {
        return album;
    }

    void setAlbum(Album album) {
        this.album = album;
    }

    public String getArtistId() {
        return artistId;
    }

    void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Map<String, String> getIdMap() {
        return idMap;
    }

    void addID(String id, String val) {
        idMap.put(id, val);
    }

    public float getLength() {
        return length;
    }

    void setLength(float length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" id: " + getId() + "\n");
        sb.append(" name: " + getName() + "\n");
        sb.append(" popularity: " + getPopularity() + "\n");
        sb.append(" artistId: " + getArtistId() + "\n");
        sb.append(" artistName: " + getArtistName() + "\n");
        sb.append(" album: " + getAlbum() + "\n");
        sb.append(" trackNumber: " + getTrackNumber() + "\n");
        sb.append(" trackLength: " + getLength() + "\n");
        sb.append(" ids: " + getIdMap().size() + "\n");
        for (String k : getIdMap().keySet()) {
            sb.append("    id: " + k + ":" + getIdMap().get(k));
        }
        return sb.toString();
    }
}
