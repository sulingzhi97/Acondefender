package com.acon.acondefender.activity;

import com.acon.acondefender.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends BaseActivity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_activity_layout);

	}

	@Override
	protected void onResume() {
		super.onResume();
		initView();
	}

	private void initView() {
		TextView tvRegister = (TextView) findViewById(R.id.login_activity_layout_tv_register_atonce);
		Button btnLogin = (Button) findViewById(R.id.login_activity_layout_btn_login);
		tvRegister.setOnClickListener(this);
		btnLogin.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent();
		switch (v.getId()) {
		case R.id.login_activity_layout_tv_register_atonce:
			intent.setClass(this, RegisterActivity.class);
			startActivity(intent);
			break;
		case R.id.login_activity_layout_btn_login:
			intent.setClass(this, MainActivity.class);
			startActivity(intent);
		default:
			break;
		}

	}
}
