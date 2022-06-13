package com.example.moustakim_splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Create",Toast.LENGTH_LONG).show();
        Intent intent=new Intent( this,SplashActivity.class);
        Button button=findViewById(R.id.button);
        View view = null;
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void
            onClick(View v) {
                Envoyer(view);
            }});
    }
    public void Envoyer(View view){
        EditText usernametxt=(EditText)findViewById(R.id.usernameField);
        EditText passwordtxt=(EditText)findViewById(R.id.passwordField);
        TextView usernametv=(TextView)findViewById(R.id.usernameV);
        TextView passwordtv=(TextView)findViewById(R.id.passwordV);
        Intent Intent=new Intent(this,MainActivity2.class);
        Bundle bundle=new Bundle();
        bundle.putString("username",usernametxt.getText().toString());
        bundle.putString("password",passwordtxt.getText().toString());
        bundle.putString("tvusername",usernametv.getText().toString());
        bundle.putString("tvpassword",passwordtv.getText().toString());
        Intent.putExtras(bundle);
        startActivity(Intent);
    }

}