package com.example.graphictext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

class MyView extends View { //view를 상속받아 MyView 클래스를 작성한다.
    public MyView(Context context){ //생성자 MyView는 context 객체를 생성한다.
        super(context); //context 정보를 상위클래스로 전달한다.
    }

    @Override
    protected void onDraw(Canvas canvas){ //canvas 객체에 그린다.
        Paint paint = new Paint(); //paint 객체 생성한다.
        paint.setAntiAlias(true); //앤티 에일리어싱을 사용한다.
        paint.setTextSize(100); //텍스트 사이즈는 100으로 한다.

        Typeface t; // Typeface 클래스 객체를 t로 선언한다.
        t = Typeface.create(Typeface.DEFAULT, Typeface.NORMAL); //폰트와 스타일을 설정한다.
        paint.setTypeface(t); //폰트를 변경한다.
        canvas.drawText("DEFAULT 폰트", 10, 400, paint); //문자열을 화면에 그린다.

        t = Typeface.create(Typeface.DEFAULT_BOLD, Typeface.NORMAL);
        paint.setTypeface(t);
        canvas.drawText("DEFAULT_BOLD 폰트", 10, 500, paint);

        t = Typeface.create(Typeface.MONOSPACE, Typeface.NORMAL);
        paint.setTypeface(t);
        canvas.drawText("MONOSPACE 폰트", 10, 600, paint);

        t = Typeface.create(Typeface.SERIF, Typeface.NORMAL);
        paint.setTypeface(t);
        canvas.drawText("SERIF 폰트", 10, 700, paint);

        t = Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL);
        paint.setTypeface(t);
        canvas.drawText("SANS_SERIF 폰트", 10, 800, paint);


        t = Typeface.create(Typeface.SERIF, Typeface.NORMAL); //paint 객체 정보를 가지고 수정한다.
        paint.setTypeface(t);

        paint.setTextAlign(Paint.Align.LEFT); //왼쪽 정렬
        canvas.drawText("This is a test!", 10, 900, paint);

        paint.setTextAlign(Paint.Align.CENTER); //가운데 정렬
        canvas.drawText("This is a test!", 500, 1000, paint);

        paint.setTextAlign(Paint.Align.RIGHT); //오른쪽 정렬
        canvas.drawText("This is a test!", 1000, 1100, paint);

        paint.setTextAlign(Paint.Align.LEFT); //왼쪽 정렬
        paint.setColor(Color.RED); //빨강색으로 설정


        paint.setUnderlineText(true); //밑줄
        canvas.drawText("This is a test!", 10, 1200, paint);
        paint.setUnderlineText(false);

        paint.setStrikeThruText(true); //가운데 줄
        canvas.drawText("This is a test!", 10, 1300, paint);
        paint.setStrikeThruText(false);

        paint.setTextSkewX(-0.5f); //기울이기
        canvas.drawText("This is a test!", 10, 1400, paint);
        paint.reset();

    }
}
public class MainActivity extends AppCompatActivity { //AppCompatActivity를 상속받아 MainActivity 클래스를 작성한다.

    @Override
    protected void onCreate(Bundle savedInstanceState) { //onCreat 메소드의 매개변수를 앱이 이전 실행 상태를 전달
        super.onCreate(savedInstanceState); //상위 클래스의 onCreate 호출한다.
        MyView w = new MyView(this); //MyView를 선언한다.
        setContentView(w); //MyView를 메인화면에 띄운다.
    }
}
