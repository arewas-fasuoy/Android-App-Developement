package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView input,output;
    Button btnadd,btnsub,btndiv,btnmul,btnequal,btnback,btnclear,btndot,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    String data,result;
    ArrayList<Character> operand = new ArrayList<Character>();
    ArrayList<String> numbers = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btndot=findViewById(R.id.btndot);
        btnadd=findViewById(R.id.btnadd);
        btnmul=findViewById(R.id.btnmul);
        btndiv=findViewById(R.id.btndiv);
        btnsub=findViewById(R.id.btnsub);
        btnclear=findViewById(R.id.btnclear);
        btnback=findViewById(R.id.btnback);
        btnequal=findViewById(R.id.btnequal);

        input=findViewById(R.id.input);
        output=findViewById(R.id.output);
        btnclear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                input.setText(" ");
                output.setText(" ");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"9");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"+");
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"-");
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"x");
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"÷");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+".");
            }
        });
        btnback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                if(data.length()>0){
                    data=data.substring(0,data.length()-1);
                    input.setText(data);
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                for(int i=0;i<data.length();i++){
                    if(data.charAt(i)=='+'){
                        String[] arrSplit = data.split("\\+");
                        result=Double.toString(Double.parseDouble(arrSplit[0])+Double.parseDouble(arrSplit[1]));

                    }
                    if(data.charAt(i)=='-'){
                        String[] arrSplit = data.split("-");
                        result=Double.toString(Double.parseDouble(arrSplit[0])-Double.parseDouble(arrSplit[1]));

                    }
                    if(data.charAt(i)=='x'){
                        String[] arrSplit = data.split("x");
                        result=Double.toString(Double.parseDouble(arrSplit[0])*Double.parseDouble(arrSplit[1]));

                    }
                    if(data.charAt(i)=='÷'){
                        String[] arrSplit = data.split("÷");
                        result=Double.toString(Double.parseDouble(arrSplit[0])/Double.parseDouble(arrSplit[1]));

                    }

                }
                output.setText(result);
            }
        });



    }

}