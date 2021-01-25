package com.movie.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.movie.model.MovieEntity;
import com.movie.service.MovieService;

@Controller
public class MovieController {
	@Autowired
	MovieService service;

	List<MovieEntity> moviesListStub = null;

	@PostConstruct
	public void init() throws Exception {
		moviesListStub = new ArrayList<MovieEntity>();
		moviesListStub.add(new MovieEntity(1, "Bheeshma", "nitin", "telugu"));
		moviesListStub.add(new MovieEntity(2, "Maharshi", "Maheshbabu", "telugu"));
		moviesListStub.add(new MovieEntity(3, "oh baby", "samantha", "telugu"));
		moviesListStub.add(new MovieEntity(4, "Hit", "", "telugu"));
	}

	@GetMapping
	public String index() {
		return "redirect:/movies";
	}

	@GetMapping("/movies")
	public String getMovies(Model model) {
		System.out.println("===== inside movies Api =====");
		List<MovieEntity> moviesList = service.getAllMovies();
		model.addAttribute("movies", moviesList);
		return "movie/movie.html";
	}

	@GetMapping("/movies-stub")
	public String getMovieStub(Model model) {
		System.out.println("===== inside movies-stub Api =====");
		model.addAttribute("movies", moviesListStub);
		return "movie/movie.html";
	}
}
