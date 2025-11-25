package nguyengiakhiem.sqlite_select;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Tạo CSOL
        db = openOrCreateDatabase("books.db", MODE_PRIVATE, null);
// Tạo báng BO0K
        String sqlXoaBang = "DROP TABLE IF EXISTS BOOKS";
        String sqlTaoBang = "CREATE TABLE BOOKS(BookID integer PRIMARY KEY, BookName text, Page integer, Price Float, Description text)";
        db.execSQL(sqlXoaBang);
        db.execSQL(sqlTaoBang);
//Thêm vào một số dòng dữ liệu
        String sqlThem1 = " INSERT INTO BOOKS VALUES(1, 'Java', 100, 9.99, 'sách về java') ";
        String sqlThem2 = " INSERT INTO BOOKS VALUES(2, 'Android', 320, 19.00, 'Android co bàn') ";
        db.execSQL(sqlThem1);
        db.execSQL(sqlThem2);
// Test
        db.close();//
    }
}