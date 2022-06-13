package com.example.moustakim_splash_screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);
    TextView txtv1= (TextView) findViewById(R.id.textView1);
    TextView txtv2= (TextView) findViewById(R.id.textView2);
    TextView txtv3= (TextView) findViewById(R.id.textView4);
    Bundle b=getIntent().getExtras();
    String user=b.getString( "username");
    String pass=b.getString("password" );
    String usertv=b.getString("tvusername" );
    String passtv=b.getString("tvpassword" );
    txtv1.setText(txtv1.getText());
    txtv2.setText(usertv + user);
    txtv3.setText(passtv + pass);
    Button button2=findViewById(R.id.button2);
    View view=null;
    button2.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            retour(view);
        }
    });
}
    public void retour(View view){
        Intent myIntent2=new Intent(this,MainActivity.class);
        startActivity(myIntent2);
    }
}
