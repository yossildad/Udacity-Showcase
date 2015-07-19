package com.example.tamar.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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
    /** Called when the user touches the button */
    public void ShowToast (View view) {
        int intId = view.getId();
        int duration = Toast.LENGTH_SHORT;
        switch (intId){
            case R.id.btnSpf: {
                Toast tsMessag = Toast.makeText(getBaseContext(),"Spotify Streamer",duration);
                tsMessag.show();
                break;
            }
            case R.id.btnScore: {
                Toast tsMessag = Toast.makeText(getBaseContext(),"Scoring App",duration);
                tsMessag.show();
                break;
            }
            case R.id.btnBuild: {
                Toast tsMessag = Toast.makeText(getBaseContext(),"Bigger my app",duration);
                tsMessag.show();
                break;
            }
            case R.id.btnCaps: {
                Toast tsMessag = Toast.makeText(getBaseContext(),"Capstone",duration);
                tsMessag.show();
                break;
            }
            case R.id.btnLibrary: {
                Toast tsMessag = Toast.makeText(getBaseContext(),"Library",duration);
                tsMessag.show();
                break;
            }
            case R.id.btnXYZ: {
                Toast tsMessag = Toast.makeText(getBaseContext(),"XYZ",duration);
                tsMessag.show();
                break;
            }
            default:
                Toast tsMessag = Toast.makeText(getBaseContext(),"Unknown App",duration);
                tsMessag.show();
                break;
        }
    }

}
