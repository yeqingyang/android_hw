package com.example.hw;

import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Event;
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
		RelativeLayout main = (RelativeLayout) findViewById(R.id.root);
		final BallView ball = new BallView(this);
		ball.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent event) {
				// TODO Auto-generated method stub
				ball.currentX = event.getX();
				ball.currentY = event.getY();
				ball.invalidate();
				return true;
			}
		});
		
		Button bn = (Button)findViewById(R.id.button1);
		bn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//��activityû��finish����finish�󷵻���activity
				finish();
			}
		});
	}
}
