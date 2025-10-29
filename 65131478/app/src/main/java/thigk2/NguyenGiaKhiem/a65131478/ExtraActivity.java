package thigk2.NguyenGiaKhiem.a65131478;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExtraActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);
        TextView tv = findViewById(R.id.tvExtra);
        tv.setText("Làm thêm: Ví dụ này là trang mô tả chức năng bonus.\nBạn có thể thay bằng tính năng khác từ Git Repo của bạn.");
    }
}