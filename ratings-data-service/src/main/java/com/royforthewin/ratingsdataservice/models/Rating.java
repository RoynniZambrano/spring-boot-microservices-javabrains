package com.royforthewin.ratingsdataservice.models;

import lombok.Data;

@Data
public class Rating {

    private String movieId;
    private int rating;

    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }
}
