package com.example.ruben.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyLogin extends AppCompatActivity {
    Button btnEntrar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylogin);
        getSupportActionBar().hide();
        btnEntrar = (Button) findViewById(R.id.btnEntrar);
        textView = (TextView) findViewById(R.id.textView);

        Typeface myFont = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        textView.setTypeface(myFont);

    }
    public void entrar(View view){
        Intent intent = new Intent(this,MyMain.class);
        startActivity(intent);
    }
}
