package com.wzb.imagecheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.widget.EditText;

public class TestActivity extends AppCompatActivity {
    private EditText etTest;
    private ImageCheckBox icbTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        etTest=findViewById(R.id.et_test);

        icbTest=findViewById(R.id.icb_test);
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

    }
}
