package com.subash.arthmetic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText no1,no2;
    Button add;
    TextView addition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1=(EditText)findViewById(R.id.no1);
        no2=(EditText)findViewById(R.id.no2);
        add=(Button)findViewById(R.id.add);
        addition=(TextView)findViewById(R.id.addno);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no11=no1.getText().toString();
                String no22=no2.getText().toString();

                if (TextUtils.isEmpty(no11))
                {
                    no1.setError(("enter first no"));
                }
                else if(TextUtils.isEmpty(no22))
                {
                    no2.setError("enter second no");
                }
                else
                {
                    int number1=Integer.parseInt(no11);
                    int number2=Integer.parseInt(no22);

                    int c=number1+number2;
                    addition.setText(" "+c);
                }
            }
        });
}
}

