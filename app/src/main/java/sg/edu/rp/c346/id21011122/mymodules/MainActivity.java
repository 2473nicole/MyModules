package sg.edu.rp.c346.id21011122.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Event handling Step 1
    TextView tvAndroid;
    TextView tviPad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling Step 2
        tvAndroid = findViewById(R.id.textViewAndroid);
        tviPad = findViewById(R.id.textViewiPad);

        tvAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, C346.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });
        tviPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, C349.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });
    }
}