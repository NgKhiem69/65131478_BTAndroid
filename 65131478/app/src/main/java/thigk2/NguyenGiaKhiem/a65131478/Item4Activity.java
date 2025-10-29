package thigk2.NguyenGiaKhiem.a65131478;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Item4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item4);

        TextView tvInfo = findViewById(R.id.tvInfo);
        String tieude = getIntent().getStringExtra("tieude");
        String thoigian = getIntent().getStringExtra("thoigian");

        tvInfo.setText("Bạn đã chọn:\n" + tieude + "\n" + thoigian);
    }
}
