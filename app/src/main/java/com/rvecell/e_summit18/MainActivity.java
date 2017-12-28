package com.rvecell.e_summit18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        //toolbar.setTitle("E-Summit-2018");
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.ecell_white);
    }

}

