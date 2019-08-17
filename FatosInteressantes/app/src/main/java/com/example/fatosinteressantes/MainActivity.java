package com.example.fatosinteressantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.fatosinteressantes.info.ColorWheel;
import com.example.fatosinteressantes.info.Fact;

public class MainActivity extends AppCompatActivity {
    private TextView factMsg;
    private Button btnMoreOne;
    private Fact fact = new Fact();
    private RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            factMsg = (TextView) findViewById(R.id.msgFact);
            btnMoreOne = (Button) findViewById(R.id.btnMoreFact);
            relativeLayout = (RelativeLayout) findViewById(R.id.homeActivity);
            View.OnClickListener listener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int color = ColorWheel.getColor();
                    factMsg.setText(fact.getFato());
                    relativeLayout.setBackgroundColor(color);
                    btnMoreOne.setTextColor(color);
                }
            };
            btnMoreOne.setOnClickListener(listener);
    }

}
