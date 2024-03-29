package net.ru.ivvolod.p0141menuadv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    CheckBox chb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
        chb = findViewById(R.id.chbExtMenu);
    }

    /*создание меню.
    * вызывается только при первом показе меню.
    * Создает меню и более не используется. Здесь мы добавляем к меню пункты*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        // добавляем пункты меню
//        menu.add(0, 1, 0, "add");
//        menu.add(0, 2, 0, "edit");
//        menu.add(0, 3, 3, "delete");
//        menu.add(1, 4, 1, "copy");
//        menu.add(1, 5, 2, "paste");
//        menu.add(1, 6, 4, "exit");
        //создание меню из файла mymenu.xml
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /*обновление меню
    * вызывается каждый раз перед отображением меню. Здесь мы вносим изменения в уже созданное меню, если это необходимо
    * */
    @Override
    public boolean onPrepareOptionsMenu(Menu menu){
//        menu.setGroupVisible(1, chb.isChecked());
//      второй вариант используем idGroup
        menu.setGroupVisible(R.id.group1,chb.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }
    /*обработка нажатий.
    * вызывается при нажатии пункта меню. Здесь мы определяем какой пункт меню был нажат*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        // TODO Auto-generated method stub
        StringBuilder sb = new StringBuilder();

        // Выведем в TextView информацию о нажатом пункте меню
        sb.append("Item Menu");
        sb.append("\r\n groupId: " + String.valueOf(item.getGroupId()));
        sb.append("\r\n itemId: " + String.valueOf(item.getItemId()));
        sb.append("\r\n order: " + String.valueOf(item.getOrder()));
        sb.append("\r\n title: " + item.getTitle());
        tv.setText(sb.toString());

        return super.onOptionsItemSelected(item);
    }
}
