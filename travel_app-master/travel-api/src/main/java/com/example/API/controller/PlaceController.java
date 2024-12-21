package com.example.travelapi.controller;

import com.example.travelapi.model.Place;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "*") // Cho phép truy cập từ mọi nguồn (origin)
public class PlaceController {

    @GetMapping("/api/places/getAllPlace")
    public List<Place> getAllPlaces() {
        return Arrays.asList(
                 new Place("Hoi An", 4.0, "/images/hoian.jpg"),
                new Place("Sai Gon", 4.5, "/images/saigon.jpg"),
                new Place("Da Lat", 4.7, "/images/dalat.jpg")
        );
    }
}
