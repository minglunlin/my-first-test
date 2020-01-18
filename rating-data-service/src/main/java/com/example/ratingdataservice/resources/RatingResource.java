package com.example.ratingdataservice.resources;

import com.example.ratingdataservice.models.Rating;
import com.example.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){

        return new Rating(movieId, 7);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("345", 3)
        );

        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }


}
