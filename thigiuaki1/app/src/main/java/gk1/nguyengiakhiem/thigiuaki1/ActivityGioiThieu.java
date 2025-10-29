package gk1.nguyengiakhiem.thigiuaki1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.button.MaterialButton;

public class ActivityGioiThieu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        MaterialButton btnGithub = findViewById(R.id.btn_github);
        MaterialButton btnEmail = findViewById(R.id.btn_email);
        MaterialButton btnPhone = findViewById(R.id.btn_phone);


        btnGithub.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://github.com/NgKhiem69"));
            startActivity(browserIntent);
        });

        btnEmail.setOnClickListener(v -> {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO,
                    Uri.parse("mailto:gk699488@gmail.com"));
            startActivity(Intent.createChooser(emailIntent, "Gửi email bằng..."));
        });

        btnPhone.setOnClickListener(v -> {
            Intent dialIntent = new Intent(Intent.ACTION_DIAL,
                    Uri.parse("tel:0869498413"));
            startActivity(dialIntent);
        });
    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
