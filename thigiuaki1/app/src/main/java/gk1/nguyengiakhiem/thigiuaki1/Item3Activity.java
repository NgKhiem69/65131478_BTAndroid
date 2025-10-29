package gk1.nguyengiakhiem.thigiuaki1;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Item3Activity extends AppCompatActivity {

    private TextView tvTenMon, tvMoTa, tvGiaTien, tvDauBep;
    private MaterialButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item3);

        tvTenMon = findViewById(R.id.tvTenMon);
        tvMoTa = findViewById(R.id.tvMoTa);
        tvGiaTien = findViewById(R.id.tvGiaTien); // tái sử dụng id cũ để khỏi sửa layout
        tvDauBep = findViewById(R.id.tvDauBep);
        btnBack = findViewById(R.id.btnBack3);

        // Lấy dữ liệu tên món ăn từ intent
        String tenMon = getIntent().getStringExtra("tenMon");
        tvTenMon.setText(tenMon);

        // Tìm chi tiết món ăn trong file JSON
        findMonAnDetails(tenMon);

        // Nút quay lại
        btnBack.setOnClickListener(v -> finish());
    }

    /**
     * Tải file list.json, tìm món ăn và cập nhật giao diện
     * @param tenMonCanTim Tên món ăn được gửi từ ActivityChucNang3
     */
    private void findMonAnDetails(String tenMonCanTim) {
        String jsonString;

        try {
            InputStream is = getAssets().open("list.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            jsonString = new String(buffer, StandardCharsets.UTF_8);
        } catch (IOException e) {
            Toast.makeText(this, "Lỗi đọc file JSON!", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            JSONArray jsonArray = new JSONArray(jsonString);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject monAn = jsonArray.getJSONObject(i);

                if (monAn.getString("tenMon").equals(tenMonCanTim)) {
                    tvMoTa.setText(monAn.getString("moTa"));
                    tvGiaTien.setText(monAn.getString("giaTien")); // dùng để hiển thị giá
                    tvDauBep.setText(monAn.getString("dauBep"));
                    return;
                }
            }

            Toast.makeText(this, "Không tìm thấy thông tin món ăn!", Toast.LENGTH_SHORT).show();

        } catch (JSONException e) {
            Toast.makeText(this, "Lỗi định dạng JSON!", Toast.LENGTH_SHORT).show();
        }
    }
}
