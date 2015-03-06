package com.acon.acondefender.activity;

import com.acon.acondefender.R;
import android.app.Activity;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

public class WelcomeActivity extends Activity implements AnimationListener {
	private ImageView imageView = null;
	private Animation alphaAnimation = null;

	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome_activity_layout);
		imageView = (ImageView) findViewById(R.id.welcome_activity_layout_img);
		alphaAnimation = AnimationUtils.loadAnimation(this, R.drawable.welcome_alpha);
		alphaAnimation.setFillEnabled(true);
		alphaAnimation.setFillAfter(true);
		imageView.setAnimation(alphaAnimation);
		alphaAnimation.setAnimationListener(this);
	}

	@Override
	public void onAnimationEnd(Animation arg0) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this, LoginActivity.class);
		startActivity(intent);
		this.finish();
	}

	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub

	};
}
