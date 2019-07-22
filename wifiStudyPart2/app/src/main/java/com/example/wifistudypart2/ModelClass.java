package com.example.wifistudypart2;

import java.security.PrivateKey;

public class ModelClass {


    private int imageresource;

    private String  tiltle;

    private String  text;


    public ModelClass ( int imageresource , String  tiltle , String  text )
    {
              this.imageresource = imageresource;
              this.tiltle = tiltle ;
              this.text = text ;
    }

    public int getimageresource()
    {
        return imageresource ;
    }

    public String  getTiltle()
    {
        return tiltle ;
    }

    public String  getText()
    {
        return text ;
    }
}
