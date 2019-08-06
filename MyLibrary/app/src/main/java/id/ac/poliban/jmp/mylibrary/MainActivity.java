package id.ac.poliban.jmp.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button btnStore, btnGetall;
    private EditText etname;
    private DatabaseHelper databaseHelper;
    private TextView tvNames;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = new DatabaseHelper(this);
        tvNames = (TextView) findViewById(R.id.tvNames);
        btnGetall = (Button) findViewById(R.id.btnGet);
        btnStore = (Button) findViewById(R.id.btnStore);
        etname = (EditText) findViewById(R.id.etname);

        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseHelper.addStudentDetail(etname.getText().toString());
                etname.setText("");
                Toast.makeText(MainActivity.this, "Stored Successfully", Toast.LENGTH_SHORT).show();
            }
        });
        btnGetall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList = databaseHelper.getAllStudentsList();
                tvNames.setText("");
                for (int i = 0; i < arrayList.size(); i++){
                    tvNames.setText(tvNames.getText().toString()+", "+arrayList.get(i));
                }
            }
        });
    }
}