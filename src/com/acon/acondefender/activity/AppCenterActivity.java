package com.acon.acondefender.activity;

import com.acon.acondefender.R;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class AppCenterActivity extends BaseActivity implements OnClickListener {
	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.appcenter_activity_layout);
	};

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		initView();
	}

	private void initView() {
		ImageView imgBack = (ImageView) findViewById(R.id.appcenter_activity_layout_img_back);
		imgBack.setOnClickListener(this);

		RelativeLayout rlUserInfo = (RelativeLayout) findViewById(R.id.appcenter_activity_rl_user_infomation);
		rlUserInfo.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.appcenter_activity_layout_img_back:
			this.finish();
			break;
		case R.id.appcenter_activity_rl_user_infomation:
			Intent intent=new Intent();
			intent.setClass(this, UserDetailActivity.class);
			startActivity(intent);
			break;
		default:
			break;
		}

	}
}
