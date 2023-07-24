package aggregateOperations;

import java.util.ArrayList;

public class Album {

    String name;
    ArrayList<Track> tracks;


    Album(String name1){
        if(name == null){
            this.name = name1;
        }
        if(tracks == null){
            tracks = new ArrayList<Track>();
        }
    }

    String getName(){
        return name;
    }


    ArrayList<Track> getTracks(){
        return tracks;
    }
    void addTrack(Track track){
        tracks.add(track);
    }

   static ArrayList<Album> createAlbums(){

        ArrayList<Album> albums = new ArrayList<>();

        Album album1 = new Album("The Black Album");
        Album album2 = new Album("Boys");
        Album album3 = new Album("Axel");

        Track t1 = new Track(1);
        Track t2 = new Track(2);
        Track t3 = new Track(3);
        Track t4 = new Track(4);
        Track t5 = new Track(5);
        Track t6 = new Track(6);

        album1.addTrack(t1);
        album1.addTrack(t2);
        album1.addTrack(t3);
        album1.addTrack(t4);
        album1.addTrack(t5);
        album1.addTrack(t6);
        album2.addTrack(t1);
        album2.addTrack(t2);
        album2.addTrack(t3);
        album3.addTrack(t4);
        album3.addTrack(t5);
        album3.addTrack(t6);

        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

//        for (Album a : albums){
//            System.out.println(a.name);
//        }

        return albums;


    }

    public static void main(String[] args) {
        createAlbums();
    }
}
