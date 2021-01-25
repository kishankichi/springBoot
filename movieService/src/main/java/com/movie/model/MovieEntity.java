package com.movie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Kishan.c.s MovieEntity MovieEntity MovieEntity
 */
@Entity
public class MovieEntity {

	public MovieEntity() {
	}

	public MovieEntity(long id, String movieName, String cast, String language) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.cast = cast;
		this.language = language;
	}

	/**
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	/**
	 * movieName
	 */
	private String movieName;
	/**
	 * cast
	 */
	private String cast;
	/**
	 * language
	 */
	private String language;

	/**
	 * getId
	 * 
	 * @return
	 */
	public long getId() {
		return id;
	}

	/**
	 * setId
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * getMovieName
	 * 
	 * @return
	 */
	public String getMovieName() {
		return movieName;
	}

	/**
	 * setMovieName
	 * 
	 * @param movieName
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	/**
	 * @return
	 */
	public String getCast() {
		return cast;
	}

	/**
	 * getLanguage
	 * 
	 * @param cast
	 */
	public void getLanguage(String cast) {
		this.cast = cast;
	}

	/**
	 * getLanguage
	 * 
	 * @return
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * setLanguage
	 * 
	 * @param language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/*
	 * (non-Javadoc) toString
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MovieEntity [movieId=" + id + ", movieName=" + movieName + ", cast=" + cast + ", language=" + language
				+ "]";
	}

}
