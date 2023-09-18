package com.example.ex091;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
    }

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
     * @return True or False.
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
}