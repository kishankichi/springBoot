package com.movie.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieDetails {

	public MovieDetails(String comments, String userName) {
		super();
		this.comments = comments;
		this.userName = userName;
	}

	private String comments;
	private String userName;

}
