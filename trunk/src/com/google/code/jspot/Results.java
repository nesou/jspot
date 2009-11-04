/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.google.code.jspot;

import java.util.List;

/**
 *
 * @author plamere
 */
public class Results<T extends SpotifyItem> {
    private int startIndex;
    private int totalResults;
    private int itemsPerPage;
    private List<T> items;

    public Results(int startIndex, int totalResults, int itemsPerpage, List<T> items) {
        this.startIndex = startIndex;
        this.totalResults = totalResults;
        this.itemsPerPage = itemsPerpage;
        this.items = items;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public int getNextPage() {
        int curPage = 1 + getStartIndex() / getItemsPerPage();
        return curPage + 1;
    }

    public boolean isLast() {
        return startIndex + getItemsPerPage() >= getTotalResults();
    }


    public List<T> getItems() {
        return items;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" startIndex:" + startIndex);
        sb.append(" totalResults: " + totalResults);
        sb.append(" itemsPerPage: " + itemsPerPage);
        int which = 0;
        for (SpotifyItem item : getItems()) {
            sb.append(which + ") " + item.getName() + "\n");
            sb.append(item);
            sb.append("\n");
            which++;
        }
        sb.append("\n");
        return sb.toString();
    }
}
