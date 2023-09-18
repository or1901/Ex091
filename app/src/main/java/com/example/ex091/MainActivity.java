package com.example.ex091;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * @author    Ori Roitzaid <or1901 @ bs.amalnet.k12.il>
 * @version	  1
 * @since	  18/9/2023
 * The main activity:
 * It has a general menu of 3 colors - choosing each one changes the background color.
 * Also there is a button that moves to the second activity.
 */
public class MainActivity extends AppCompatActivity {
    LinearLayout mainLayout;
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
    }

    /**
     * This function presents the menu to the screen.
     * <p>
     *
     * @param menu The options menu in which you place your items.
     * @return You must return true for the menu to be displayed; if you return false it
     * will not be shown
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    /**
     * This function reacts to the selection of a menu item - changes the background color
     * according to the selected item.
     * <p>
     *
     * @param item The menu item that was selected.
     * @return boolean Return false to allow normal menu processing to proceed,
     * true to consume it here.
     */
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.menuRed)
            mainLayout.setBackgroundColor(Color.RED);
        else if(id == R.id.menuBlue)
            mainLayout.setBackgroundColor(Color.BLUE);
        else if(id == R.id.menuGreen)
            mainLayout.setBackgroundColor(Color.GREEN);

        return super.onOptionsItemSelected(item);
    }

    /**
     * This function moves to the next activity.
     * @param view The button that was clicked in order to move to the next activity.
     */
    public void nextActivity(View view) {
        si = new Intent(this, SecondActivity.class);
        startActivity(si);
    }
}