package sg.edu.rp.c346.id22024044.lesson_05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import sg.edu.rp.c346.id22024044.lesson_05_mymodules.R;

public class MainActivity extends AppCompatActivity {

    TextView tvC218;
    TextView tvC235;
    TextView tvC346;
    TextView tvC206;
    TextView tvG953;
    TextView tvC203;
    TextView tvC390;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC218 = findViewById(R.id.textViewC218);
        tvC235 = findViewById(R.id.textViewC235);
        tvC346 = findViewById(R.id.textViewC346);
        tvC206 = findViewById(R.id.textViewC206);
        tvG953 = findViewById(R.id.textViewG953);
        tvC203 = findViewById(R.id.textViewC203);
        tvC390 = findViewById(R.id.textViewC390);

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("C218", "C218");
                startActivity(intent);

            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("C235", "C235");
                startActivity(intent);

            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("C346", "C346");
                startActivity(intent);

            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("C206", "C206");
                startActivity(intent);

            }
        });

        tvG953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("G953", "G953");
                startActivity(intent);

            }
        });

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("C203", "C203");
                startActivity(intent);

            }
        });

        tvC390.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("C390", "C390");
                startActivity(intent);

            }
        });

    }

}