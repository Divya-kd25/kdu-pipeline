package com.caching.model;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

/**
 * Class defined to store response from the api
 */
@Getter
@Setter
public class GeocodeResponse {
    private List<GeocodeData> data;

    @Getter
    @Setter
    public static class GeocodeData {
        private double latitude;
        private double longitude;
        private String name;
        private String label;
        private double distance;
        private String region;
        private String country;
    }
}

