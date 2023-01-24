package day5;

import java.util.HashMap;

class CityNotFoundException extends Exception{

    public CityNotFoundException(String message) {
        super(message);
    }
    
}

public class City {
    HashMap<String,String> cities = new HashMap<String,String>();
    public void setCities(String zip,String city){
        cities.put(zip,city);
    }
    public String getCityByZip(String zip) throws Exception{
        if( cities.containsKey(zip) ){
            return( cities.get(zip) );
        }
        else{
            throw new CityNotFoundException(" City not found");
        } 
    }
}
