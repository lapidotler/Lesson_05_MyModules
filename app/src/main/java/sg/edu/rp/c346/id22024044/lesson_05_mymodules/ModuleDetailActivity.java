package sg.edu.rp.c346.id22024044.lesson_05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import sg.edu.rp.c346.id22024044.lesson_05_mymodules.R;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvCredit = findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);

        ArrayList<Module> moduleList = new ArrayList<Module>();

        Module moduleC218 = new Module("C218", "UI/UX Design for Apps", "2023", "1", 4, "W65C");
        Module moduleC235 = new Module("C235", "IT Security and Management", "2023", "1", 4, "W65C");
        Module moduleC346 = new Module("C346", "Mobile App Development", "2023", "1", 4, "E63A");
        Module moduleC206 = new Module("C206", "Software Development Process", "2023", "1", 4, "W65C");
        Module moduleG953 = new Module("G953", "Life Skills III", "2023", "1", 1, "HB02");
        Module moduleC203 = new Module("C203", "Web AppIn Development in php", "2023", "1", 4, "W65C");
        Module moduleC390 = new Module("C390", "Portfolio Development", "2023/24", "1 & 2", 4, "N.A");

        moduleList.add(moduleC218);
        moduleList.add(moduleC235);
        moduleList.add(moduleC346);
        moduleList.add(moduleC206);
        moduleList.add(moduleG953);
        moduleList.add(moduleC203);
        moduleList.add(moduleC390);

        Intent intentReceived = getIntent();

        for (int i = 0; i < moduleList.size(); i++) {

            if (intentReceived.hasExtra(moduleList.get(i).code)) {
                String getCode = moduleList.get(i).code;
                String getName = moduleList.get(i).moduleName;
                String getYear = moduleList.get(i).year;
                String getSem = moduleList.get(i).sem;
                int getCredit = moduleList.get(i).moduleCredit;
                String getVenue = moduleList.get(i).venue;

                Intent intendReceivedCode = getIntent();
                String code = intendReceivedCode.getStringExtra(getCode);

                String codeView = tvCode.getText().toString();
                String nameView = tvName.getText().toString();
                String yearView = tvYear.getText().toString();
                String semView = tvSem.getText().toString();
                String creditView = tvCredit.getText().toString();
                String venueView = tvVenue.getText().toString();

                tvCode.setText(codeView + code);
                tvName.setText(nameView + getName);
                tvYear.setText(yearView + getYear);
                tvSem.setText(semView + getSem);
                tvCredit.setText(creditView + getCredit);
                tvVenue.setText(venueView + getVenue);

            }

        }

    }
}