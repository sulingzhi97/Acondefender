package com.acon.acondefender.adapter;

import java.util.List;

import com.acon.acondefender.R;
import com.acon.acondefender.bean.ContentIcon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FunctionAdapter  extends BaseAdapter{
	private List<ContentIcon> iconList;
	private Context mContext;
	public static final float PAGE_SIZE = 8.0f;

	public FunctionAdapter(Context context,
			List<ContentIcon> iconList) {
		mContext = context;
		this.iconList = iconList;
	}

	public int getCount() {
		return iconList.size();
	}

	public Object getItem(int position) {
		return iconList.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ContentIcon icon = iconList.get(position);

		AppItem appItem;
		if (convertView == null) {
			convertView = LayoutInflater.from(mContext).inflate(
					R.layout.widget_word_image_button, null);

			appItem = new AppItem();
			appItem.mAppIcon = (ImageView) convertView
					.findViewById(R.id.widget_word_image_button_iv_image);
			appItem.mAppName = (TextView) convertView
					.findViewById(R.id.widget_word_image_button_tv_word);

			convertView.setTag(appItem);
		} else {
			appItem = (AppItem) convertView.getTag();
		}
		appItem.mAppIcon.setImageDrawable(mContext.getResources().getDrawable(
				icon.getSourceID()));
		appItem.mAppName.setText(mContext.getString(icon.getStringID()));

		return convertView;
	}

	/**
	 * 每个应用显示的内容，包括图标和名称
	 * 
	 * @author sulingzhi
	 * 
	 */
	public class AppItem {
		public ImageView mAppIcon;
		public TextView mAppName;
	}
}
