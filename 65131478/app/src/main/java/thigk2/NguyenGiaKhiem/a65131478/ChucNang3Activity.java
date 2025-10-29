package thigk2.NguyenGiaKhiem.a65131478;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ChucNang3Activity extends AppCompatActivity {
    ListView lvMonHoc;
    String[] items = {
            "Tin học đại cương",
            "Lập trình Java",
            "Phát triển ứng dụng web",
            "Khai phá dữ liệu lớn",
            "Kinh tế chính trị Mác-Lênin"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang3);

        lvMonHoc = findViewById(R.id.lvMonHoc);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.item_monhoc,  // layout custom cho từng dòng
                R.id.tvMonHoc,
                items
        );
        lvMonHoc.setAdapter(adapter);

        lvMonHoc.setOnItemClickListener((AdapterView<?> parent, View view, int position, long id) -> {
            String selected = items[position];

            // Chuyển sang Item3Activity truyền nội dung
            Intent i = new Intent(ChucNang3Activity.this, Item3Activity.class);
            i.putExtra("text", selected);
            startActivity(i);
        });
    }
}
