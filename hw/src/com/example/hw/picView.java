package com.example.hw;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class picView extends Activity {
	int[] images = new int[] { R.drawable.balloon, R.drawable.bear, };
	int curImg = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.pic);
		LinearLayout main = (LinearLayout) findViewById(R.id.root);
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
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event){
		// 是否触发按键为back键    
	    if (keyCode == KeyEvent.KEYCODE_BACK) { 
	         
	        // 实例化 Bundle，设置需要传递的参数 
	        Bundle bundle = new Bundle(); 
	        bundle.putString("phoneNO", "020-123"); 
	         
	        setResult(RESULT_CANCELED, this.getIntent().putExtras(bundle)); 
	        this.finish(); 
	        return true; 
	    }else { 
	        return super.onKeyDown(keyCode, event); 
	    } 
		
	}
}
