package NguyenGiaKhiem.th_bai3_chuyenmanhinh_fragment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvMessage = findViewById(R.id.tvMessage);

        // Nhận dữ liệu từ màn hình trước
        String hoTen = getIntent().getStringExtra("hoTen");

        if (hoTen != null && !hoTen.isEmpty()) {
            tvMessage.setText("Xin chào, " + hoTen + " 👋");
        } else {
            tvMessage.setText("Chào mừng bạn đến với màn hình 2!");
        }
    }
}