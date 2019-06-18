package net.ru.ivvolod.p0151contextmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*создание контекстных меню.
    Используем константы для хранения ID пунктов меню.*/
    final int MENU_COLOR_RED = 1;
    final int MENU_COLOR_GREEN = 2;
    final int MENU_COLOR_BLUE = 3;

    final int MENU_SIZE_22 = 4;
    final int MENU_SIZE_26 = 5;
    final int MENU_SIZE_30 = 6;

    TextView tvColor, tvSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvColor = findViewById(R.id.tvColor);
        tvSize = findViewById(R.id.tvSize);

        /*На вход ему передается View и это означает, что для этой View необходимо создавать контекстное меню.
        Если не выполнить этот метод, контекстное меню для View создаваться не будет.*/
        registerForContextMenu(tvColor);
        registerForContextMenu(tvSize);
        /*Второй вариант создания*/
//        tvColor.setOnCreateContextMenuListener(this);
//        tvSize.setOnCreateContextMenuListener(this);
    }
    /*Создание контекстного меню*/
    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo){
        switch (view.getId()){
            case R.id.tvColor:
                contextMenu.add(0, MENU_COLOR_RED, 0, "Red");
                contextMenu.add(0, MENU_COLOR_GREEN, 0, "Green");
                contextMenu.add(0, MENU_COLOR_BLUE, 0, "Blue");
                break;
            case R.id.tvSize:
                contextMenu.add(0, MENU_SIZE_22, 0, "22");
                contextMenu.add(0, MENU_SIZE_26, 0, "26");
                contextMenu.add(0, MENU_SIZE_30, 0, "30");
                break;
        }
    }
    /*Обработка нажатия. Создание слушателя*/
    @Override
    public boolean onContextItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            /*пункты меню для tvColor*/
            case MENU_COLOR_RED:
                tvColor.setTextColor(Color.RED);
                tvColor.setText("Text color = red");
                break;
            case MENU_COLOR_BLUE:
                tvColor.setTextColor(Color.BLUE);
                tvColor.setText("Text color = blue");
                break;
            case MENU_COLOR_GREEN:
                tvColor.setTextColor(Color.GREEN);
                tvColor.setText("Text color = green");
                break;
            /*пункты меню для tvSize*/
            case MENU_SIZE_22:
                tvSize.setTextSize(22);
                tvSize.setText("Text size = 22");
                break;
            case MENU_SIZE_26:
                tvSize.setTextSize(26);
                tvSize.setText("Text size = 26");
                break;
            case MENU_SIZE_30:
                tvSize.setTextSize(30);
                tvSize.setText("Text size = 30");
                break;
        }return super.onContextItemSelected(menuItem);
    }
}
