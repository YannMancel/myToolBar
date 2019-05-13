package com.mancel.yann.mytoolbar.controller.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.mancel.yann.mytoolbar.R;

public class MainActivity extends AppCompatActivity {

    // FIELDS --------------------------------------------------------------------------------------

    private Toolbar mToolbar;
    private ImageView mImageView;

    // METHODS -------------------------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Associates the layout file to this class
        setContentView(R.layout.activity_main);

        // Configures the ToolBar field
        this.configureToolBar();

        // Configures the ImageView field
        this.configureImageView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Creates a MenuInflater object to add the menu xml file to this activity
        getMenuInflater().inflate(R.menu.menu_activity_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Depending on the item Id
        switch (item.getItemId()) {

            case R.id.menu_activity_main_search: {
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.menu_activity_main_parameter: {
                Toast.makeText(this, "Parameter", Toast.LENGTH_SHORT).show();
                return true;
            }
            default: {
                return super.onOptionsItemSelected(item);
            }
        }
    }

    /**
     * Configures the ToolBar field
     */
    private void configureToolBar() {
        // Initializes the ToolBar field thanks to the XML file
        this.mToolbar = (Toolbar) findViewById(R.id.toolbar);

        // Adds the ToolBar field to the activity
        setSupportActionBar(this.mToolbar);
    }

    /**
     * Configures the ImageView field
     */
    private void configureImageView() {
        // Initializes the ImageView field thanks to the XML file
        this.mImageView = (ImageView) findViewById(R.id.activity_main_image);

        // Adds the Listener to the ImageView field
        this.mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Starts the DetailActivity class
                startDetailActivity();
            }
        });
    }

    /**
     * Starts the DetailActivity class
     */
    private void startDetailActivity() {
        // Creates an Intent object
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);

        // Start the DetailActivity class
        startActivity(intent);
    }
}
