/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.google.code.jspot;

/**
 *
 * @author plamere
 */
public class Artist extends SpotifyItem {

    public Artist(String id, String name, float popularity) {
        super(id, name, popularity);
    }

    public Artist(String id, String name) {
        super(id, name);
    }

}
