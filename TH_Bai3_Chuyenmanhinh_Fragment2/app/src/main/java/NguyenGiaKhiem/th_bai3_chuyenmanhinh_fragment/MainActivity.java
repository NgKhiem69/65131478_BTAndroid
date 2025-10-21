package NguyenGiaKhiem.th_bai3_chuyenmanhinh_fragment;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText edtName;
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        btnGo = findViewById(R.id.btnGo);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ten = edtName.getText().toString().trim();

                // Tạo Intent để chuyển màn hình
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                // Truyền dữ liệu kèm theo
                intent.putExtra("hoTen", ten);
                startActivity(intent);
            }
        });
    }
}