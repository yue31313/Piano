package com.javacc.android.piano;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;
import android.view.MotionEvent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.io.IOException;

import com.javacc.android.piano.R;


		public class Littlestar_picture extends View
		{
			// ��¼����λͼ��ʵ�ʸ߶�
			final int BACK_HEIGHT = 1500;
			// ����ͼƬ
			private Bitmap back1;
			final int WIDTH = 413;
			final int HEIGHT = 135;
			private int startY = BACK_HEIGHT - HEIGHT;

			public Littlestar_picture(Context context)
			{
				super(context);
				back1 = BitmapFactory.decodeResource(context.getResources(),
					R.drawable.littlestar);
				final Handler handler = new Handler()
				{
					public void handleMessage(Message msg)
					{
						if (msg.what == 0x123 && startY >= 10)
						{
							
			                startY -= 2;
							
						}
						invalidate();
					}
				};
				new Timer().schedule(new TimerTask()
				{
					@Override
					public void run()
					{
						handler.sendEmptyMessage(0x123);
					}

				}, 0, 100);
			}

			

			@Override
			public void onDraw(Canvas canvas)
			{
				// ����ԭʼλͼ��Matrix������ͼƬ
				Bitmap bitmap2 = Bitmap
						.createBitmap(back1, 0, startY, WIDTH, HEIGHT); // ��
				// ������λͼ
				canvas.drawBitmap(bitmap2, 0, 0, null);
			}
		
	}
    


