package com.example.ex091;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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
 * The second activity:
 * It has a menu of 4 colors - like in the main activity but plus one additional color.
 * Also there is a button that moves back to the main activity.
 */
public class SecondActivity extends AppCompatActivity {
    LinearLayout secondLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondLayout = (LinearLayout) findViewById(R.id.secondLayout);
    }

    /**
     * This function presents the menu to the screen - also adds the additional fourth color to it.
     * <p>
     *
     * @param menu The options menu in which you place your items.
     * @return You must return true for the menu to be displayed; if you return false it
     * will not be shown
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);

        menu.add(0, 0, 400, "Yellow");

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
            secondLayout.setBackgroundColor(Color.RED);
        else if(id == R.id.menuBlue)
            secondLayout.setBackgroundColor(Color.BLUE);
        else if(id == R.id.menuGreen)
            secondLayout.setBackgroundColor(Color.GREEN);
        else if(id == 0)
            secondLayout.setBackgroundColor(Color.YELLOW);

        return super.onOptionsItemSelected(item);
    }

    /**
     * This function returns back to the main activity.
     * @param view The button that was clicked in order to go back.
     */
    public void goBack(View view) {
        finish();
    }
}