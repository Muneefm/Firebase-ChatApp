package com.mnf.chatapp;

/**
 * Created by Muneef on 02/12/2016.
 */

public class Model {
   private String name;
    private String text;
    private String photoUrl;

  public Model(){

  }
    public Model(String name,String text,String photoUrl){
        this.name = name;
        this.text = text;
        this.photoUrl = photoUrl;
    }


    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name = name;
    }


    public String getText(){
        return text;
    }
    public void  setText(String text){
        this.text = text;
    }


    public String getPhotoUrl(){
        return photoUrl;
    }
    public void  setPhotoUrl(String photoUrl){
        this.photoUrl = photoUrl;
    }



}
