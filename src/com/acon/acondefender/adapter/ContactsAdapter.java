package com.acon.acondefender.adapter;

import java.util.List;

import com.acon.acondefender.R;
import com.acon.acondefender.bean.ContactBean;

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
			convertView = mInflater.inflate(R.layout.contacts_adapter_layout,
					null);
			holder = new ViewHolder();
			holder.imgPhoto = (ImageView) convertView
					.findViewById(R.id.contacts_adapter_image);
			holder.tvName = (TextView) convertView
					.findViewById(R.id.contacts_adapter_name);
			holder.tvPhoneNumber = (TextView) convertView
					.findViewById(R.id.contacts_adapter_phone);
			holder.tvAddress = (TextView) convertView
					.findViewById(R.id.contacts_adapter_address);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		holder.tvName.setText(cb.getName());
		holder.tvAddress.setText(cb.getAddress());
		holder.tvPhoneNumber.setText(cb.getPhoneNumber());

		return convertView;
	}

	private class ViewHolder {
		ImageView imgPhoto;
		TextView tvName;
		TextView tvPhoneNumber;
		TextView tvAddress;
	}

}
