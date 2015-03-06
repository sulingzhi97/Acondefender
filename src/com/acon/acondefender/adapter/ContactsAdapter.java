package com.acon.acondefender.adapter;

import java.util.List;
import java.util.zip.Inflater;

import com.acon.acondefender.bean.ContactBean;
import com.test.acon.adapter.FileResourceListAdapter.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactsAdapter extends BaseAdapter {
	private List<ContactBean> contactArray;
	private LayoutInflater mInflater;

	public ContactsAdapter(Context context, List<ContactBean> contactArray) {
		this.contactArray = contactArray;
		mInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return contactArray.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return contactArray.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ContactBean cb = (ContactBean) getItem(position);
		ViewHolder holder = null;
		if (convertView == null) {

		}
		return null;
	}

	private class ViewHolder {
		ImageView imgPhoto;
		TextView tvName;
		TextView tvPhoneNumber;
		TextView tvAddress;
	}

}
