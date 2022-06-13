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
    TextView txtView1= (TextView) findViewById(R.id.textView1);
    TextView txtView2= (TextView) findViewById(R.id.textView2);
    TextView txtView3= (TextView) findViewById(R.id.textView4);
    Bundle b=getIntent().getExtras();
    String user=b.getString( "username");
    String pass=b.getString("password" );
    String usertv=b.getString("tvusername" );
    String passtv=b.getString("tvpassword" );
    txtView1.setText(txtView1.getText());
    txtView2.setText(usertv + user);
    txtView3.setText(passtv + pass);
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
        Intent Intent2=new Intent(this,MainActivity.class);
        startActivity(Intent2);
    }
}
