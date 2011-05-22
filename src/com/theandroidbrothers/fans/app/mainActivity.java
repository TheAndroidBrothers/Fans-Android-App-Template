package com.theandroidbrothers.fans.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class mainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread logoTimer = new Thread(){
        	public void run(){
        		try {
        			int logoTimer  = 0;
        			while(logoTimer <5000){
        				sleep(100);
        				logoTimer = logoTimer +100;
        			}
        			startActivity(new Intent("com.theandroidbrothers.fans.app.CLEARSCREEN"));
        		} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		
        		finally {
        			finish();
        		}
        	}
        };
        logoTimer.start();
    }

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
}