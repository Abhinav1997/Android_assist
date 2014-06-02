package com.aj.manager;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class DeviceFragment extends ListFragment {
	
	
	String device[] = new String[]{
		"Charger",
		"Bluetooth",
		"Headphone",
		"Headset",
		"Add others"		
	};
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, device);
		
		
		setListAdapter(adapter);
		
		return super.onCreateView(inflater, container, savedInstanceState);
	}
	
	
	
/*	@Override
	public void onStart() {
		super.onStart();
		
		
		getListView().setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);		
	}*/
	
	
	
}
