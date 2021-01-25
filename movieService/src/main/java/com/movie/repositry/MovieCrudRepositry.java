package com.movie.repositry;

import org.springframework.data.repository.CrudRepository;

import com.movie.model.MovieEntity;

public interface MovieCrudRepositry extends CrudRepository<MovieEntity, Long> {

}
