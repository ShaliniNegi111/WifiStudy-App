package com.example.wifistudypart2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {



    private Button email;


   public  void newActivity ( View view )
    {
        Toast.makeText(getApplicationContext(),"shalini" , Toast.LENGTH_LONG);
        Intent intent = new Intent(getApplicationContext(), loginpage.class) ;
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        /*Intent intent = new Intent(getApplicationContext(), loginpage.class) ;
        startActivity(intent);*/
        /*email = ( Button)findViewById(R.id.google) ;

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(getApplicationContext(),"shalini" , Toast.LENGTH_LONG);
                Intent intent = new Intent(getApplicationContext(), loginpage.class) ;
                startActivity(intent);
            }
        });*/

    }
}
