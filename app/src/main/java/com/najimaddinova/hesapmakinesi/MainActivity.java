package com.najimaddinova.hesapmakinesi;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends Activity {

    double input1=0,input2=0;
    private TextView txt_result;
    private Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9;
    private Button btn_minus,btn_plus,btn_division,btn_multiplication,btn_equal,btn_delete,btn_comma;
    private String zero="0",one="1",two = "2",three="3",four="4",five="5",six="6",seven="7",eight="8",nine="9";
    private String sub="-",plus="+",mul="x",div="/",equal="=",delete="del",comma=",",result;
    private boolean Addition, Subtract, Multiplication, Division,  decimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FindById();

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText((txt_result.getText()+"0"));
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "9");
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt_result.getText().length() != 0) {
                    input1 = Float.parseFloat(txt_result.getText() + "");
                    Addition = true;
                    decimal = false;
                    txt_result.setText(null);
                }
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt_result.getText().length() != 0) {
                    input1 = Float.parseFloat(txt_result.getText() + "");
                    Subtract = true;
                    decimal = false;
                    txt_result.setText(null);
                }
            }
        });

        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt_result.getText().length() != 0) {
                    input1 = Float.parseFloat(txt_result.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    txt_result.setText(null);
                }
            }
        });

        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt_result.getText().length() != 0) {
                    input1 = Float.parseFloat(txt_result.getText() + "");
                    Division = true;
                    decimal = false;
                    txt_result.setText(null);
                }
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division) {
                    input2 = Float.parseFloat(txt_result.getText() + "");
                }
                if (Addition) {
                    txt_result.setText(input1 + input2 + "");
                    Addition = false;
                }
                if (Subtract) {
                    txt_result.setText(input1 - input2 + "");
                    Subtract = false;
                }
                if (Multiplication) {
                    txt_result.setText(input1 * input2 + "");
                    Multiplication = false;
                }
                if (Division) {
                    txt_result.setText(input1 / input2 + "");
                    Division = false;
                }
            }
        });

        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

        btn_comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {
                    //do nothing or you can show the error
                } else {
                    txt_result.setText(txt_result.getText() + ".");
                    decimal = true;
                }
            }
        });
    }

    public void FindById(){
        btn_0 = findViewById(R.id.zero);
        btn_1 = findViewById(R.id.one);
        btn_2 = findViewById(R.id.two);
        btn_3 = findViewById(R.id.three);
        btn_4 = findViewById(R.id.four);
        btn_5 = findViewById(R.id.five);
        btn_6 = findViewById(R.id.six);
        btn_7 = findViewById(R.id.seven);
        btn_8 = findViewById(R.id.eight);
        btn_9 = findViewById(R.id.nine);
        btn_minus = findViewById(R.id.minus);
        btn_plus = findViewById(R.id.plus);
        btn_division = findViewById(R.id.division);
        btn_multiplication = findViewById(R.id.multiplication);
        btn_equal = findViewById(R.id.equal);
        btn_delete = findViewById(R.id.delete);
        btn_comma= findViewById(R.id.comma);
        txt_result = findViewById(R.id.calculation);
    }

}
