package com.example.ageclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView ageText;
    private TextView resurrectionText;
    private String ageList[] = new String[]{"New Born", "Toddler", "Child", "Teenager", "Young Adult", "Adult", "Middle Aged", "Elder"};
    private int ageCounter = 1;
    private int resurrectionCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ageText = findViewById(R.id.age_texts);
        resurrectionText = findViewById(R.id.resurrection_counter);

        ageText.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                ageText.setText(ageList[ageCounter]);
                Toast.makeText(MainActivity.this, "growing up", Toast.LENGTH_SHORT).show();
                if(ageCounter == 0) {
                    resurrectionText.setText("" + resurrectionCounter);
                    ageCounter++;
                }
                else if(ageCounter<7)
                    ageCounter++;
                else {
                    ageCounter = 0;
                    resurrectionCounter++;
                }
            }
        }
    );
    }
}
