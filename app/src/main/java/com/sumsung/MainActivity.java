package com.sumsung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView passworld = findViewById(R.id.textPassworld);
        CheckBox checkBoxNumbers = findViewById(R.id.checkBoxNumbers);
        CheckBox checkBoxCaps = findViewById(R.id.checkBoxCaps);
        CheckBox checkBoxSimb = findViewById(R.id.checkBoxSimb);
        Button buttonGenerate = findViewById(R.id.buttonGenerate);





        buttonGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean isNumbers = checkBoxNumbers.isChecked();
                Boolean isCaps = checkBoxCaps.isChecked();
                Boolean isSimb = checkBoxSimb.isChecked();
                Password p = new Password(isNumbers, isCaps, isSimb);
                passworld.setText(p.generate());
            }
        });

/*
        Button button = findViewById(R.id.myButton);
        TextView textView = findViewById(R.id.myTextView);
        EditText editText = findViewById(R.id.editTextTextPersonName);
        final int[] cnt = {0};

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                //String a = editText.getText().toString();
                String a = s.toString();
                int num = Integer.parseInt(a);
                if(num % 2 == 0){
                    textView.setText("чет");
                }
                else{
                    textView.setText("неч");
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                String a = editText.getText().toString();
                int num = Integer.parseInt(a);
                if(num % 2 == 0){
                    textView.setText("чет");
                }
                else{
                    textView.setText("неч");
                }
                /*
                String a = textView.getText().toString();
                int b = Integer.parseInt(a);
                b += 1;
                String a1 = "" + b;
                textView.setText(a1);

                /*
                cnt[0] =+ 1;
                String a =cnt[0].toString();
                textView.setText(cnt[0]);
                /*
                String raw = textView.getText().toString();
                raw += "my-string";
                textView.setText(raw);

                System.out.println("Clicked!!");

            }
        });
*/
    }
}