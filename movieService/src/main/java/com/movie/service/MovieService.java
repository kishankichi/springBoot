package com.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.model.MovieEntity;
import com.movie.repositry.MovieCrudRepositry;

/**
 * @author Kishan.c.s MovieService
 */
@Service
public class MovieService {

	/**
	 * MovieCrudRepositry
	 */
	@Autowired
	private MovieCrudRepositry crudRepositry;

	/**
	 * getAllMovies
	 * 
	 * @return List
	 */
	public List<MovieEntity> getAllMovies() {
		return (List<MovieEntity>) crudRepositry.findAll();
	}

	/**
	 * addMovie
	 * 
	 * @param entity
	 */
	public void addMovie(MovieEntity entity) {
		crudRepositry.save(entity);
	}
}
