Welcome to JSpot - the Java client for the Spotify metadata API.

This is a version .1 release that supports the **search** methods.

See the [JSpot Javadoc documentation](http://jspot.googlecode.com/svn/trunk/javadoc/index.html)

Sample code:

Print out the most popular tracks for the band _Weezer_:

```
        Spotify spotify = new Spotify();

        Result<Track> results = spotify.searchTrack("artist:weezer");
        for (Track track : results.getItems()) {
             System.out.printf("%.2f %s // %s // %s\n",
                  track.getPopularity(), track.getArtistName(),
                  track.getAlbum().getName(), track.getName());
        }
```