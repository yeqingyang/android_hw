package com.example.hw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class PicActivity extends Activity {
	int[] images = new int[] { R.drawable.balloon, R.drawable.bear, };
	int curImg = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.pic);
		RelativeLayout main = (RelativeLayout) findViewById(R.id.root);
		final ImageView image = new ImageView(this);
		main.addView(image);
		image.setImageResource(images[0]);
		image.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (curImg >= 1) {
					curImg = -1;
				}
				image.setImageResource(images[++curImg]);
			}
		});
		
		Button bn = (Button)findViewById(R.id.button1);
		bn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//主activity没有finish这里finish后返回主activity
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}
