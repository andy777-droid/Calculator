package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;


public class MainActivity extends AppCompatActivity {

    String process;
    boolean setBracket = false;
    boolean isEqual = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView answer = findViewById(R.id.answer);
        final TextView information = findViewById(R.id.information);

        final Button btnOne = findViewById(R.id.btnOne);
        final Button btnTwo = findViewById(R.id.btnTwo);
        final Button btnThree = findViewById(R.id.btnThree);
        final Button btnFour = findViewById(R.id.btnFour);
        final Button btnFive = findViewById(R.id.btnFive);
        final Button btnSix = findViewById(R.id.btnSix);
        final Button btnSeven = findViewById(R.id.btnSeven);
        final Button btnEight = findViewById(R.id.btnEight);
        final Button btnNine = findViewById(R.id.btnNine);
        final Button btnZero = findViewById(R.id.btnZero);

        final Button btnPlus = findViewById(R.id.btnPlus);
        final Button btnMinus = findViewById(R.id.btnMinus);
        final Button btnTimes = findViewById(R.id.btnTimes);
        final Button btnDivide = findViewById(R.id.btnDivide);
        final Button btnEqual = findViewById(R.id.btnEqual);
        final Button btnClear = findViewById(R.id.btnClear);
        final ImageButton btnBack = findViewById(R.id.btnBack);
        final Button btnPerc = findViewById(R.id.btnPerc);
        final Button btnBrackets = findViewById(R.id.btnBracket);
        final Button btnDot = findViewById(R.id.btnDot);


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                information.setText("");
                answer.setText("");
                setBracket = false;
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + "0");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + "1");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + "2");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + "3");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + "4");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + "5");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + "6");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + "7");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + "8");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + "9");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + "+");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + "-");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + "×");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + "÷");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnBrackets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (setBracket) {
                    process = information.getText().toString();
                    information.setText(process + ")");
                    setBracket = false;
                } else {
                    process = information.getText().toString();
                    information.setText(process + "(");
                    setBracket = true;
                }
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + ".");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String line = information.getText().toString();
                if (line.length() > 0) {
                    String newLine = line.substring(0, line.length() - 1);
                    information.setText(newLine);
                    char sym = line.charAt(line.length() - 1);
                    if (sym == ')') {
                        setBracket = true;
                    } else {
                        if (sym == '(') {
                            setBracket = false;
                        }
                    }
                } else {
                    information.setText("");
                    setBracket = false;
                }
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnPerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = information.getText().toString();
                information.setText(process + "%");
                if (isEqual) {
                    answer.setText("");
                    isEqual = false;
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText("");

                process = information.getText().toString();
                information.setText("");

                process = process.replaceAll("×", "*");
                process = process.replaceAll("÷", "/");
                process = process.replaceAll("%", "/100");
                String Ans = "";
                double finalAns = 0.0;

                try {
                    Context context = Context.enter();
                    context.setOptimizationLevel(-1);

                    Scriptable scriptable = context.initStandardObjects();
                    Ans = context.evaluateString(scriptable, process, "javascript", 1, null).toString();
                    finalAns = Double.parseDouble(Ans);
                } catch (Exception e) {
                    Ans = "Error";
                }
                if ((int) finalAns == finalAns) {
                    int num = (int) finalAns;
                    answer.setText("" + num);

                } else {
                    answer.setText("" + Ans);
                }
                setBracket = false;
                isEqual = true;

            }


        });

    }


}
