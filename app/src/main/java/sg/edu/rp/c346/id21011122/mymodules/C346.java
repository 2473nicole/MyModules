package sg.edu.rp.c346.id21011122.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class C346 extends AppCompatActivity {
    TextView C346;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c346);

        C346 = findViewById(R.id.textView);

        C346.setText("Module Code:C345 \nModule Name:Android Programming \nAcademic Year:2020 \n Semester:1 \n Module Credit:4 \n Venue:W66M");
    }
}