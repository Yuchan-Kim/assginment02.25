package com.example.assginment02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText01, editText02;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText01 = findViewById(R.id.editTextTextPassword);
        editText02 = findViewById(R.id.editTextTextPassword2);
        result = (TextView) findViewById(R.id.result);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean equals = editText01.getText().toString().equals(editText02.getText().toString());
                if (equals == true){
                    result.setText("THANK YOU");
                }else {
                    result.setText("PASSWORDS MUST MATCH");
                }
            }
        });




    }




}