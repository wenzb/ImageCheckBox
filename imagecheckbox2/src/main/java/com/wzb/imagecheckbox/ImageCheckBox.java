package com.wzb.imagecheckbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by wzb on 2017/12/6 0006.
 */

public class ImageCheckBox extends AppCompatImageView implements View.OnClickListener{
    private boolean checked;
    private Drawable checkedDrawable;
    private Drawable unCheckedDrawable;
    private OnCheckedChangeListener onCheckedChangeListener ;


    public ImageCheckBox(Context context) {
        super(context);
    }

    public ImageCheckBox(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a=context.obtainStyledAttributes(attrs, R.styleable.ImageCheckBox);
        checked=a.getBoolean(R.styleable.ImageCheckBox_checked,false);
        checkedDrawable=a.getDrawable(R.styleable.ImageCheckBox_checked_src);
        unCheckedDrawable=a.getDrawable(R.styleable.ImageCheckBox_un_checked_src);
        a.recycle();
        if (checked){
            setImageDrawable(checkedDrawable);
        }else{
            setImageDrawable(unCheckedDrawable);
        }
        this.setOnClickListener(this);

    }
    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
        if (this.checked){
            setImageDrawable(checkedDrawable);
        }else{
            setImageDrawable(unCheckedDrawable);
        }
    }

    @Override
    public void onClick(View v) {
        setChecked(!checked);
        if (onCheckedChangeListener!=null){
            onCheckedChangeListener.chang(this,checked);
        }
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public interface OnCheckedChangeListener{
        void chang(ImageCheckBox imageCheckBox, boolean isChecked);
    }


}
