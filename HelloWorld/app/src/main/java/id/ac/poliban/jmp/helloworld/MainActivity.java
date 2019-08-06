package id.ac.poliban.jmp.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText eNim, eName;
    private Button buttonClear, buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Buat objek dari id2 yang telah kita buat pada layout tadi (activity_main.xml)
//        Mengenalkan class kita terhadap id-id yang ada dilayout
//        agar dapat dimanipulasi
        eNim = findViewById(R.id.eNim);
        eName = findViewById(R.id.eName);
        buttonClear = findViewById(R.id.buttonClear);
        buttonSave = findViewById(R.id.buttonSave);

        //memasang listener dan menangani event handler Clear & Save
        buttonClear.setOnClickListener(this);
        buttonSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//  Tangani kejadian button clear
        if (view.getId() == R.id.buttonClear) {
            eNim.setText("UYY KOSONG");
            eName.setText("UYY KOSONG JUA");
        }

//  Tangani kejadian button save
        if (view.getId()==R.id.buttonSave){
            String s = "NIM : " + eNim.getText() + "\n" +
                    "Nama Mahasiswa : " + eName.getText();

//            munculkan pesan notifikasi
            Toast.makeText(this, s, Toast.LENGTH_LONG).show();
        }
    }
}