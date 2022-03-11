package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class which keeps track of the City List Objects
 */

public class CityList {

    private List<City> cities = new ArrayList<>();

    /**
     * This method throws a exception if the city to add is laready in the list
     * @param city
     * Expects a object from the City class named as city
     */

    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This method sorts the current list of city objects
     * @return list
     * List of City objects sorted based on the names of the city
     */
    public List<City> getCities() {
        List<City>  list = cities;
        //Collections.sort(list);
        return list;
    }
    /**
     * Return whether or not the given city belongs in the list
     * @param city
     * Expects a object from the City class named as city
     * @return cities.contains(city)
     * Returns True if it cointains the given city, False otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Check if a city is present in the list. If it does then remove it from the list, if not then throw an exception
     * @param city
     * Expects a object from the City class named as city
     */

    public void delete(City city) {
        return;
    }

    /**
     * Return how many cities are in the list
     * @return i
     * Returns number of cities in the list
     */
    public int countCities() {
        int i = 0;
        for (City city: cities) {
            i++;
        }
        return i;
    }

}
