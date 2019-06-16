package net.ru.ivvolod.p0131menusimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add("menu1");
        menu.add("menu2");
        menu.add("menu3");
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem menuItem){
        Toast.makeText(this, menuItem.getTitle(), Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(menuItem);
    }
}
