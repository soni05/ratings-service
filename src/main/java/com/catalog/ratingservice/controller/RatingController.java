package com.catalog.ratingservice.controller;

import com.catalog.ratingservice.domain.Ratings;
import com.catalog.ratingservice.domain.UserRating;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @GetMapping("/{movieId}")
    public Ratings getRatingforMovieId(@PathVariable String movieId){

        return new Ratings(movieId, 3);
    }
    @GetMapping("users/{userId}")
    public UserRating getRatings(@PathVariable String userId){

        List<Ratings> ratings  = Arrays.asList(new Ratings("3", 3),
                        new Ratings("1",4),
                        new Ratings("2",5)
                );

        UserRating userRating = new UserRating(ratings);
        return  userRating;
    }
}
