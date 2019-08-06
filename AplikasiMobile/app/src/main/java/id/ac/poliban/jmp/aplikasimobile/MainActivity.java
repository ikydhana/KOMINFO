package id.ac.poliban.jmp.aplikasimobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editNim, editNama, editAlamat, editPhone;
    Button buttonClear, buttonShow;
    TextView name, tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    buttonShow = findViewById(R.id.buttonShow);
    buttonClear = findViewById(R.id.buttonClear);
    editNim = findViewById(R.id.editNim);
    editNama = findViewById(R.id.editNama);
    editAlamat = findViewById(R.id.editAlamat);
    editPhone = findViewById(R.id.editPhone);
    name = findViewById(R.id.name);
    tvShow = findViewById(R.id.tvShow);


    buttonClear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            editNim.setText(" ");
            editNama.setText(" ");
            editAlamat.setText(" ");
            editPhone.setText(" ");
            tvShow.setText(" ");
        }
    });

    buttonShow.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            tvShow.setText("NIM : " + editNim.getText());
            tvShow.append("Nama : " + editNama.getText());
            tvShow.append("Alamat : " + editAlamat.getText());
            tvShow.append("Nomor Telephone : " + editPhone.getText());
        }
    });

    }
}
