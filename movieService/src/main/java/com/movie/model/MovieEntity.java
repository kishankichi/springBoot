package com.movie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovieEntity {

	public MovieEntity() {
	}

	public MovieEntity(long id, String movieName, String cast, String language, String movieLink) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.cast = cast;
		this.language = language;
		this.movieLink = movieLink;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String movieName;
	private String cast;
	private String language;
	private String movieLink;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getCast() {
		return cast;
	}

	public void getLanguage(String cast) {
		this.cast = cast;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMovieLink() {
		return movieLink;
	}

	public void setMovieLink(String movieLink) {
		this.movieLink = movieLink;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	@Override
	public String toString() {
		return "MovieEntity [id=" + id + ", movieName=" + movieName + ", cast=" + cast + ", language=" + language
				+ ", movieLink=" + movieLink + "]";
	}

}
