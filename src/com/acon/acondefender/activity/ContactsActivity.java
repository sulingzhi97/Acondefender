package com.acon.acondefender.activity;

import java.util.ArrayList;
import java.util.List;

import com.acon.acondefender.R;
import com.acon.acondefender.adapter.ContactsAdapter;
import com.acon.acondefender.bean.ContactBean;
import com.acon.acondefender.entity.CustomListView;
import com.acon.acondefender.view.ContactsView;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class ContactsActivity extends BaseActivity implements OnClickListener {
	private ContactsView contactsView;
	private List<ContactBean> contactArray;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contacts_activity_layout);
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		initData();
		initView();
	}

	private void initData() {
		contactArray = new ArrayList<ContactBean>();
		ContactBean cb = new ContactBean();
		cb.setName("张三");
		cb.setPhoneNumber("15363636363");
		cb.setAddress("地球上");
		contactArray.add(cb);
		contactArray.add(cb);
		contactArray.add(cb);
		contactArray.add(cb);
	}

	private void initView() {
		ImageView imgBack = (ImageView) findViewById(R.id.contacts_activity_layout_img_back);
		imgBack.setOnClickListener(this);

		CustomListView listview = (CustomListView) findViewById(R.id.contacts_activity_layout_listview);
		contactsView = new ContactsView(this, listview, contactArray);
		// listview
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.contacts_activity_layout_img_back:
			this.finish();
			break;
		default:
			break;
		}

	}
}
