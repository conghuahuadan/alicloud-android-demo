package com.alibaba.sophix.demo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.blankj.utilcode.util.ToastUtils;

public class ResTestActivity extends AppCompatActivity {
    private TextView tv;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restest);

        tv = (TextView) findViewById(R.id.tv);
        tv.setText(R.string.tv_value);
        tv.setTextColor(getResources().getColor(R.color.colorBlack));
        tv.setText(R.string.tv_value_2);
        tv.setBackgroundColor(Color.GREEN);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showShort(""+tv.getText().toString());
            }
        });

        iv = (ImageView) findViewById(R.id.iv);
        iv.setImageResource(R.mipmap.add);
        iv.setVisibility(View.GONE);

        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setHomeButtonEnabled(true);
        mActionBar.setDisplayHomeAsUpEnabled(true);
        mActionBar.setTitle(R.string.res_test);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv:
                break;
            case R.id.btn:
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
