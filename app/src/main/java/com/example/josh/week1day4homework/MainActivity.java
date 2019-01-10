package com.example.josh.week1day4homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvCookie;
    TextView tvCandy;
    TextView tvCake;
    TextView tvCream;
    TextView tvPizza;
    String saved = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCookie = findViewById(R.id.tvCookie);
        tvCandy = findViewById(R.id.tvCandy);
        tvCake = findViewById(R.id.tvCake);
        tvCream = findViewById(R.id.tvCream);
        tvPizza = findViewById(R.id.tvPizza);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnExecute:
                Intent intent = new Intent(this,NextActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("Value",saved);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.tvCake:
                saved = tvCake.getText().toString();
                break;
            case R.id.tvCandy:
                saved = tvCandy.getText().toString();
                break;
            case R.id.tvCookie:
                saved = tvCookie.getText().toString();
                break;
            case R.id.tvPizza:
                saved = tvPizza.getText().toString();
                break;
            case R.id.tvCream:
                saved = tvCream.getText().toString();
                break;
        }
    }

}
