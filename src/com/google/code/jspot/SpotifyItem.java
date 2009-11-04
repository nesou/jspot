/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.google.code.jspot;

/**
 *
 * @author plamere
 */
public class SpotifyItem {
    public static float UNKNOWN_POPULARITY = -1f;
    private String id;
    private String name;
    private float popularity;

    public SpotifyItem(String id, String name, float popularity) {
        this.id = id;
        this.name = name;
        this.popularity = popularity;
    }

    public SpotifyItem(String id, String name) {
        this(id, name, UNKNOWN_POPULARITY);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPopularity() {
        return popularity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SpotifyItem other = (SpotifyItem) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return  name + " " + popularity + " " + id;
    }
}
