package com.json.benzibama.android.menuapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by bama on 3/27/2015.
 */
public class SecondActivity extends ActionBarActivity {
    TextView text;
    Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlayout);
        // 1. get passed intent
        Intent intent = getIntent();

        // 2. get message value from intent
        String message = intent.getStringExtra("menuitem");
        String value = intent.getStringExtra("bookname");
        text = (TextView)findViewById(R.id.showtext);
        text.setText(String.format("Selected book is %s and submenu is %s ",value, message));
        exit=(Button) findViewById(R.id.exitButton);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
