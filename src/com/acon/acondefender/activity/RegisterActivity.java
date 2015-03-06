package com.acon.acondefender.activity;

import com.acon.acondefender.R;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class RegisterActivity extends BaseActivity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register_activity_layout);
	}

	@Override
	protected void onResume() {
		super.onResume();
		initView();
	}

	private void initView() {
		ImageView imgBack = (ImageView) findViewById(R.id.register_activity_layout_img_back);
		imgBack.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.register_activity_layout_img_back:
			this.finish();
			break;

		default:
			break;
		}

	}
}
