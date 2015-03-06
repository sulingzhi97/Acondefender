package com.acon.acondefender.view;

import java.util.List;
import android.content.Context;
import android.widget.ListView;

import com.acon.acondefender.adapter.ContactsAdapter;
import com.acon.acondefender.bean.ContactBean;

public class ContactsView {
	private ContactsAdapter adapter;

	public ContactsView(Context context, ListView listview,
			List<ContactBean> contactArray) {
		adapter = new ContactsAdapter(context, contactArray);
		listview.setAdapter(adapter);
	}

}
