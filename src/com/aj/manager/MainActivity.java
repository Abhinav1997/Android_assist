package com.aj.manager;

import com.aj.manager.R;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
       
        actionBar.setDisplayShowTitleEnabled(true);
        
        
        Tab tab = actionBar.newTab()
        		.setText("Devices")
        		.setTabListener(new CustomTabListener<DeviceFragment>(this, "Devices", DeviceFragment.class));
        	
        
        actionBar.addTab(tab);
        
        
       
        tab = actionBar.newTab()
        		.setText("Events")
        		.setTabListener(new CustomTabListener<EventFragment>(this, "Events", EventFragment.class));
        		

        
        actionBar.addTab(tab);            
        
        
    }

@Override
public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	//getMenuInflater().inflate(R.menu.main, menu);
	//return true;
	MenuInflater mif = getMenuInflater();
	mif.inflate(R.menu.action, menu);
	return super.onCreateOptionsMenu(menu);
}

@Override
public boolean onOptionsItemSelected(MenuItem item){
	switch(item.getItemId()){
	
	
		
	}
	
	return super.onOptionsItemSelected(item);
	
}
}