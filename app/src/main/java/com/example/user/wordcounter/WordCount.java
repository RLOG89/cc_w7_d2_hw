package com.example.user.wordcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 08/11/2016.
 */

public class WordCount extends AppCompatActivity {

    EditText mEnterText;
    TextView mReturnCount;
    Button mCountButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEnterText = (EditText)findViewById(R.id.enter_text);
        mReturnCount = (TextView)findViewById(R.id.return_count);
        mCountButton = (Button)findViewById(R.id.count_button);

        mCountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Log.d("WordCount", "Count button clicked!");
                String enter = mEnterText.getText().toString();
                Log.d("WordCount", "The words to count are '" + enter + "'");
//
                Counter counter = new Counter(mEnterText.getText().toString());
                String counterString = counter.getStrCount().toString();
                mReturnCount.setText(counterString);
            }
        });
    }
}