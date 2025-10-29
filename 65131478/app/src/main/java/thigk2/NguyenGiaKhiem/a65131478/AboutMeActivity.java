package thigk2.NguyenGiaKhiem.a65131478;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutMeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);
        TextView tv = findViewById(R.id.tvAbout);
        tv.setText("Tên: Nguyễn Văn A\nMSSV: 12345678\nLớp: CNTT-01\nEmail: nguyenvana@example.com\nGitHub: github.com/nguyenvana");
    }
}