package ca.ualberta.ssrg.movies.es;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;


public interface IMovieManager {

	public List<Movie> searchMovies(String searchString, String field);
	public void addMovie(Movie movie);
	public void deleteMovie(int id);
	public Movie getMovie(int id);
}
