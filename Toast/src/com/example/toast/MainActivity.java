package com.example.toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void clickToastLong(View view){
		
		//トーストLong（長時間）
		Toast.makeText(this, "ボタンを押しました。（Long）", Toast.LENGTH_LONG).show();
		
	}
	
	public void clickToastShort(View view){
		
		//トーストShort(短時間)
		Toast.makeText(this, "ボタンを押しました。（Short）", Toast.LENGTH_SHORT).show();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
