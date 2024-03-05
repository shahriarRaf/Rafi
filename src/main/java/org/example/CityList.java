package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
   
    private List<City> cities = new ArrayList<>();

    /**
     * This adds 
     *
     * @param city
     *      This is the city 
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     *  Removes
     * @param city be removed.
     */
    public void delete(City city){
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * sortByCityName 
     * @param sortByCityName for sorting
     *
     * @return sorted
     */

    public List<City> getCities(boolean sortByCityName)  {

        List<City> cityList = cities;
        if (sortByCityName) {
            Collections.sort(cityList);
        } else {
            cityList.sort(Comparator.comparing(City::getProvinceName));
        }

        return cityList;
    }

    /**
     * Returns the number of cities 
     * @return  The size 
     */
    public  int count(){
       return cities.size();
    }
}