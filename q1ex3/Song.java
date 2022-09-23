/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1ex3;

/**
 *
 * @author AIELLE
 */
public class Song {
    String title, artist;
    int Streams;
    

    public Song () {
    title = "Never Gonna Give You Up";
    artist = "Rick Astley";
    Streams = 1000000000;
}

    /**
     *
     */
    public void returnSong (){
        System.out.println(title + artist + Streams);
}
}
