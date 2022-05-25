package sg.edu.rp.c346.id21011122.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class C349 extends AppCompatActivity {
    TextView C349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c349);

        C349 = findViewById(R.id.textView);
        C349.setText("Module Code:C349 \nModule Name:iPad Programming \nAcademic Year:2020 \n Semester:1 \n Module Credit:4 \n Venue:W66M");
    }

    }
}