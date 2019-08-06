package id.ac.poliban.jmp.demomenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        return super.onCreateOptionsMenu(menu);
//        Mengsinkronisasi view optionmenu ke layout
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        return super.onOptionsItemSelected(item);
    switch (item.getItemId()){
        case R.id.menu1 :
            Intent intent = new Intent(this, MenuActivity1.class);
            startActivity(intent);
            break;
        case R.id.menu2 :
//            Intent intent = new Intent(this, MenuActivity2.class);
            startActivity(new Intent(this, MenuActivity2.class));
            break;
        case R.id.menu3 :
//            Intent intent = new Intent(this, MenuActivity3.class);
            startActivity(new Intent(this, MenuActivity3.class));
            break;
    }
    return true;
    }
}