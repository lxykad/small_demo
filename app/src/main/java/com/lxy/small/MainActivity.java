package com.lxy.small;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import net.wequick.small.Small;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initEvents();
    }

    private void initEvents() {
        Button btMain = (Button) findViewById(R.id.bt_main);
        btMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"main",Toast.LENGTH_SHORT).show();
                Small.openUri("main", MainActivity.this);
            }
        });


    }
}
