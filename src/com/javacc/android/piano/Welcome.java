package com.javacc.android.piano;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Description:
 * <br/>site: <a href="http://www.crazyit.org">crazyit.org</a>
 * <br/>Copyright (C), 2001-2014, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Welcome extends Activity
{
	
    MediaPlayer mediaPlayer1 = null;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		
		mediaPlayer1 = MediaPlayer.create(this,R.raw.croatianrhapsody);
		mediaPlayer1.start();
		
		// ��ȡӦ�ó����е�bn1��ť
		Button bn1 = (Button) findViewById(R.id.bn1);
		// Ϊbn1��ť���¼�������
		bn1.setOnClickListener(new OnClickListener()
		{
			
			public void onClick(View source)
			{
				// ������Ҫ������Activity��Ӧ��Intent
				Intent intent = new Intent(Welcome.this,
						Main.class);
				// ����intent��Ӧ��Activity
				startActivity(intent);
				mediaPlayer1.stop();
			}
		});
		
		// ��ȡӦ�ó����е�bn2��ť
				Button bn2 = (Button) findViewById(R.id.bn2);
				// Ϊbn2��ť���¼�������
				bn2.setOnClickListener(new OnClickListener()
				{
					
					public void onClick(View source)
					{
						finish();
						mediaPlayer1.stop();
						
					}
				});
	}
}