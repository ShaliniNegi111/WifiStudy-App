package com.example.wifistudypart2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import android.content.Intent;


public class loginpage extends AppCompatActivity
{


    private EditText email ;
    private EditText password ;
    private Button button ;

    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);
        email = (EditText)findViewById(R.id.id1);
        password = (EditText)findViewById(R.id.id2);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this) ;


    }


    private void register () {
        String name = email.getText().toString().trim();
        String pw = password.getText().toString().trim();
        progressDialog.setMessage("wait");
        progressDialog.show();
        firebaseAuth.createUserWithEmailAndPassword(name, pw).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if ( task.isSuccessful())
                {
                    Toast.makeText ( getApplicationContext() , "Succesful" , Toast.LENGTH_SHORT).show() ;

                    Intent myIntent = new Intent(getApplicationContext(), CourceOption.class);
                    startActivity( myIntent );

                }
                else
                {
                    Toast.makeText ( getApplicationContext(), " Not Succesful" , Toast.LENGTH_SHORT).show() ;
                }

            }
        });
    }

    public void onClick(View view) {
        if (view == button)
        {
            register();
        }

    }

}

