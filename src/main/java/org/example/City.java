package org.example;

/**
 * City class
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     *
     * @param city in constructor
     * @param province in constructor
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     *
     * @return city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     *
     * @return
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     *
     * @param city for compare 
     * @return city name
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }
}
