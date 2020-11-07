package com.ivanfaathirza.daftarfilm;

/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menampilkan daftar film yang sedang tayang
 * berdasarkan instansiasi objek
 */

public class IF110119003Latihan32DaftarFilm {


    public static void main(String[] args) {
        System.out.println("===Daftar Film Sedang Tayang===\n");
	    Film film = new Film();
	    film.filmName = "Venom";
	    film.filmGenre = "Action, Horror, Scifi";
	    film.filmRating = 8.5;
	    film.filmDuration = 120;
        film.nowPlaying();

	    Film film1 = new Film();
        film1.filmName = "Small Foot";
        film1.filmGenre = "Animation";
        film1.filmRating = 9.0;
        film1.filmDuration = 96;
        film1.nowPlaying();

        Film film2 = new Film();
        film2.filmName = "Crazy Rich Asian";
        film2.filmGenre = "Comedy";
        film2.filmRating = 7.8;
        film2.filmDuration = 119;
        film2.nowPlaying();

        Film film3 = new Film();
        film3.filmName = "Asih";
        film3.filmGenre = "Horror";
        film3.filmRating = 6.0;
        film3.filmDuration = 100;
        film3.nowPlaying();
    }
}
