package com.nb.hxh.emoji.view;

import android.content.Context;
import android.graphics.Canvas;
import android.media.Image;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * Created by hxh on 16/8/21.
 */
public class MyImageView extends ImageView{

    Context context;
    EditText tt;
    ImageView ii;
    public MyImageView(Context context) {
        super(context);
        this.context = context;
    }
    public MyImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:



        }
    }
}
