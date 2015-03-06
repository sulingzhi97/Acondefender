package com.acon.acondefender.activity;

import com.acon.acondefender.R;

import android.os.Bundle;

public class AconDefenderInformationActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acon_defender_information_activity_layout);
	}

	@Override
	protected void onResume() {
		super.onResume();
		initView();
	}

	private void initView() {

	}
}
