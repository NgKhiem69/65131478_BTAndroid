package thigk2.NguyenGiaKhiem.a65131478;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ChucNang2Activity extends AppCompatActivity {
    EditText etMid, etFinal;
    Button btnTinh;
    TextView tvKetqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang2);
        etMid = findViewById(R.id.etMid);
        etFinal = findViewById(R.id.etFinal);
        btnTinh = findViewById(R.id.btnTinh);
        tvKetqua = findViewById(R.id.tvKetqua);

        btnTinh.setOnClickListener(v -> {
            String sMid = etMid.getText().toString().trim();
            String sFinal = etFinal.getText().toString().trim();
            if (sMid.isEmpty() || sFinal.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập cả điểm giữa kỳ và cuối kỳ", Toast.LENGTH_SHORT).show();
                return;
            }
            try {
                double mid = Double.parseDouble(sMid);
                double fin = Double.parseDouble(sFinal);
                double avg = mid * 0.5 + fin * 0.5; // theo hình là 50% + 50%
                tvKetqua.setText(String.format("Điểm TB: %.2f", avg));
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Vui lòng nhập số hợp lệ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}