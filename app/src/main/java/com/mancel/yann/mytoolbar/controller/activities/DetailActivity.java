package com.mancel.yann.mytoolbar.controller.activities;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.mancel.yann.mytoolbar.R;

public class DetailActivity extends AppCompatActivity {

    // FIELDS --------------------------------------------------------------------------------------

    private Toolbar mToolbar;

    // METHODS -------------------------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Associates the layout file to this class
        setContentView(R.layout.activity_detail);

        // Configures the ToolBar field
        this.configureToolBar();
    }

    /**
     * Configures the ToolBar field
     */
    private void configureToolBar() {
        // Initializes the ToolBar field thanks to the XML file
        this.mToolbar = (Toolbar) findViewById(R.id.toolbar);

        // Adds the ToolBar field to the activity
        setSupportActionBar(this.mToolbar);

        // Gets a Support ActionBar object corresponding to this ToolBar
        ActionBar actionBar = getSupportActionBar();

        // Enables the Up Button
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
