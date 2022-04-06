package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount=0;
    private TextView mShowCount;
    Button countButton,zeroButton;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView)findViewById(R.id.show_count);
        countButton=(Button)findViewById(R.id.button_count);
        zeroButton=(Button)findViewById(R.id.button_zero);


        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //zeroButton.setBackgroundColor(Color.RED);

                count = count + 1;

                mShowCount.setText("" + count);
                zeroButton.setBackgroundColor(zeroButton.getContext().getResources().getColor(R.color.my_redd));
                if (count % 2 == 0) {
                    //btn_count.setBackgroundColor(getResources().getColor(R.color.my_yellow, null));
                    countButton.setBackgroundColor(countButton.getContext().getResources().getColor(R.color.black));
                } else {
                    countButton.setBackgroundColor(countButton.getContext().getResources().getColor(R.color.teal_200));
                }

                mCount++;



                if(mShowCount != null)
                    mShowCount.setText(Integer.toString(mCount));
            }
        });


    }



    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

/*
    public void countUp(View view) {

        mCount++;



        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

 */



    public void setZero(View view) {



        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zeroButton.setBackgroundColor(Color.GRAY);

                mCount = 0;



                if(mShowCount != null)
                    mShowCount.setText(Integer.toString(mCount));
            }
        });
    }



}