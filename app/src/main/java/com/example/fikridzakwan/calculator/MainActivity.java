package com.example.fikridzakwan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtTextLayar;
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button buttonTambah, buttonKurang, buttonBagi, buttonKali;
    Button buttonClear,buttonSamadengan;

    public static double nilaiSekarang = 0;
    public static String operasiSekarang = "";
    public static double hasil = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    void init(){

        edtTextLayar = findViewById(R.id.edtTextLayar);
        button0 = findViewById(R.id.btn0);
        button0.setOnClickListener(this);
        button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.btn4);
        button4.setOnClickListener(this);
        button5 = findViewById(R.id.btn5);
        button5.setOnClickListener(this);
        button6 = findViewById(R.id.btn6);
        button6.setOnClickListener(this);
        button7 = findViewById(R.id.btn7);
        button7.setOnClickListener(this);
        button8 = findViewById(R.id.btn8);
        button8.setOnClickListener(this);
        button9 = findViewById(R.id.btn9);
        button9.setOnClickListener(this);

        buttonTambah = findViewById(R.id.btnPlus);
        buttonTambah.setOnClickListener(this);
        buttonKurang = findViewById(R.id.btnMinus);
        buttonKurang.setOnClickListener(this);
        buttonKali = findViewById(R.id.btnKali);
        buttonKali.setOnClickListener(this);
        buttonBagi = findViewById(R.id.btnBagi);
        buttonBagi.setOnClickListener(this);

        buttonClear = findViewById(R.id.btnClear);
        buttonClear.setOnClickListener(this);
        buttonSamadengan = findViewById(R.id.btnSamaDengan);
        buttonSamadengan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                edtTextLayar.setText(edtTextLayar.getText().toString().trim() + "0");
                break;
            case R.id.btn1:
                edtTextLayar.setText(edtTextLayar.getText().toString().trim() + "1");
                break;
            case R.id.btn2:
                edtTextLayar.setText(edtTextLayar.getText().toString().trim() + "2");
                break;
            case R.id.btn3:
                edtTextLayar.setText(edtTextLayar.getText().toString().trim() + "3");
                break;
            case R.id.btn4:
                edtTextLayar.setText(edtTextLayar.getText().toString().trim() + "4");
                break;
            case R.id.btn5:
                edtTextLayar.setText(edtTextLayar.getText().toString().trim() + "5");
                break;
            case R.id.btn6:
                edtTextLayar.setText(edtTextLayar.getText().toString().trim() + "6");
                break;
            case R.id.btn7:
                edtTextLayar.setText(edtTextLayar.getText().toString().trim() + "7");
                break;
            case R.id.btn8:
                edtTextLayar.setText(edtTextLayar.getText().toString().trim() + "8");
                break;
            case R.id.btn9:
                edtTextLayar.setText(edtTextLayar.getText().toString().trim() + "9");
                break;

            case R.id.btnPlus:

                if (edtTextLayar.getText().toString().trim().equals("")) {
                    Toast.makeText(this,"Tolong masukan dulu angkanya, tong!",Toast.LENGTH_SHORT).show();
                    return;
                }

                operasiSekarang = "tambah";
                nilaiSekarang = Double.parseDouble(edtTextLayar.getText().toString());
                edtTextLayar.setText("");
                break;
            case R.id.btnMinus:

                if (edtTextLayar.getText().toString().trim().equals("")) {
                    Toast.makeText(this,"Tolong masukan dulu angkanya, tong!",Toast.LENGTH_SHORT).show();
                    return;
                }

                operasiSekarang = "minus";
                nilaiSekarang = Double.parseDouble(edtTextLayar.getText().toString());
                edtTextLayar.setText("");
                break;
            case R.id.btnKali:

                if (edtTextLayar.getText().toString().trim().equals("")) {
                    Toast.makeText(this,"Tolong masukan dulu angkanya, tong!",Toast.LENGTH_SHORT).show();
                    return;
                }

                operasiSekarang = "kali";
                nilaiSekarang = Double.parseDouble(edtTextLayar.getText().toString());
                edtTextLayar.setText("");
                break;
            case R.id.btnBagi:

                if (edtTextLayar.getText().toString().trim().equals("")) {
                    Toast.makeText(this,"Tolong masukan dulu angkanya, tong!",Toast.LENGTH_SHORT).show();
                    return;
                }

                operasiSekarang = "bagi";
                nilaiSekarang = Double.parseDouble(edtTextLayar.getText().toString());
                edtTextLayar.setText("");
                break;

            case R.id.btnClear:
                nilaiSekarang = 0;
                edtTextLayar.setText("");
                break;

            case R.id.btnSamaDengan:
                if(operasiSekarang.equals("tambah")){
                    hasil = nilaiSekarang + Double.parseDouble(edtTextLayar.getText().toString());
                }
                if(operasiSekarang.equals("minus")){
                    hasil = nilaiSekarang - Double.parseDouble(edtTextLayar.getText().toString());
                }
                if(operasiSekarang.equals("kali")){
                    hasil = nilaiSekarang * Double.parseDouble(edtTextLayar.getText().toString());
                }
                if(operasiSekarang.equals("bagi")){
                    hasil = nilaiSekarang / Double.parseDouble(edtTextLayar.getText().toString());
                }


                //hasil = 2
                //nilaiTemp = 2.1
                int nilaiTemp = (int) hasil;

                //2.1 == 2 ? Tidak sama
                if (nilaiTemp == hasil) {
                    edtTextLayar.setText(String.valueOf((int)hasil));
                }else {
                    edtTextLayar.setText(String.valueOf(hasil));
                }
                break;

        }
    }
}

