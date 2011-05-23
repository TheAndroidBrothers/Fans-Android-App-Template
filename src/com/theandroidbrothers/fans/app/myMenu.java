package com.theandroidbrothers.fans.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class myMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		ImageButton bQuotes = (ImageButton) findViewById(R.id.quotes);
		bQuotes.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent ("com.theandroidbrothers.fans.app.QUOTESCATEGORIES"));
			}
		});
	}

	
	
}
