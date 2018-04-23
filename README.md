# ImageCheckBox
简单俩张图画CheckBox，常用与密码是否可视等


</br>

<img src="https://github.com/wenzb/ImageCheckBox/blob/master/app/src/main/res/raw/test_image_check_box.gif" width="266px" width="484px" />
</br>


## 使用步骤：

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

dependencies {
	compile 'com.github.wenzb:ImageCheckBox:1.0.0'
	}
    
```
 <com.wzb.imagecheckbox.ImageCheckBox
        android:id="@+id/icb_test"
        android:layout_width="40dp"
        android:layout_height="40dp"
        android:padding="10dp"
        app:checked="false"
        app:checked_src="@drawable/login_psd_open"
        app:un_checked_src="@drawable/login_psd_close"
        />

icbTest.setOnCheckedChangeListener(new ImageCheckBox.OnCheckedChangeListener(){
            @Override
            public void chang(ImageCheckBox imageCheckBox, boolean isChecked) {
                if (isChecked){
                    etTest.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                }else{
                    etTest.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
                etTest.setSelection(etTest.getText().length());
            }
        });
```
