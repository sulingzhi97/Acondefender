package com.acon.acondefender.activity;

import java.util.ArrayList;
import java.util.List;

import com.acon.acondefender.R;
import com.acon.acondefender.adapter.FunctionAdapter;
import com.acon.acondefender.adapter.FunctionAdapter.AppItem;
import com.acon.acondefender.bean.ContentIcon;
import com.acon.acondefender.entity.CircleImageView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends BaseActivity implements OnItemClickListener,
		OnClickListener {
	private List<ContentIcon> iconList = new ArrayList<ContentIcon>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity_layout);
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();

		initData();
		initView();
	}

	private void initData() {
		if (iconList == null || iconList.size() == 0) {
			seticonList();
		}
	}

	private void initView() {
		CircleImageView cimg = (CircleImageView) findViewById(R.id.main_activity_layout_img_user);
		cimg.setOnClickListener(this);

		GridView appPage = (GridView) findViewById(R.id.main_activity_layout_gridview_function);
		appPage.setSelector(new ColorDrawable(Color.TRANSPARENT));
		appPage.setAdapter(new FunctionAdapter(this, iconList));
		appPage.setOnItemClickListener(this);
		appPage.setNumColumns(3);

	}

	private void seticonList() {
		createIconItem(R.string.data_list, R.drawable.data_list);
		createIconItem(R.string.blood_glucose_manager,
				R.drawable.blood_glucose_manager);
		createIconItem(R.string.user_manager, R.drawable.user_manager);
		createIconItem(R.string.acon_defender_information,
				R.drawable.acon_defender_information);
		createIconItem(R.string.acon_defender_knowledge,
				R.drawable.acon_defender_knowledge);
		createIconItem(R.string.contacts, R.drawable.contacts);
	}

	private void createIconItem(int textRes, int imgRes) {
		ContentIcon jionSiteVerify = new ContentIcon();
		jionSiteVerify.setStringID(textRes);
		jionSiteVerify.setSourceID(imgRes);
		iconList.add(jionSiteVerify);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View view, int arg2, long arg3) {
		FunctionAdapter.AppItem item = (AppItem) view.getTag();
		String itemName = item.mAppName.getText().toString();
		Intent intent = new Intent();
		if (itemName.equals(this.getString(R.string.data_list))) {
			intent.setClass(this, DataListActivity.class);
		} else if (itemName.equals(this
				.getString(R.string.blood_glucose_manager))) {
			intent.setClass(this, BloodGlucoseManagerActivity.class);
		} else if (itemName.equals(this.getString(R.string.user_manager))) {
			intent.setClass(this, UserManagerActivity.class);
		} else if (itemName.equals(this
				.getString(R.string.acon_defender_information))) {
			intent.setClass(this, AconDefenderInformationActivity.class);// 通讯录备份
		} else if (itemName.equals(this
				.getString(R.string.acon_defender_knowledge))) {
			intent.setClass(this, AconDefenderKnowledgeActivity.class);
		} else if (itemName.equals(this.getString(R.string.contacts))) {
			intent.setClass(this, ContactsActivity.class);// 排行榜
		}
		startActivity(intent);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.main_activity_layout_img_user:
			Intent intent = new Intent();
			intent.setClass(this, AppCenterActivity.class);
			startActivity(intent);
			break;

		default:
			break;
		}

	}
}
