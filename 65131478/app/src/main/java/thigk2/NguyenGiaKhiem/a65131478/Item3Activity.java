package thigk2.NguyenGiaKhiem.a65131478;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Item3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item3);

        TextView tvChiTiet = findViewById(R.id.tvChiTiet);
        String text = getIntent().getStringExtra("text");

        tvChiTiet.setText("Bạn đã chọn môn: " + text);
    }
}
