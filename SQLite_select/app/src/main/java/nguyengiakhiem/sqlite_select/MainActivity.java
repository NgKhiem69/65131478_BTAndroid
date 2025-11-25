package nguyengiakhiem.sqlite_select;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        // Tạo CSOL

        getBookData();

        // Hiện lên ListView
        ListView listView = findViewById(R.id.lvDangSachTenSach);
        ArrayAdapter<String> adapterTenSach = new ArrayAdapter<String>( MainActivity.this,
                android.R.layout.simple_list_item_1,
                dsTenSach);

        listView.setAdapter(adapterTenSach);
    }
    ArrayList<BOOKS> getBookData() {
        db = openOrCreateDatabase("books.db", MODE_PRIVATE, null);
//// Tạo báng BO0K
//        String sqlXoaBang = "DROP TABLE IF EXISTS BOOKS";
//        String sqlTaoBang = "CREATE TABLE BOOKS(BookID integer PRIMARY KEY, BookName text, Page integer, Price Float, Description text)";
//        db.execSQL(sqlXoaBang);
//        db.execSQL(sqlTaoBang);
////Thêm vào một số dòng dữ liệu
//        String sqlThem1 = " INSERT INTO BOOKS VALUES(1, 'Java', 100, 9.99, 'sách về java') ";
//        String sqlThem2 = " INSERT INTO BOOKS VALUES(2, 'Android', 320, 19.00, 'Android co bàn') ";
//        db.execSQL(sqlThem1);
//        db.execSQL(sqlThem2);
//// Test
//        db.close();//
        // Truy van
        String sqlSelectAll = "SELECT * FROM BOOKS";
        Cursor resultSet = db.rawQuery(sqlSelectAll, null);
        ArrayList<String> dsTenSach = new ArrayList<>();
        ArrayList<BOOKS> dsSach = new ArrayList<>();

        resultSet.moveToFirst();
        while (true) {
// Lấy dữ liệu của dòng/bản ghi hiện tại, trỏ bới resultSet
            int maSach = resultSet.getInt(0);
            String tenSach = resultSet.getString(1);
            int soTrang = resultSet.getInt(2);
            float giaBan = resultSet.getFloat(3);
            String moTa = resultSet.getString(4);
            BOOKS book = new BOOKS(maSach, tenSach, soTrang, giaBan, moTa);
// Gói vào 1 đối tượng
// Thêm vào biến danh sách
            dsTenSach.add(tenSach);
            dsSach.add(book);
// Di chuyển đến bàn ghi tiếp, nếu đã hết, thi thoát khỏi vòng lập
            if (resultSet.moveToNext() == false) break;
        }
        db.close();//
        return dsSach;
    }
    ArrayList<String> getBookName() {
        db = openOrCreateDatabase("books.db", MODE_PRIVATE, null);
        String sqlSelectAll = "SELECT * FROM BOOKS";
        Cursor resultSet = db.rawQuery(sqlSelectAll, null);
        ArrayList<String> dsTenSach = new ArrayList<String>();
        resultSet.moveToFirst();
        while (true) {
// Lấy dữ Liệu của đòng/bản ghi hiện tại, trỏ bới resultSet
            int maSach = resultSet.getInt(0);
            String tenSach = resultSet.getString(1);
            dsTenSach.add(tenSach);
            if (resultSet.moveToNext() == false) break;
        }
        db.close();//
        return dsTenSach;
    }

}