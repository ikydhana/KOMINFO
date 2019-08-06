package id.ac.poliban.jmp.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> listItem = new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItem.add("Dimas Ekky");
        listItem.add("Lukas Tulovic");
        listItem.add("Steven Ondendaal");
        listItem.add("Andrea Locatelli");
        listItem.add("Lorenzo Baldasarri");
        listItem.add("Yudhistira");
        listItem.add("Nicolo Bulega");
        listItem.add("Luca Marini");
        listItem.add("Tom Jhonsen");
        listItem.add("Brad Pieter");
        listItem.add("Iker Lolucina");
        listItem.add("Baldis Recones");
        listItem.add("Valentino Badres");
        listItem.add("Enea Bastiani");
        listItem.add("Augusto Fernando");
        listItem.add("Izoy Valen");
        listItem.add("Bread Binder");
        listItem.add("Xavi Vierge");
        listItem.add("Jake Dixon");
        listItem.add("Remy Gardener");

        listView = findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter
                (this, R.layout.support_simple_spinner_dropdown_item, listItem);

                listView.setAdapter(adapter);

    }
}
