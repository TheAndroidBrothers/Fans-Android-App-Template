package com.theandroidbrothers.fans.app;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class quotesCategories extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setListAdapter(new ArrayAdapter<String>(this,R.layout.categories,Categories));
		
		ListView list = getListView();
		list.setTextFilterEnabled(true);
		list.setOnItemClickListener(new OnItemClickListener(){

			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// Items Link to other activities using the arg2
				switch(arg2){
				case 0:
				startActivity(new Intent("com.theandroidbrothers.fans.app.APOSTOLIC"));
				break;
				case 1:
					startActivity(new Intent("com.theandroidbrothers.fans.app.PROPHETICMOV"));
					break;
				case 2:
					startActivity(new Intent("com.theandroidbrothers.fans.app.APOSTOLIC"));
					break;
				case 3:
					startActivity(new Intent("com.theandroidbrothers.fans.app.PROPHETICMOV"));
					break;
				case 4:
					startActivity(new Intent("com.theandroidbrothers.fans.app.PROPHETICMOV"));
					break;
				default:
					Toast.makeText(getApplicationContext(), "No Category yet, Sorry. :-(", 2000).show();
				}
			}
			
		});
		
	}
	// Category List Array
	static final String[] Categories = new String[]{
		"Apostolic Reformation", "Prophetic Movement", "Spiritual Gifts", "Marketplace Ministry", "Mom Hamon Quotes", "Category 6", "Category 7", "Category 8", "Category 9", "Category 10", "Category 11"
	};
}
