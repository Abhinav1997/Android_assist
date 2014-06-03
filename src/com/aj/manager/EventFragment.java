package com.aj.manager;

import java.util.ArrayList;

import com.aj.manager.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class EventFragment extends Fragment{
	TextView view_text;
	EditText text;
	Button button;
	ListView listview;
	private ArrayList<String> list;
	
	ArrayAdapter<String> adapter;

	
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
		View myFragmentView = inflater.inflate(R.layout.event,container,false);
		
		if(list==null)
			list_init();
		
		listview = (ListView)myFragmentView.findViewById(R.id.list_eve);
		adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,list);
		listview.setAdapter(adapter);
		button = (Button)myFragmentView.findViewById(R.id.button);
		text = (EditText)myFragmentView.findViewById(R.id.ins);
button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				list.add(text.getText().toString());
				adapter.notifyDataSetChanged();
				text.setText("");
				
			}
		});
        
		return myFragmentView; 		
		
	}
	
	private void list_init(){
		
		list = new ArrayList<String>();
		list.add("Day");
		list.add("Meeting");
		list.add("College");
		list.add("Night");
	}
}
	
	
	