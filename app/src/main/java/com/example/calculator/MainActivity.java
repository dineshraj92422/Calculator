package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnsub,btnmul,btndiv,btndot,btnequal;
    Button btnclear;
    EditText edt,edt1;
    double res1,res2;
    boolean add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnadd=(Button)findViewById(R.id.btnadd);
        btnsub=(Button)findViewById(R.id.btnsub);
        btnmul=(Button)findViewById(R.id.btnmul);
        btndiv=(Button)findViewById(R.id.btndiv);
        btndot=(Button)findViewById(R.id.btndot);
        btnequal=(Button)findViewById(R.id.btnequal);
        btnclear=(Button)findViewById(R.id.btnclear);
        edt=(EditText)findViewById(R.id.edittext);
        edt1=(EditText)findViewById(R.id.edt1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"3");
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"6");
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"7");
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"8");
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"9");
            }
        });


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+"0");
            }
        });



        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText(edt.getText()+".");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt==null){
                    edt.setText("0");
                }else{
                    res1=Float.parseFloat(edt.getText()+"");
                    add=true;
                    edt1.setText(edt.getText()+" + ");
                    edt.setText(null);
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt==null){
                    edt.setText("0");
                }else{
                    res1=Float.parseFloat(edt.getText()+"");
                    sub=true;
                    edt1.setText(edt.getText()+" - ");
                    edt.setText(null);
                }
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt==null){
                    edt.setText("0");
                }else{
                    res1=Float.parseFloat(edt.getText()+"");
                    mul=true;
                    edt1.setText(edt.getText()+" * ");
                    edt.setText(null);
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt==null){
                    edt.setText("0");
                }else{
                    res1=Float.parseFloat(edt.getText()+"");
                    div=true;
                    edt1.setText(edt.getText()+" / ");
                    edt.setText(null);
                }
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res2=Float.parseFloat(edt.getText()+"");
                edt1.setText(edt1.getText() + "" +res2);
                if(add==true){
                    edt.setText(res1+res2+"");
                    add=false;

                }
                if(sub==true){
                    edt.setText(res1-res2+"");
                    sub=false;

                }
                if(mul==true){
                    edt.setText(res1*res2+"");
                    mul=false;

                }
                if(div==true){
                    edt.setText(res1/res2+"");
                    div=false;
                }
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText("");
                edt1.setText("");
            }
        });
    }
}