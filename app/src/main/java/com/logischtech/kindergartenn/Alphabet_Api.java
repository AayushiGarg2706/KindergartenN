package com.logischtech.kindergartenn;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Aayushi.Garg on 24-05-2018.
 */

public class Alphabet_Api implements Serializable{

    @SerializedName("name ")
    public String name ;

    @SerializedName( "title" )
    public String title;

    @SerializedName( "word" )
    public String word;

    @SerializedName( "image" )
    public String image;

    public String getName(){
        return this.name ;
    }

    public String getTitle(){
        return this.title ;
    }

    public String getWord(){
        return this.word;
    }

    public String getImage(){
        return this.image ;
    }






}
