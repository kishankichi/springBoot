package com.movie.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
		moviesListStub.add(new MovieEntity(1, "Bheeshma", "nitin", "telugu", "https://www.prime.com/23"));
		moviesListStub.add(new MovieEntity(2, "Maharshi", "Maheshbabu", "telugu", "https://www.youtube.com/movie/2"));
		moviesListStub.add(new MovieEntity(3, "oh baby", "samantha", "telugu", "https://www.prime.com/23"));
		moviesListStub.add(new MovieEntity(4, "Hit", "", "telugu", "https://www.netflix.com/123"));
	}

	@GetMapping("/movies")
	public String getMovies(Model model) {
		System.out.println("===== inside movies Api =====");
		List<MovieEntity> moviesList = service.getAllMovies();
		model.addAttribute("movies", moviesList);
		return "movie/movie.html";
	}

	@PostMapping("/add")
	public String addMovie(MovieEntity movie) {
		System.out.println("===== inside addMovie =====");
		if (movie != null) {
			service.addMovie(movie);
		} else {
			System.out.println("invalid movie entity");
		}

		return "redirect:/movies";
	}

	@PostMapping("/delete")
	public String deleteMovie(MovieEntity movie) {
		System.out.println("===== inside deleteMovie =====");
		if (movie != null) {
			service.deleteMovie(movie);
		} else {
			System.out.println("invalid movie entity");
		}
		return "redirect:/movies";
	}

	@PostMapping("/resetList")
	public String resetList() {
		System.out.println("===== inside resetList =====");
		service.deleteAll();
		return "redirect:/movies";
	}

	@GetMapping("/movies-stub")
	public String getMovieStub(Model model) {
		System.out.println("===== inside movies-stub Api =====");
		model.addAttribute("movies", moviesListStub);
		return "movie/movie.html";
	}
}
