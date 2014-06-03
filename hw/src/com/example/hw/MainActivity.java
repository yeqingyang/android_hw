package com.example.hw;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
		LinearLayout layout = new LinearLayout(this);
		super.setContentView(layout);
		layout.setOrientation(LinearLayout.VERTICAL);
		//����һ��TextView
		final TextView show = new TextView(this);
		//����һ��button
		final Button bn = new Button(this);
		bn.setText(R.string.ok);
		bn.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT));
		final Button bn2 = new Button(this);
		bn2.setText(R.string.ok2);
		bn2.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT));
		
		final Button bn3 = new Button(this);
		bn3.setText(R.string.ok3);
		bn3.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT));
		
		final Button bn4 = new Button(this);
		bn4.setText("Text");
		bn4.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT));
		
		final Button bn5 = new Button(this);
		bn5.setText("Table");
		bn5.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT));
		//��layout�����textview bn
		
		layout.addView(bn);
		layout.addView(show);
		layout.addView(bn2);
		layout.addView(bn3);
		layout.addView(bn4);
		layout.addView(bn5);
		//Ϊ��ť��һ���¼�������
		bn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				show.setText("Now time is " + new java.util.Date());
			}
		});
		bn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent= new Intent();
				intent.setClass(MainActivity.this, PicActivity.class);
				startActivity(intent);
//				finish();
			}
		});
		bn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent= new Intent();
				intent.setClass(MainActivity.this, BallActivity.class);
				startActivity(intent);
//				finish();
			}
		});
		bn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent= new Intent();
				intent.setClass(MainActivity.this, TextActivity.class);
				startActivity(intent);
//				finish();
			}
		});
		bn5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent= new Intent();
				intent.setClass(MainActivity.this, TableActivity.class);
				startActivity(intent);
//				finish();
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
