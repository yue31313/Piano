package com.javacc.android.piano;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Main extends Activity
{
	
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.premain);
		
		
		
		// ��ȡӦ�ó����е�bn1��ť
		Button bn3 = (Button) findViewById(R.id.bn3);
		// Ϊbn3��ť���¼�������
		bn3.setOnClickListener(new OnClickListener()
		{
			
			public void onClick(View source)
			{
				// ������Ҫ������Activity��Ӧ��Intent
				Intent intent = new Intent(Main.this,
						Searchlist.class);
				// ����intent��Ӧ��Activity
				startActivity(intent);
			}
		});
		
		// ��ȡӦ�ó����е�bn4��ť
				Button bn4 = (Button) findViewById(R.id.bn4);
				// Ϊbn4��ť���¼�������
				bn4.setOnClickListener(new OnClickListener()
				{
					
					public void onClick(View source)
					{
						// ������Ҫ������Activity��Ӧ��Intent
						Intent intent = new Intent(Main.this,
						    Freeplay.class);
						// ����intent��Ӧ��Activity
						startActivity(intent);
					}
				});
				// ��ȡӦ�ó����е�bn5��ť
				Button bn5 = (Button) findViewById(R.id.bn5);
				// Ϊbn5��ť���¼�������
				bn5.setOnClickListener(new OnClickListener()
				{
					
					public void onClick(View source)
					{
						//������ǰActivity
						finish();
					}
				});
	}
}