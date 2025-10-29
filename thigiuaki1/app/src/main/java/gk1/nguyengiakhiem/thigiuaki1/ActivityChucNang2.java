package gk1.nguyengiakhiem.thigiuaki1;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.*;
public class ActivityChucNang2 {

    EditText edtHeight, edtWeight;
    RadioGroup rgStandard;
    RadioButton rbGlobal, rbAsian;
    Button btnCalculate;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ view từ XML
        edtHeight = findViewById(R.id.edtHeight);
        edtWeight = findViewById(R.id.edtWeight);
        rgStandard = findViewById(R.id.rgStandard);
        rbGlobal = findViewById(R.id.rbGlobal);
        rbAsian = findViewById(R.id.rbAsian);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);

        // Bắt sự kiện click nút "Tính BMI"
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhBMI();
            }
        });
    }

    private void tinhBMI() {
        String chieuCaoStr = edtHeight.getText().toString().trim();
        String canNangStr = edtWeight.getText().toString().trim();

        if (chieuCaoStr.isEmpty() || canNangStr.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ chiều cao và cân nặng!", Toast.LENGTH_SHORT).show();
            return;
        }

        double chieuCao = Double.parseDouble(chieuCaoStr) / 100.0; // cm -> m
        double canNang = Double.parseDouble(canNangStr);
        double bmi = canNang / (chieuCao * chieuCao);

        String phanLoai;

        if (rbGlobal.isChecked()) {
            phanLoai = phanLoaiToanCau(bmi);
        } else {
            phanLoai = phanLoaiChauA(bmi);
        }

        // Hiển thị kết quả
        tvResult.setText(String.format("Chỉ số BMI: %.2f\nPhân loại: %s", bmi, phanLoai));
    }

    // Phân loại theo tiêu chuẩn Toàn cầu (WHO)
    private String phanLoaiToanCau(double bmi) {
        if (bmi < 18.5) return "Thiếu cân";
        else if (bmi < 24.9) return "Bình thường";
        else if (bmi < 29.9) return "Thừa cân";
        else return "Béo phì";
    }

    // Phân loại theo tiêu chuẩn Châu Á
    private String phanLoaiChauA(double bmi) {
        if (bmi < 18.5) return "Thiếu cân";
        else if (bmi < 23) return "Bình thường";
        else if (bmi < 27.5) return "Thừa cân";
        else return "Béo phì";
    }
}
}
