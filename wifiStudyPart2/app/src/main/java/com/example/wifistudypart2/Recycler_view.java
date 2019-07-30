package com.example.wifistudypart2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Recycler_view extends AppCompatActivity {

    RecyclerView recyclerView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = findViewById(R.id.Recycler_view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager( this ) ;
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        List<ModelClass>modelClassList = new ArrayList<>();
        modelClassList.add( new ModelClass( R.drawable.logo, "shalini negi " , "btech"));
        modelClassList.add( new ModelClass(  R.drawable.logo , " aman negi " , "betech" ));
        modelClassList.add( new ModelClass(   R.drawable.common_google_signin_btn_icon_dark_focused , "rashmi negi " , "job"));
        modelClassList.add( new ModelClass(   R.drawable.common_google_signin_btn_icon_dark_focused , " Ms negi " , "job"));
        modelClassList.add( new ModelClass(  R.drawable.common_google_signin_btn_icon_dark_focused  , "Rajita negi " , "house wife" ));
        modelClassList.add( new ModelClass(   R.drawable.common_google_signin_btn_icon_dark_focused , "Ruchi negi " , "study"));
        modelClassList.add( new ModelClass( R.drawable.common_google_signin_btn_icon_dark_focused   , "Rajber negi " ,"job" ));
        modelClassList.add( new ModelClass(  R.drawable.common_google_signin_btn_icon_dark_focused  , "parmber negi" , "study" ));
        modelClassList.add( new ModelClass(  R.drawable.common_google_signin_btn_icon_dark_focused  , "arush negi " , "study"));
        modelClassList.add( new ModelClass(   R.drawable.common_google_signin_btn_icon_dark_focused , "onika negi " , "play"));

       Adapter adapter = new Adapter ( modelClassList) ;
       recyclerView.setAdapter (  adapter ) ;
       adapter.notifyDataSetChanged();


    }
}
