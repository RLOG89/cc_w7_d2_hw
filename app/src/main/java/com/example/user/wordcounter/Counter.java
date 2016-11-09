package com.example.user.wordcounter;

/**
 * Created by user on 08/11/2016.
 */

public class Counter {

    private String strToCount;

    public Counter (String strToCount){
        this.strToCount =  strToCount;
    }

    public String getStrToCount(){
        return strToCount;
    }

    public Integer getStrCount() {
         return strToCount.split("\\s+").length;
    }

}
