package nguyengiakhiem.vidu_onclicklistener;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSayHello;
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSayHello = findViewById(R.id.btnSayHello);
        tvMessage = findViewById(R.id.tvMessage);

        // Cách 1: Dùng hàm ẩn danh (Anonymous Class)
        btnSayHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMessage.setText("Xin chào bạn 👋");
                Toast.makeText(MainActivity.this, "Bạn vừa bấm nút!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}