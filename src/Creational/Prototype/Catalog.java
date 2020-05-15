package Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
	private Map<MovieType, Movie> movies = new HashMap<MovieType, Movie>();

	public Catalog() {
		createCatalog();
	}

	public Movie cloneMovie(final MovieType movieType) {
		Movie movie = null;

		try {
			movie = (Movie) (movies.get(movieType)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return movie;
	}

	private void createCatalog() {
		HorrorMovie horrorMovie = new HorrorMovie();
		horrorMovie.setTitle("Boo!");
		horrorMovie.setDuration(120);
		horrorMovie.setScareScenes(10);
		
		MusicalMovie musicalMovie = new MusicalMovie();
		musicalMovie.setTitle("Mi Mi Land");
		musicalMovie.setDuration(135);
		musicalMovie.setMusics(15);
		
		RomanceMovie romanceMovie = new RomanceMovie();
		romanceMovie.setTitle("Rock Town");
		romanceMovie.setDuration(110);
		romanceMovie.setCouples(1);
		
		movies.put(MovieType.ROMANCE, romanceMovie);
		movies.put(MovieType.HORROR, horrorMovie);
		movies.put(MovieType.MUSICAL, musicalMovie);
	}
}
