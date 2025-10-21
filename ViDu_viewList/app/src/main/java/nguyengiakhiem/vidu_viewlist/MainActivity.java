package nguyengiakhiem.vidu_viewlist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    ListView listViewRandom;
    ArrayAdapter<String> adapter;
    ArrayList<String> danhSachTen = new ArrayList<>();
    String[] mauTen = {"An", "Bình", "Chi", "Dũng", "Hà", "Huy", "Khánh", "Linh", "Minh", "Nam", "Ngọc", "Phúc", "Quân", "Thảo", "Trang"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewRandom = findViewById(R.id.listViewRandom);

        // Tạo danh sách ngẫu nhiên
        taoDanhSachNgauNhien();

        // Gán dữ liệu vào ListView bằng ArrayAdapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, danhSachTen);
        listViewRandom.setAdapter(adapter);

        // Bắt sự kiện khi người dùng nhấn vào 1 phần tử
        listViewRandom.setOnItemClickListener((parent, view, position, id) -> {
            String tenDuocChon = danhSachTen.get(position);
            Toast.makeText(this, "Bạn đã chọn: " + tenDuocChon, Toast.LENGTH_SHORT).show();
        });
    }

    private void taoDanhSachNgauNhien() {
        Random random = new Random();
        danhSachTen.clear();
        for (int i = 0; i < 10; i++) {
            String ten = mauTen[random.nextInt(mauTen.length)];
            danhSachTen.add("Người thứ " + (i + 1) + ": " + ten);
        }
    }
}