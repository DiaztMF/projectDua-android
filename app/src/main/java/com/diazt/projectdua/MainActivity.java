package com.diazt.projectdua;

import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.Gravity;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String nomor;
    private String tipe;
    private int selectedId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText nomorInput = findViewById(R.id.nomor);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.rumah) {
                tipe = "Nomor Telepon Rumah";
            } else if (checkedId == R.id.kantor) {
                tipe = "Nomor Telepon Kantor";
            } else if (checkedId == R.id.pribadi) {
                tipe = "Nomor Telepon Pribadi";
            }
        });

        Button tombolSubmit = findViewById(R.id.button);
        tombolSubmit.setOnClickListener(v -> {
            nomor = nomorInput.getText().toString().trim();
            selectedId = radioGroup.getCheckedRadioButtonId();

            if (nomor.isEmpty() && selectedId == -1) {
                Toast.makeText(this, "Harap isi nomor dan pilih tipe!", Toast.LENGTH_SHORT).show();
            }

            else if (nomor.isEmpty()) {
                Toast.makeText(this, "Harap isi nomor terlebih dahulu!", Toast.LENGTH_SHORT).show();
            }

            else if (selectedId == -1) {
                Toast.makeText(this, "Harap pilih tipe terlebih dahulu!", Toast.LENGTH_SHORT).show();
            } else {
                Toast toast = Toast.makeText(
                        MainActivity.this, "Berhasil menyimpan " + nomor + " sebagai " + tipe,
                        Toast.LENGTH_SHORT
                );

                View view = toast.getView();
                view.setBackgroundColor(Color.BLACK);
                TextView text = view.findViewById(android.R.id.message);
                text.setTextColor(Color.WHITE);
                toast.setGravity(Gravity.BOTTOM, 0, 200);
                toast.show();

                radioGroup.clearCheck();
                nomorInput.setText("");
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}