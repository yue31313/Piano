package com.javacc.android.piano;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

/**
 * Description:
 * <br/>website: <a href="http://www.crazyit.org">crazyit.org</a>
 * <br/>Copyright (C), 2001-2014, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Searchlist extends Activity implements
		SearchView.OnQueryTextListener
{   int n;
	private SearchView sv;
	private ListView lv;
	// �Զ���ɵ��б�
	private final String[] mStrings = { "С����     easy", "���֮��    normal", "���֮�� hard" };

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.searchlist);
		lv = (ListView) findViewById(R.id.lv);
		lv.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, mStrings));
		lv.setTextFilterEnabled(true);
		sv = (SearchView) findViewById(R.id.sv);
		// ���ø�SearchViewĬ���Ƿ��Զ���СΪͼ��
		sv.setIconifiedByDefault(false);
		// Ϊ��SearchView��������¼�������
		sv.setOnQueryTextListener(this);
		// ��ȡӦ�ó����е�button1��ť
				Button button1 = (Button) findViewById(R.id.button1);
				// Ϊbutton1��ť���¼�������
				button1.setOnClickListener(new OnClickListener()
				{
					
					public void onClick(View source)
					{   n=1;
						onQueryTextChange("easy");
					}
				});
				
				Button button2 = (Button) findViewById(R.id.button2);
				// Ϊbutton2��ť���¼�������
				button2.setOnClickListener(new OnClickListener()
				{
					
					public void onClick(View source)
					{   n=2;
						onQueryTextChange("normal");
					}
				});
				
				
				Button button3 = (Button) findViewById(R.id.button3);
				// Ϊburron3��ť���¼�������
				button3.setOnClickListener(new OnClickListener()
				{
					
					public void onClick(View source)
					{   n=3;
						onQueryTextChange("hard");
					}
				});
				
				Button button4 = (Button) findViewById(R.id.button4);
				// Ϊbutton4��ť���¼�������
				button4.setOnClickListener(new OnClickListener()
				{
					
					public void onClick(View source)
					{   if(n==1)
					    {// ������Ҫ������Activity��Ӧ��Intent
						Intent intent = new Intent(Searchlist.this,
								Littlestar_piano.class);
						// ����intent��Ӧ��Activity
						startActivity(intent);
						}
					
					if(n==2)
				    {// ������Ҫ������Activity��Ӧ��Intent
					Intent intent = new Intent(Searchlist.this,
							Carryingyou_piano.class);
					// ����intent��Ӧ��Activity
					startActivity(intent);
					}
					
					if(n==3)
				    {// ������Ҫ������Activity��Ӧ��Intent
					Intent intent = new Intent(Searchlist.this,
							Crazycarryingyou_piano.class);
					// ����intent��Ӧ��Activity
					startActivity(intent);
					}
						
					}
				});
				
				Button button5 = (Button) findViewById(R.id.button5);
				// Ϊbutton5��ť���¼�������
				button5.setOnClickListener(new OnClickListener()
				{
					
					public void onClick(View source)
					{  
						finish();
					}
				});
				
				
				
		// ���ø�SearchView��ʾ������ť
		sv.setSubmitButtonEnabled(true);
		// ���ø�SearchView��Ĭ����ʾ����ʾ�ı�
		sv.setQueryHint("��Ŀ�б�");
	}

	// �û������ַ�ʱ�����÷���
	public boolean onQueryTextChange(String newText)
	{
		if (TextUtils.isEmpty(newText))
		{
			// ���ListView�Ĺ���
			lv.clearTextFilter();
		}
		else
		{
			// ʹ���û���������ݶ�ListView���б�����й���
			lv.setFilterText(newText);
		}
		return true;
	}

	// ����������ťʱ�����÷���
	public boolean onQueryTextSubmit(String query)
	{
		// ʵ��Ӧ����Ӧ���ڸ÷�����ִ��ʵ�ʲ�ѯ
		// �˴���ʹ��Toast��ʾ�û�����Ĳ�ѯ����
		Toast.makeText(this, "����ѡ����:" + query
				, Toast.LENGTH_SHORT).show();
		return false;
	}
}
