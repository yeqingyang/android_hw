package com.example.hw;

import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Event;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class BallActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ball);
		RelativeLayout root = (RelativeLayout) findViewById(R.id.root);
		RelativeLayout child = (RelativeLayout) findViewById(R.id.child);
		final BallView ball = new BallView(this);
		ball.setMinimumHeight(getWallpaperDesiredMinimumHeight());
		ball.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent event) {
				// TODO Auto-generated method stub
				if(event.getAction() == MotionEvent.ACTION_DOWN){
					Log.e("demp:","it's down");
				}
				if(event.getAction() == MotionEvent.ACTION_UP){
					Log.e("demp:","it's up");
				}
				ball.currentX = event.getX();
				ball.currentY = event.getY();
				ball.invalidate();
				return true;
			}
			
		});
		
		Button bn = (Button)findViewById(R.id.button2);
		bn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		child.addView(ball);
	}
}
