package com.acon.acondefender.activity;

import java.util.ArrayList;
import java.util.List;

import com.acon.acondefender.R;
import com.acon.acondefender.adapter.KnowledgeAdapter;
import com.acon.acondefender.bean.DiabetesKnowledgeTitleBean;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class AconDefenderKnowledgeActivity extends BaseActivity implements
		OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acon_defender_knowledge_activity_layout);
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		initView();
	}

	private void initView() {
		ImageView imgBack = (ImageView) findViewById(R.id.acon_defender_knowledge_activity_layout_img_back);
		imgBack.setOnClickListener(this);

		TextView tvQuestion = (TextView) findViewById(R.id.acon_defender_knowledge_activity_layout_tv_question);
		tvQuestion.setOnClickListener(this);

		List<DiabetesKnowledgeTitleBean> knowledgeArray = new ArrayList<DiabetesKnowledgeTitleBean>();
		knowledgeArray.add(new DiabetesKnowledgeTitleBean());
		knowledgeArray.add(new DiabetesKnowledgeTitleBean());
		knowledgeArray.add(new DiabetesKnowledgeTitleBean());
		KnowledgeAdapter ad = new KnowledgeAdapter(this, knowledgeArray);
		ListView listView = (ListView) findViewById(R.id.acon_defender_knowledge_activity_layout_lv_know);
		listView.setAdapter(ad);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.acon_defender_knowledge_activity_layout_img_back:
			this.finish();
			break;
		case R.id.acon_defender_knowledge_activity_layout_tv_question:
			Intent intent = new Intent();
			intent.setClass(this, QuestionActivity.class);
			startActivity(intent);
			break;
		default:
			break;
		}

	}
}
