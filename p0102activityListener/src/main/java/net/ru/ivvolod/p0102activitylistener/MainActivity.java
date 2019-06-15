package net.ru.ivvolod.p0102activitylistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //создание объектов
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnNext = (Button) findViewById(R.id.btnNext);

        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
//        btnNext.setOnClickListener();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOk:
                // кнопка ОК
                tvOut.setText("Нажата кнопка ОК");
                break;
            case R.id.btnCancel:
                // кнопка Cancel
                tvOut.setText("Нажата кнопка Cancel");
                break;
        }
    }

    public void onClickNext(View view) {
        tvOut.setText("Нажата кнопка Next");
    }
}
