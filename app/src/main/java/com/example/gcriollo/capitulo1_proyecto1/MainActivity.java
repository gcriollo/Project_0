package com.example.gcriollo.capitulo1_proyecto1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void clkSptfStrmr(View v){
        Toast.makeText(getApplicationContext(), "Btn Spotify Streamer was pressed", Toast.LENGTH_SHORT).show();
    }

    public void clkSprD(View v){
        Toast.makeText(getApplicationContext(), "Btn Super Duo was pressed", Toast.LENGTH_SHORT).show();
    }

    public void clkBldTBggr(View v){
        Toast.makeText(getApplicationContext(), "Btn Build it Bigger was pressed", Toast.LENGTH_SHORT).show();
    }

    public void clkXYZRdr(View v){
        Toast.makeText(getApplicationContext(), "Btn XYZ Reader was pressed", Toast.LENGTH_SHORT).show();
    }

    public void clkCpstn(View v){
        Toast.makeText(getApplicationContext(), "Btn Capstone was pressed", Toast.LENGTH_SHORT).show();
    }

}
