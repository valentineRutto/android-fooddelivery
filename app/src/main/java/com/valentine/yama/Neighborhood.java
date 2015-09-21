package com.valentine.yama;

import android.app.ListActivity;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

public class Neighborhood extends ListActivity {
List<Getterandsetter> locs= new ArrayList<Getterandsetter>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neighborhood);

        ParseQuery<Getterandsetter> query=new ParseQuery<Getterandsetter>("location");
   query.findInBackground(new FindCallback<Getterandsetter>() {
       @Override
       public void done(List<Getterandsetter> list, ParseException e) {
if (e != null){
    Toast.makeText(Neighborhood.this, "Error" +e,Toast.LENGTH_SHORT).show();
}
       }
   });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_neighborhood, menu);
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
}

