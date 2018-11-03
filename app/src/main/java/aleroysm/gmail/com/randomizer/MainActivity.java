package aleroysm.gmail.com.randomizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button rollButton = (Button) findViewById(R.id.rollButton);
        final TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        TextView howManyTextView = (TextView) findViewById(R.id.howManyTextView);
        final SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomNum = (int) (Math.random() * seekBar.getProgress())+1;
                resultTextView.setText(randomNum + "");
            }
        });


    }
}
