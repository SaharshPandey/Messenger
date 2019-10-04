package com.saharsh.chatapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;
    Button btn_login;
    Typeface MR,MRR;
    ProgressDialog dialog;

    FirebaseAuth auth;
    TextView forgot_password, login_tv, msg_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        MRR = Typeface.createFromAsset(getAssets(), "fonts/myriadregular.ttf");
        MR = Typeface.createFromAsset(getAssets(), "fonts/myriad.ttf");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Login");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        auth = FirebaseAuth.getInstance();

        login_tv = findViewById(R.id.login_tv);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btn_login = findViewById(R.id.btn_login);
        forgot_password = findViewById(R.id.forgot_password);
        msg_tv = findViewById(R.id.msg_tv);

        msg_tv.setTypeface(MRR);
        login_tv.setTypeface(MR);
        email.setTypeface(MRR);
        password.setTypeface(MRR);
        btn_login.setTypeface(MRR);
        forgot_password.setTypeface(MRR);

        forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, ResetPasswordActivity.class));
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt_email = email.getText().toString();
                String txt_password = password.getText().toString();

                Utils.hideKeyboard(LoginActivity.this);

                if (TextUtils.isEmpty(txt_email) || TextUtils.isEmpty(txt_password)){
                    Toast.makeText(LoginActivity.this, "All fields are required", Toast.LENGTH_SHORT).show();
                } else {

                    dialog = Utils.showLoader(LoginActivity.this);
                    auth.signInWithEmailAndPassword(txt_email, txt_password)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()){
                                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                        if(dialog!=null){
                                        dialog.dismiss();
                                        }
                                        startActivity(intent);
                                        finish();
                                    } else {
                                        if(dialog!=null){
                                        dialog.dismiss();
                                        }
                                        Toast.makeText(LoginActivity.this, "Authentication failed!", Toast.LENGTH_SHORT).show();

                                    }
                                }
                            });
                }
            }
        });
    }
}
