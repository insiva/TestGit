package com.example.guankouzzh.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvTest=(TextView)this.findViewById(R.id.tvTest);
        this.tvTest.setText("TestGit!!!");
    }
}
