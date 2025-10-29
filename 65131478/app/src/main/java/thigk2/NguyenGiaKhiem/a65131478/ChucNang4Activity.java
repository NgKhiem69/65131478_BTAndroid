package thigk2.NguyenGiaKhiem.a65131478;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ChucNang4Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<HoatDong> list;
    HoatDongAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang4);

        recyclerView = findViewById(R.id.recyclerView4);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // 🔹 Khởi tạo danh sách hoạt động
        list = new ArrayList<>();
        list.add(new HoatDong("Tiêu đề hoạt động 1", "Thời gian: 01/10/2025", R.drawable.logontu));
        list.add(new HoatDong("Tiêu đề hoạt động 2", "Thời gian: 05/10/2025", R.drawable.logontu));
        list.add(new HoatDong("Tiêu đề hoạt động 3", "Thời gian: 10/10/2025", R.drawable.logontu));

        // 🔹 Gán adapter
        adapter = new HoatDongAdapter(list, this);
        recyclerView.setAdapter(adapter);
    }
}
