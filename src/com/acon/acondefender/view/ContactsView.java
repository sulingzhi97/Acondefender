package com.acon.acondefender.view;

import java.util.List;
import android.content.Context;
import android.util.Log;

import com.acon.acondefender.adapter.ContactsAdapter;
import com.acon.acondefender.bean.ContactBean;
import com.acon.acondefender.entity.CustomListView;
import com.acon.acondefender.entity.CustomListView.OnRefreshListener;

public class ContactsView implements OnRefreshListener {
	private ContactsAdapter adapter;

	public ContactsView(Context context, CustomListView listview,
			List<ContactBean> contactArray) {
		adapter = new ContactsAdapter(context, contactArray);
		listview.setAdapter(adapter);
		listview.setOnRefreshListener(this);
	}

	@Override
	public void onRefresh() {
		Log.e("refresh", "ffffff");
	}
}