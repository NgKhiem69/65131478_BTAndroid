package thigk2.NguyenGiaKhiem.a65131478;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnCN2, btnCN3, btnCN4, btnAbout, btnExtra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCN2 = findViewById(R.id.btnCN2);
        btnCN3 = findViewById(R.id.btnCN3);
        btnCN4 = findViewById(R.id.btnCN4);
        btnAbout = findViewById(R.id.btnAbout);
        btnExtra = findViewById(R.id.btnExtra);

        btnCN2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChucNang2Activity.class)));
        btnCN3.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChucNang3Activity.class)));
        btnCN4.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChucNang4Activity.class)));
        btnAbout.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, AboutMeActivity.class)));
        btnExtra.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ExtraActivity.class)));
    }
}