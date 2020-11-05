package com.ivanfaathirza.daftarfilm;

public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(){
        System.out.println("Judul Film : ".concat(filmName));
        System.out.println("Genre Film : ".concat(filmGenre));
        System.out.println("Rating Film : " + filmRating);
        System.out.println("Duration Film : " + filmDuration + "Menit\n");
    }
}
