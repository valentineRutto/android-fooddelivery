package com.valentine.yama;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by valentine on 9/21/15.
 */
@ParseClassName("Neighbourhoods")
public class Getterandsetter extends ParseObject {
    public String getLoc(){
        return getString("location");
    }
    public void setLoc(String loc){
       put("location",loc);
    }
@Override
    public String toString(){
    return getString("location");
}

}
