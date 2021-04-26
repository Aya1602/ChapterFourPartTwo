package com.example.chapterfourparttwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        // получаем ресурсы
        Resources resources = getResources();
        float textSize = resources.getDimension(R.dimen.text_size);
        int hMargin = (int)resources.getDimension(R.dimen.horizontal_margin);
        int vMargin = (int)resources.getDimension(R.dimen.vertical_margin);

        ConstraintLayout constraintLayout = new ConstraintLayout(this);

        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

        TextView textView = new TextView(this);
        textView.setText("Let's drink!");
        textView.setBackgroundColor(0XFFEAEAEA);
        // устанавливаем размер шрифт по ресурсу
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
        // устанавливаем отступы пв соответствии с ресурсами
        layoutParams.setMargins(hMargin, vMargin, hMargin, vMargin);

        textView.setLayoutParams(layoutParams);
        constraintLayout.addView(textView);

        setContentView(constraintLayout);
    }
}