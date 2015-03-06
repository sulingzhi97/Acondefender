package com.acon.acondefender.activity;

import com.acon.acondefender.R;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class DataListActivity extends BaseActivity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.data_list_activity_layout);
	}

	@Override
	protected void onResume() {
		super.onResume();
		initView();
	}

	private void initView() {
		ImageView imgBack = (ImageView) findViewById(R.id.data_list_activity_layout_img_back);
		imgBack.setOnClickListener(this);

		TextView tvExport = (TextView) findViewById(R.id.data_list_activity_layout_tv_export);
		tvExport.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.data_list_activity_layout_img_back:
			this.finish();
			break;
		case R.id.data_list_activity_layout_tv_export:
			Intent intentEmail = new Intent(Intent.ACTION_SEND);
			intentEmail.setType("text/plain"); // 模拟器请使用这行
			// i.setType("message/rfc822") ; // 真机上使用这行
			intentEmail.putExtra(Intent.EXTRA_EMAIL,
					new String[] { "test@gmail.com" });
			intentEmail.putExtra(Intent.EXTRA_SUBJECT, "subject goes here");
			intentEmail.putExtra(Intent.EXTRA_TEXT, "body goes here");
			startActivity(Intent.createChooser(intentEmail,
					"Select email application."));
		default:
			break;
		}

	}

}
