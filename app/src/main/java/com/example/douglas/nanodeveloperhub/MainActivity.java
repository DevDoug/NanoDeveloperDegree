package com.example.douglas.nanodeveloperhub;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener {

    public List<Button> mProjectButtons = new ArrayList<Button>(NanoConstants.NUMBER_OF_BUTTONS);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initGuiComponents(); //inits our widgets and gui components
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

    public void initGuiComponents(){

        for(int i = 0; i < NanoConstants.NUMBER_OF_BUTTONS;i++){ //assign buttons
            Button addButton = (Button) findViewById(getResources().getIdentifier("project_button_" + String.valueOf(i), "id", getPackageName()));
            addButton.setText(getResources().getStringArray(R.array.project_names)[i]);
            addButton.setOnClickListener(this);
            mProjectButtons.add(addButton);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.project_button_0:
                Toast.makeText(this,String.format(getString(R.string.button_toast), getResources().getStringArray(R.array.project_names)[0]), Toast.LENGTH_LONG).show();
                break;
            case R.id.project_button_1:
                Toast.makeText(this,String.format(getString(R.string.button_toast), getResources().getStringArray(R.array.project_names)[1]), Toast.LENGTH_LONG).show();
                break;
            case R.id.project_button_2:
                Toast.makeText(this,String.format(getString(R.string.button_toast), getResources().getStringArray(R.array.project_names)[2]), Toast.LENGTH_LONG).show();
                break;
            case R.id.project_button_3:
                Toast.makeText(this,String.format(getString(R.string.button_toast), getResources().getStringArray(R.array.project_names)[3]), Toast.LENGTH_LONG).show();
                break;
            case R.id.project_button_4:
                Toast.makeText(this,String.format(getString(R.string.button_toast), getResources().getStringArray(R.array.project_names)[4]), Toast.LENGTH_LONG).show();
                break;
            case R.id.project_button_5:
                Toast.makeText(this,String.format(getString(R.string.button_toast), getResources().getStringArray(R.array.project_names)[5]), Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }
}
