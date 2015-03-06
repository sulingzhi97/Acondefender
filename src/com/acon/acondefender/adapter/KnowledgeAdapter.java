package com.acon.acondefender.adapter;

import java.util.List;
import java.util.zip.Inflater;

import com.acon.acondefender.R;
import com.acon.acondefender.bean.DiabetesKnowledgeTitleBean;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class KnowledgeAdapter extends BaseAdapter {
	private List<DiabetesKnowledgeTitleBean> knowledgeArray;
	private LayoutInflater Inflater;

	public KnowledgeAdapter(Context context,
			List<DiabetesKnowledgeTitleBean> knowledgeArray) {
		Inflater = LayoutInflater.from(context);
		this.knowledgeArray = knowledgeArray;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return knowledgeArray.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return knowledgeArray.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		DiabetesKnowledgeTitleBean item = knowledgeArray.get(position);
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = Inflater.inflate(R.layout.knowledge_adapter_layout,
					null);
		}else{
			
		}
		return convertView;
	}

	public class ViewHolder {
		TextView tvUserName;
		TextView tvQuestion;
		TextView tvAnswer;
		ImageView imgAnswerIcon;
	}
}
