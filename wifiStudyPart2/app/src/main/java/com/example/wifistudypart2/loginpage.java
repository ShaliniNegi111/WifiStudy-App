package com.example.wifistudypart2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import android.content.Intent;


public class loginpage extends AppCompatActivity
{


    private EditText email ;
    private EditText password ;
    private Button button ;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private ProgressDialog progressDialog;
    private FirebaseAuth mAuth;
    private static final String TAG = "loginpage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);


        /*Intent intent = new Intent(getApplicationContext() , CourceOption.class);
        startActivity(intent);*/
        mAuth = FirebaseAuth.getInstance();

        progressDialog = new ProgressDialog(this);
        email = (EditText)findViewById(R.id.id1);
        password = (EditText)findViewById(R.id.id2);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (view == button)
                {
                    register();
                }

            }
        }) ;


    }


    private void register () {
        String name = email.getText().toString().trim();
        String pw = password.getText().toString().trim();
        progressDialog.setMessage("wait");
        progressDialog.show();
        mAuth.createUserWithEmailAndPassword(name, pw)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            Toast.makeText(getApplicationContext(), "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();

                        }
                    }
                });
    }



}

