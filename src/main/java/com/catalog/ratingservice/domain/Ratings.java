package com.catalog.ratingservice.domain;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.security.DenyAll;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ratings {

    private String movieId;
    private int rating;
}
