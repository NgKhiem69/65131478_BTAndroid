package gk1.nguyengiakhiem.thigiuaki1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Khai báo các nút chức năng
    private Button btnCN2, btnCN3, btnCN4, btnAbout, btnThem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các nút từ layout
        btnCN2 = findViewById(R.id.btnCN2);
        btnCN3 = findViewById(R.id.btnCN3);
        btnCN4 = findViewById(R.id.btnCN4);
        btnAbout = findViewById(R.id.btnAbout);


        // Gọi sự kiện click cho từng nút
        btnCN2.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ActivityBMI.class))
        );

        btnCN3.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ActivityMonAn.class))
        );

        btnCN4.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ActivityBaiThuoc.class))
        );

        btnAbout.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ActivityGioiThieu.class))
        );
    }
}