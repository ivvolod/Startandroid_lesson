package net.ru.ivvolod.p0161dynamiclayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*Создание LinearLayout*/
        LinearLayout linearLayout = new LinearLayout(this);
        /*установим вертикальную ориентацию*/
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        /*создаем LayoutParams */
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        /*устанавливаем linLayout как корневой элемент экрана*/
        setContentView(linearLayout, layoutParams);

        LinearLayout.LayoutParams layoutParams1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

        TextView textView = new TextView(this);
        textView.setText("TextView");
        textView.setLayoutParams(layoutParams1);
        linearLayout.addView(textView);

        Button button = new Button(this);
        button.setText("Buttton");
        linearLayout.addView(button, layoutParams1);

        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

        layoutParams2.leftMargin = 50;
        Button button1 = new Button(this);
        button1.setText("Button1");
        linearLayout.addView(button1, layoutParams2);

        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        layoutParams3.gravity = Gravity.RIGHT;
        TextView textView1 = new TextView(this);
        textView1.setText("TextView1");
        linearLayout.addView(textView1, layoutParams3);
    }
}
