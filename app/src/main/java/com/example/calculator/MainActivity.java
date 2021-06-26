package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;


public class MainActivity extends AppCompatActivity {

    Boolean dotst = true;
    float x1,y1,x2,y2;
    private boolean zee = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button bttn0 = findViewById(R.id.button0);
        final Button bttn1 = findViewById(R.id.button1);
        final Button bttn2 = findViewById(R.id.button2);
        final Button bttn3 = findViewById(R.id.button3);
        final Button bttn4 = findViewById(R.id.button4);
        final Button bttn5 = findViewById(R.id.button5);
        final Button bttn6 = findViewById(R.id.button6);
        final Button bttn7 = findViewById(R.id.button7);
        final Button bttn8 = findViewById(R.id.button8);
        final Button bttn9 = findViewById(R.id.button9);
        final Button bttnc = findViewById(R.id.buttonc);
        final Button bttnadd = findViewById(R.id.buttonplus);
        final Button bttnsub = findViewById(R.id.buttonminus);
        final Button bttnmul = findViewById(R.id.buttonmultiply);
        final Button bttndev = findViewById(R.id.buttondevide);
        final Button bttnequal = findViewById(R.id.buttonequal);
        final Button bttndot = findViewById(R.id.buttondot);
        final Button bttnback = findViewById(R.id.buttonback);
        final EditText display = findViewById(R.id.result);
        final TextView number1 = findViewById(R.id.num1);
        final TextView operand = findViewById(R.id.operand);
        final TextView toasts = findViewById(R.id.toast);
        final Button options = findViewById(R.id.option);
        final Button bttnpie = findViewById(R.id.buttonpie);
        final Button bttne = findViewById(R.id.buttone);









        options.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent opt = new Intent(MainActivity.this,option.class);
                startActivity(opt);
                finish();
            }
        });

















bttn1.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View v, MotionEvent event) {

        if(event.getAction()==MotionEvent.ACTION_UP)
        {

            bttn1.setBackgroundResource(R.drawable.btn_round);
        }
        else if(event.getAction()==MotionEvent.ACTION_DOWN)
        {
            bttn1.setBackgroundResource(R.drawable.btn_round2);

        }

        return false;
    }
});



        bttn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttn2.setBackgroundResource(R.drawable.btn_round);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttn2.setBackgroundResource(R.drawable.btn_round2);
                }

                return false;
            }
        });




        bttn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttn3.setBackgroundResource(R.drawable.btn_round);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttn3.setBackgroundResource(R.drawable.btn_round2);
                }

                return false;
            }
        });




        bttn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttn4.setBackgroundResource(R.drawable.btn_round);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttn4.setBackgroundResource(R.drawable.btn_round2);
                }

                return false;
            }
        });




        bttn5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttn5.setBackgroundResource(R.drawable.btn_round);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttn5.setBackgroundResource(R.drawable.btn_round2);
                }

                return false;
            }
        });




        bttn6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttn6.setBackgroundResource(R.drawable.btn_round);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttn6.setBackgroundResource(R.drawable.btn_round2);
                }

                return false;
            }
        });




        bttn7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttn7.setBackgroundResource(R.drawable.btn_round);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttn7.setBackgroundResource(R.drawable.btn_round2);
                }

                return false;
            }
        });




        bttn8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttn8.setBackgroundResource(R.drawable.btn_round);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttn8.setBackgroundResource(R.drawable.btn_round2);
                }

                return false;
            }
        });




        bttn9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttn9.setBackgroundResource(R.drawable.btn_round);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttn9.setBackgroundResource(R.drawable.btn_round2);
                }

                return false;
            }
        });




        bttn0.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttn0.setBackgroundResource(R.drawable.btn_round);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttn0.setBackgroundResource(R.drawable.btn_round2);
                }

                return false;
            }
        });




        bttndot.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttndot.setBackgroundResource(R.drawable.btn_round);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttndot.setBackgroundResource(R.drawable.btn_round2);
                }

                return false;
            }
        });




        bttnc.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttnc.setBackgroundResource(R.drawable.btn_round);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttnc.setBackgroundResource(R.drawable.btn_round2);
                }

                return false;
            }
        });




        bttnback.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttnback.setBackgroundResource(R.drawable.btn_round);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttnback.setBackgroundResource(R.drawable.btn_round2);
                }

                return false;
            }
        });




        bttnpie.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttnpie.setBackgroundResource(R.drawable.btn_round);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttnpie.setBackgroundResource(R.drawable.btn_round2);
                }

                return false;
            }
        });




        bttne.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttne.setBackgroundResource(R.drawable.btn_round);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttne.setBackgroundResource(R.drawable.btn_round2);
                }

                return false;
            }
        });




        bttnequal.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttnequal.setBackgroundResource(R.drawable.btn_round);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttnequal.setBackgroundResource(R.drawable.btn_round2);
                }

                return false;
            }
        });




        bttnadd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttnadd.setBackgroundResource(R.drawable.btn_roundcol);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttnadd.setBackgroundResource(R.drawable.btn_roundcol2);
                }

                return false;
            }
        });




        bttnsub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttnsub.setBackgroundResource(R.drawable.btn_roundcol);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttnsub.setBackgroundResource(R.drawable.btn_roundcol2);
                }

                return false;
            }
        });




        bttnmul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttnmul.setBackgroundResource(R.drawable.btn_roundcol);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttnmul.setBackgroundResource(R.drawable.btn_roundcol2);
                }

                return false;
            }
        });




        bttndev.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP)
                {

                    bttndev.setBackgroundResource(R.drawable.btn_roundcol);
                }
                else if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    bttndev.setBackgroundResource(R.drawable.btn_roundcol2);
                }

                return false;
            }
        });



































        bttn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 toasts.setText("");
                display.setText(display.getText()+"0");
            }
        });

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toasts.setText("");
                display.setText(display.getText()+"1");
            }
        });

        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toasts.setText("");
                display.setText(display.getText()+"2");
            }
        });


        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toasts.setText("");
                display.setText(display.getText()+"3");
            }
        });

        bttn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toasts.setText("");
                display.setText(display.getText()+"4");
            }
        });


        bttn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toasts.setText("");
                display.setText(display.getText()+"5");
            }
        });


        bttn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toasts.setText("");
                display.setText(display.getText()+"6");
            }
        });


        bttn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toasts.setText("");
                display.setText(display.getText()+"7");
            }
        });


        bttn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toasts.setText("");
                display.setText(display.getText()+"8");
            }
        });


        bttn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toasts.setText("");
                display.setText(display.getText()+"9");
            }
        });







            bttnadd.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {

                    toasts.setText("");

                   if(number1.getText().toString().trim().length()>0 && display.getText().toString().trim().length()>0)
                   {
                       double num11 = new Double(number1.getText().toString());
                       BigDecimal num1= BigDecimal.valueOf(num11);

                       double num22 = new Double(display.getText().toString());
                       BigDecimal num2= BigDecimal.valueOf(num22);




                       String opp = operand.getText().toString();

                       BigDecimal res = new BigDecimal(0);


                       switch (opp) {
                           case "+":
                               res = num1.add(num2,MathContext.UNLIMITED);
                               break;
                           case "-":
                               res = num1.subtract(num2,MathContext.UNLIMITED);
                               break;
                           case "×":
                               res = num1.multiply(num2,MathContext.UNLIMITED);
                               break;
                           case "÷":
                               res = num1.divide(num2,12, RoundingMode.HALF_UP);
                               break;

                       }



                       if(String.valueOf(res).endsWith(".00"))
                       {
                           int lnr = res.toString().length();
                           CharSequence resm= res.toString().subSequence(0,lnr-3);
                           if (resm.toString().contains("E+"))
                           {
                               int ind_orn = resm.toString().indexOf("E");
                               CharSequence orignum = resm.subSequence(0,ind_orn-1);
                               int ln =resm.length();
                               int ind_pow = resm.toString().indexOf("+");
                               CharSequence powc= resm.subSequence(ind_pow+1,ln);
                               int pow = Integer.parseInt(powc.toString());

                               int orpow= 1;

                               for (int i =0;i<pow;i++)
                               {
                                   orpow = orpow*10;
                               }

                               BigDecimal orp =new BigDecimal(orpow);

                               BigDecimal orig = (BigDecimal) orignum;

                               number1.setText(orig.multiply(orp).toString());

                           }
                           else
                           {
                               number1.setText(String.valueOf(resm));
                           }
                       }
                       else if(String.valueOf(res).endsWith(".0"))
                       {
                           int lnr = res.toString().length();
                           CharSequence resm= res.toString().subSequence(0,lnr-2);
                           if (resm.toString().contains("E+"))
                           {
                               int ind_orn = resm.toString().indexOf("E");
                               CharSequence orignum = resm.subSequence(0,ind_orn-1);
                               int ln =resm.length();
                               int ind_pow = resm.toString().indexOf("+");
                               CharSequence powc= resm.subSequence(ind_pow+1,ln);
                               int pow = Integer.parseInt(powc.toString());

                               int orpow= 1;

                               for (int i =0;i<pow;i++)
                               {
                                   orpow = orpow*10;
                               }

                               BigDecimal orp =new BigDecimal(orpow);

                               BigDecimal orig = (BigDecimal) orignum;

                               number1.setText(orig.multiply(orp).toString());

                           }
                           else
                           {
                               number1.setText(String.valueOf(resm));
                           }
                       }
                       else if (!String.valueOf(res).contains("."))
                       {
                           if (res.toString().contains("E+"))
                           {
                               int ind_orn = res.toString().indexOf("E");
                               CharSequence orignum = res.toString().subSequence(0,ind_orn-1);
                               int ln =res.toString().length();
                               int ind_pow = res.toString().indexOf("+");
                               CharSequence powc= res.toString().subSequence(ind_pow+1,ln);
                               int pow = Integer.parseInt(powc.toString());

                               int orpow= 1;

                               for (int i =0;i<pow;i++)
                               {
                                   orpow = orpow*10;
                               }

                               BigDecimal orp =new BigDecimal(orpow);

                               BigDecimal orig = (BigDecimal) orignum;

                               number1.setText(orig.multiply(orp).toString());

                           }
                           else
                           {
                               number1.setText(String.valueOf(res));
                           }
                       }

                       else if(String.valueOf(res).endsWith(".000000000000"))
                       {
                           int lnr = res.toString().length();
                           CharSequence resm= res.toString().subSequence(0,lnr-13);
                           if (resm.toString().contains("E+"))
                           {
                               int ind_orn = resm.toString().indexOf("E");
                               CharSequence orignum = resm.subSequence(0,ind_orn-1);
                               int ln =resm.length();
                               int ind_pow = resm.toString().indexOf("+");
                               CharSequence powc= resm.subSequence(ind_pow+1,ln);
                               int pow = Integer.parseInt(powc.toString());

                               int orpow= 1;

                               for (int i =0;i<pow;i++)
                               {
                                   orpow = orpow*10;
                               }

                               BigDecimal orp =new BigDecimal(orpow);

                               BigDecimal orig = (BigDecimal) orignum;

                               number1.setText(orig.multiply(orp).toString());

                           }
                           else
                           {
                               number1.setText(String.valueOf(resm));
                           }
                       }

                       else if(zee)
                       {
                           CharSequence resm=res.stripTrailingZeros().toString();
                           if (resm.toString().contains("E+"))
                           {
                               int ind_orn = resm.toString().indexOf("E");
                               CharSequence orignum = resm.subSequence(0,ind_orn-1);
                               int ln =resm.length();
                               int ind_pow = resm.toString().indexOf("+");
                               CharSequence powc= resm.subSequence(ind_pow+1,ln);
                               int pow = Integer.parseInt(powc.toString());

                               int orpow= 1;

                               for (int i =0;i<pow;i++)
                               {
                                   orpow = orpow*10;
                               }

                               BigDecimal orp =new BigDecimal(orpow);

                               BigDecimal orig = (BigDecimal) orignum;

                               number1.setText(orig.multiply(orp).toString());

                           }
                           else
                           {
                               number1.setText(String.valueOf(resm));
                           }
                       }
                       else
                       {
                           if (res.toString().contains("E+"))
                           {
                               int ind_orn = res.toString().indexOf("E");
                               CharSequence orignum = res.toString().subSequence(0,ind_orn-1);
                               int ln =res.toString().length();
                               int ind_pow = res.toString().indexOf("+");
                               CharSequence powc= res.toString().subSequence(ind_pow+1,ln);
                               int pow = Integer.parseInt(powc.toString());

                               int orpow= 1;

                               for (int i =0;i<pow;i++)
                               {
                                   orpow = orpow*10;
                               }

                               BigDecimal orp =new BigDecimal(orpow);

                               BigDecimal orig = (BigDecimal) orignum;

                               number1.setText(orig.multiply(orp).toString());

                           }
                           else
                           {
                               number1.setText(String.valueOf(res));
                           }
                       }










                   }



                       if(operand.getText().toString().trim().length()<=0)
                       {
                           number1.setText(display.getText());
                       }
                       operand.setText("+");
                       display.setText("");
                       dotst = true;



                }
            });


            bttnsub.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {

                    toasts.setText("");


                    if(number1.getText().toString().trim().length()>0 && display.getText().toString().trim().length()>0)
                    {
                        double num11 = new Double(number1.getText().toString());
                        BigDecimal num1= BigDecimal.valueOf(num11);

                        double num22 = new Double(display.getText().toString());
                        BigDecimal num2= BigDecimal.valueOf(num22);




                        String opp = operand.getText().toString();

                        BigDecimal res = new BigDecimal(0);


                        switch (opp) {
                            case "+":
                                res = num1.add(num2,MathContext.UNLIMITED);
                                break;
                            case "-":
                                res = num1.subtract(num2,MathContext.UNLIMITED);
                                break;
                            case "×":
                                res = num1.multiply(num2,MathContext.UNLIMITED);
                                break;
                            case "÷":
                                res = num1.divide(num2,12, RoundingMode.HALF_UP);
                                break;

                        }



                        if(String.valueOf(res).endsWith(".00"))
                        {
                            int lnr = res.toString().length();
                            CharSequence resm= res.toString().subSequence(0,lnr-3);
                            if (resm.toString().contains("E+"))
                            {
                                int ind_orn = resm.toString().indexOf("E");
                                CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                int ln =resm.length();
                                int ind_pow = resm.toString().indexOf("+");
                                CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(resm));
                            }
                        }
                        else if(String.valueOf(res).endsWith(".0"))
                        {
                            int lnr = res.toString().length();
                            CharSequence resm= res.toString().subSequence(0,lnr-2);
                            if (resm.toString().contains("E+"))
                            {
                                int ind_orn = resm.toString().indexOf("E");
                                CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                int ln =resm.length();
                                int ind_pow = resm.toString().indexOf("+");
                                CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(resm));
                            }
                        }
                        else if (!String.valueOf(res).contains("."))
                        {
                            if (res.toString().contains("E+"))
                            {
                                int ind_orn = res.toString().indexOf("E");
                                CharSequence orignum = res.toString().subSequence(0,ind_orn-1);
                                int ln =res.toString().length();
                                int ind_pow = res.toString().indexOf("+");
                                CharSequence powc= res.toString().subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(res));
                            }
                        }

                        else if(String.valueOf(res).endsWith(".000000000000"))
                        {
                            int lnr = res.toString().length();
                            CharSequence resm= res.toString().subSequence(0,lnr-13);
                            if (resm.toString().contains("E+"))
                            {
                                int ind_orn = resm.toString().indexOf("E");
                                CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                int ln =resm.length();
                                int ind_pow = resm.toString().indexOf("+");
                                CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(resm));
                            }
                        }

                        else if(zee)
                        {
                            CharSequence resm=res.stripTrailingZeros().toString();
                            if (resm.toString().contains("E+"))
                            {
                                int ind_orn = resm.toString().indexOf("E");
                                CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                int ln =resm.length();
                                int ind_pow = resm.toString().indexOf("+");
                                CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(resm));
                            }
                        }
                        else
                        {
                            if (res.toString().contains("E+"))
                            {
                                int ind_orn = res.toString().indexOf("E");
                                CharSequence orignum = res.toString().subSequence(0,ind_orn-1);
                                int ln =res.toString().length();
                                int ind_pow = res.toString().indexOf("+");
                                CharSequence powc= res.toString().subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(res));
                            }
                        }


                    }


                    if(operand.getText().toString().trim().length()<=0)
                    {
                        number1.setText(display.getText());
                    }
                    operand.setText("-");
                    display.setText("");
                    dotst = true;

                }
            });

            bttnmul.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {

                    toasts.setText("");



                    if(number1.getText().toString().trim().length()>0 && display.getText().toString().trim().length()>0)
                    {
                        double num11 = new Double(number1.getText().toString());
                        BigDecimal num1= BigDecimal.valueOf(num11);

                        double num22 = new Double(display.getText().toString());
                        BigDecimal num2= BigDecimal.valueOf(num22);




                        String opp = operand.getText().toString();

                        BigDecimal res = new BigDecimal(0);


                        switch (opp) {
                            case "+":
                                res = num1.add(num2,MathContext.UNLIMITED);
                                break;
                            case "-":
                                res = num1.subtract(num2,MathContext.UNLIMITED);
                                break;
                            case "×":
                                res = num1.multiply(num2,MathContext.UNLIMITED);
                                break;
                            case "÷":
                                res = num1.divide(num2,12, RoundingMode.HALF_UP);
                                break;

                        }



                        if(String.valueOf(res).endsWith(".00"))
                        {
                            int lnr = res.toString().length();
                            CharSequence resm= res.toString().subSequence(0,lnr-3);
                            if (resm.toString().contains("E+"))
                            {
                                int ind_orn = resm.toString().indexOf("E");
                                CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                int ln =resm.length();
                                int ind_pow = resm.toString().indexOf("+");
                                CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(resm));
                            }
                        }
                        else if(String.valueOf(res).endsWith(".0"))
                        {
                            int lnr = res.toString().length();
                            CharSequence resm= res.toString().subSequence(0,lnr-2);
                            if (resm.toString().contains("E+"))
                            {
                                int ind_orn = resm.toString().indexOf("E");
                                CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                int ln =resm.length();
                                int ind_pow = resm.toString().indexOf("+");
                                CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(resm));
                            }
                        }
                        else if (!String.valueOf(res).contains("."))
                        {
                            if (res.toString().contains("E+"))
                            {
                                int ind_orn = res.toString().indexOf("E");
                                CharSequence orignum = res.toString().subSequence(0,ind_orn-1);
                                int ln =res.toString().length();
                                int ind_pow = res.toString().indexOf("+");
                                CharSequence powc= res.toString().subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(res));
                            }
                        }

                        else if(String.valueOf(res).endsWith(".000000000000"))
                        {
                            int lnr = res.toString().length();
                            CharSequence resm= res.toString().subSequence(0,lnr-13);
                            if (resm.toString().contains("E+"))
                            {
                                int ind_orn = resm.toString().indexOf("E");
                                CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                int ln =resm.length();
                                int ind_pow = resm.toString().indexOf("+");
                                CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(resm));
                            }
                        }

                        else if(zee)
                        {
                            CharSequence resm=res.stripTrailingZeros().toString();
                            if (resm.toString().contains("E+"))
                            {
                                int ind_orn = resm.toString().indexOf("E");
                                CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                int ln =resm.length();
                                int ind_pow = resm.toString().indexOf("+");
                                CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(resm));
                            }
                        }
                        else
                        {
                            if (res.toString().contains("E+"))
                            {
                                int ind_orn = res.toString().indexOf("E");
                                CharSequence orignum = res.toString().subSequence(0,ind_orn-1);
                                int ln =res.toString().length();
                                int ind_pow = res.toString().indexOf("+");
                                CharSequence powc= res.toString().subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(res));
                            }
                        }


                    }



                    if(operand.getText().toString().trim().length()<=0)
                    {
                        number1.setText(display.getText());
                    }
                    operand.setText("×");
                    display.setText("");
                    dotst = true;
                }
            });

            bttndev.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {

                    toasts.setText("");


                    if(number1.getText().toString().trim().length()>0 && display.getText().toString().trim().length()>0)
                    {
                        double num11 = new Double(number1.getText().toString());
                        BigDecimal num1= BigDecimal.valueOf(num11);

                        double num22 = new Double(display.getText().toString());
                        BigDecimal num2= BigDecimal.valueOf(num22);




                        String opp = operand.getText().toString();

                        BigDecimal res = new BigDecimal(0);


                        switch (opp) {
                            case "+":
                                res = num1.add(num2,MathContext.UNLIMITED);
                                break;
                            case "-":
                                res = num1.subtract(num2,MathContext.UNLIMITED);
                                break;
                            case "×":
                                res = num1.multiply(num2,MathContext.UNLIMITED);
                                break;
                            case "÷":
                                res = num1.divide(num2,12, RoundingMode.HALF_UP);
                                break;

                        }



                        if(String.valueOf(res).endsWith(".00"))
                        {
                            int lnr = res.toString().length();
                            CharSequence resm= res.toString().subSequence(0,lnr-3);
                            if (resm.toString().contains("E+"))
                            {
                                int ind_orn = resm.toString().indexOf("E");
                                CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                int ln =resm.length();
                                int ind_pow = resm.toString().indexOf("+");
                                CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(resm));
                            }
                        }
                        else if(String.valueOf(res).endsWith(".0"))
                        {
                            int lnr = res.toString().length();
                            CharSequence resm= res.toString().subSequence(0,lnr-2);
                            if (resm.toString().contains("E+"))
                            {
                                int ind_orn = resm.toString().indexOf("E");
                                CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                int ln =resm.length();
                                int ind_pow = resm.toString().indexOf("+");
                                CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(resm));
                            }
                        }
                        else if (!String.valueOf(res).contains("."))
                        {
                            if (res.toString().contains("E+"))
                            {
                                int ind_orn = res.toString().indexOf("E");
                                CharSequence orignum = res.toString().subSequence(0,ind_orn-1);
                                int ln =res.toString().length();
                                int ind_pow = res.toString().indexOf("+");
                                CharSequence powc= res.toString().subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(res));
                            }
                        }

                        else if(String.valueOf(res).endsWith(".000000000000"))
                        {
                            int lnr = res.toString().length();
                            CharSequence resm= res.toString().subSequence(0,lnr-13);
                            if (resm.toString().contains("E+"))
                            {
                                int ind_orn = resm.toString().indexOf("E");
                                CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                int ln =resm.length();
                                int ind_pow = resm.toString().indexOf("+");
                                CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(resm));
                            }
                        }

                        else if(zee)
                        {
                            CharSequence resm=res.stripTrailingZeros().toString();
                            if (resm.toString().contains("E+"))
                            {
                                int ind_orn = resm.toString().indexOf("E");
                                CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                int ln =resm.length();
                                int ind_pow = resm.toString().indexOf("+");
                                CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(resm));
                            }
                        }
                        else
                        {
                            if (res.toString().contains("E+"))
                            {
                                int ind_orn = res.toString().indexOf("E");
                                CharSequence orignum = res.toEngineeringString().subSequence(0,ind_orn-1);
                                int ln =res.toString().length();
                                int ind_pow = res.toString().indexOf("+");
                                CharSequence powc= res.toString().subSequence(ind_pow+1,ln);
                                int pow = Integer.parseInt(powc.toString());

                                int orpow= 1;

                                for (int i =0;i<pow;i++)
                                {
                                    orpow = orpow*10;
                                }

                                BigDecimal orp =new BigDecimal(orpow);

                                BigDecimal orig = (BigDecimal) orignum;

                                number1.setText(orig.multiply(orp).toString());

                            }
                            else
                            {
                                number1.setText(String.valueOf(res));
                            }
                        }


                    }



                    if(operand.getText().toString().trim().length()<=0)
                    {
                        number1.setText(display.getText());
                    }
                    operand.setText("÷");
                    display.setText("");
                    dotst = true;
                }
            });


















        bttndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toasts.setText("");
             if(dotst)
             {
                 if(display.getText().toString().equals(""))
                 {
                     display.setText(display.getText()+"0.");
                     dotst = false;
                 }
                 else
                 {
                     display.setText(display.getText()+".");
                     dotst = false;
                 }
             }


            }
        });

        bttnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toasts.setText("");
                int length = display.getText().length();
                if(length>0)
                {
                    if(display.getText().toString().endsWith("."))
                    {
                        dotst=true;
                    }
                    display.getText().delete(length-1,length);

                }



            }
        });




        bttnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
                operand.setText("");
                number1.setText("");
                toasts.setText("");
                dotst=true;

            }
        });




        bttnpie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toasts.setText("");
                if(display.getText().toString().trim().length()<=0)
                {
                    display.setText(display.getText()+"3.14159265");
                    dotst=false;
                }
                else
                {
                    toasts.setText("Not Allowed Here");
                }
            }
        });


        bttne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toasts.setText("");
                if(display.getText().toString().trim().length()<=0)
                {
                    display.setText(display.getText()+"2.71828183");
                    dotst=false;
                }
                else
                {
                    toasts.setText("Not Allowed Here");
                }
            }
        });





          bttnequal.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  toasts.setText("");



                  try {
                      if((number1.getText().toString().trim().length()<=0)  &&  (display.getText().toString().trim().length()!=0)  && operand.getText().toString().trim().length()!=0)
                      {
                          number1.setText("");
                          operand.setText("");
                          toasts.setText("Please insert first number");
                      }

                      else if((display.getText().toString().trim().length()<=0) && (number1.getText().toString().trim().length()!=0)  && (operand.getText().toString().trim().length()!=0))
                      {

                          toasts.setText("Please insert second number");
                      }

                      else if((operand.getText().toString().trim().length()<=0)  && (number1.getText().toString().trim().length()!=0)  &&  (display.getText().toString().trim().length()!=0))
                      {
                          number1.setText("");
                          operand.setText("");
                          toasts.setText("please insert operand");
                      }




                      else if((display.getText().toString().trim().length()<=0) && (operand.getText().toString().trim().length()<=0)  && (number1.getText().toString().trim().length()!=0))
                      {
                          number1.setText("");
                          operand.setText("");
                          toasts.setText("Please insert first number and Operand");
                      }
                      else if((number1.getText().toString().trim().length()<=0) && (display.getText().toString().trim().length()<=0)  && (operand.getText().toString().trim().length()!=0))
                      {
                          number1.setText("");
                          operand.setText("");
                          toasts.setText("Please insert first number and second number");
                      }
                      else if ((number1.getText().toString().trim().length()<=0) && (operand.getText().toString().trim().length()<=0)  && (display.getText().toString().trim().length()!=0))
                      {
                          number1.setText("");
                          operand.setText("");
                          toasts.setText("Please insert operand and second number");
                      }





                      else if((number1.getText().toString().trim().length()<=0) && (display.getText().toString().trim().length()<=0) && (operand.getText().toString().trim().length()<=0))
                      {
                          number1.setText("");
                          operand.setText("");
                          toasts.setText("Please insert information above");
                      }


                      else
                       {
                           double num11 = new Double(number1.getText().toString());
                           BigDecimal num1= BigDecimal.valueOf(num11);

                           double num22 = new Double(display.getText().toString());
                           BigDecimal num2= BigDecimal.valueOf(num22);




                          String opp = operand.getText().toString();

                          BigDecimal res = new BigDecimal(0);


                          switch (opp) {
                              case "+":
                                  res = num1.add(num2, MathContext.UNLIMITED);
                                  break;
                              case "-":
                                  res = num1.subtract(num2, MathContext.UNLIMITED);
                                  break;
                              case "×":
                                  res = num1.multiply(num2, MathContext.UNLIMITED);
                                  break;
                              case "÷":
                                  res = num1.divide(num2, 12, RoundingMode.HALF_UP);
                                  break;


                          }



                               if(String.valueOf(res).endsWith(".00"))
                               {
                                   int lnr = res.toString().length();
                                   CharSequence resm= res.toString().subSequence(0,lnr-3);
                                   if (resm.toString().contains("E+"))
                                   {
                                       int ind_orn = resm.toString().indexOf("E");
                                       CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                       int ln =resm.length();
                                       int ind_pow = resm.toString().indexOf("+");
                                       CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                       int pow = Integer.parseInt(powc.toString());

                                       int orpow= 1;

                                       for (int i =0;i<pow;i++)
                                       {
                                           orpow = orpow*10;
                                       }

                                       BigDecimal orp =new BigDecimal(orpow);

                                       BigDecimal orig = (BigDecimal) orignum;

                                       display.setText(orig.multiply(orp).toString());

                                   }
                                   else
                                   {
                                       display.setText(String.valueOf(resm));
                                   }
                               }
                               else if(String.valueOf(res).endsWith(".0"))
                               {
                                   int lnr = res.toString().length();
                                   CharSequence resm= res.toString().subSequence(0,lnr-2);
                                   if (resm.toString().contains("E+"))
                                   {
                                       int ind_orn = resm.toString().indexOf("E");
                                       CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                       int ln =resm.length();
                                       int ind_pow = resm.toString().indexOf("+");
                                       CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                       int pow = Integer.parseInt(powc.toString());

                                       int orpow= 1;

                                       for (int i =0;i<pow;i++)
                                       {
                                           orpow = orpow*10;
                                       }

                                       BigDecimal orp =new BigDecimal(orpow);

                                       BigDecimal orig = (BigDecimal) orignum;

                                       display.setText(orig.multiply(orp).toString());

                                   }
                                   else
                                   {
                                       display.setText(String.valueOf(resm));
                                   }
                               }
                               else if (!String.valueOf(res).contains("."))
                               {
                                   if (res.toString().contains("E+"))
                                   {
                                       int ind_orn = res.toString().indexOf("E");
                                       CharSequence orignum = res.toString().subSequence(0,ind_orn-1);
                                       int ln =res.toString().length();
                                       int ind_pow = res.toString().indexOf("+");
                                       CharSequence powc= res.toString().subSequence(ind_pow+1,ln);
                                       int pow = Integer.parseInt(powc.toString());

                                       int orpow= 1;

                                       for (int i =0;i<pow;i++)
                                       {
                                           orpow = orpow*10;
                                       }

                                       BigDecimal orp =new BigDecimal(orpow);

                                       BigDecimal orig = (BigDecimal) orignum;

                                       display.setText(orig.multiply(orp).toString());

                                   }
                                   else
                                   {
                                       display.setText(String.valueOf(res));
                                   }
                               }
                               else if(String.valueOf(res).endsWith(".000000000000"))
                               {
                                   int lnr = res.toString().length();
                                   CharSequence resm= res.toString().subSequence(0,lnr-13);
                                   if (resm.toString().contains("E+"))
                                   {
                                       int ind_orn = resm.toString().indexOf("E");
                                       CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                       int ln =resm.length();
                                       int ind_pow = resm.toString().indexOf("+");
                                       CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                       int pow = Integer.parseInt(powc.toString());

                                       int orpow= 1;

                                       for (int i =0;i<pow;i++)
                                       {
                                           orpow = orpow*10;
                                       }

                                       BigDecimal orp =new BigDecimal(orpow);

                                       BigDecimal orig = (BigDecimal) orignum;

                                       display.setText(orig.multiply(orp).toString());

                                   }
                                   else
                                   {
                                       display.setText(String.valueOf(resm));
                                   }


                               }

                               else if(zee)
                               {
                                   CharSequence resm=res.stripTrailingZeros().toString();

                                   if (resm.toString().contains("E+"))
                                   {
                                       int ind_orn = resm.toString().indexOf("E");
                                       CharSequence orignum = resm.subSequence(0,ind_orn-1);
                                        int ln =resm.length();
                                       int ind_pow = resm.toString().indexOf("+");
                                       CharSequence powc= resm.subSequence(ind_pow+1,ln);
                                        int pow = Integer.parseInt(powc.toString());

                                       int orpow= 1;

                                       for (int i =0;i<pow;i++)
                                       {
                                           orpow = orpow*10;
                                       }

                                       BigDecimal orp =new BigDecimal(orpow);

                                       BigDecimal orig = (BigDecimal) orignum;

                                       display.setText(orig.multiply(orp).toString());

                                   }
                                   else
                                   {
                                       display.setText(String.valueOf(resm));
                                   }



                               }
                               else
                               {
                                   display.setText(String.valueOf(res));
                               }



















                          number1.setText("");
                          operand.setText("");
                          if(display.getText().toString().contains("."))
                          {
                              dotst=false;
                          }
                          else
                          {
                              dotst=true;
                          }



                      }





                  } catch (NumberFormatException e) {
                      e.printStackTrace();
                      number1.setText("");
                      operand.setText("");
                      display.setText("ERROR");
                  }
                  catch (ArithmeticException ae){
                      ae.printStackTrace();
                      number1.setText("");
                      operand.setText("");
                      display.setText("Can't Divide By Zero");
                  }



              }
          });





          number1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  if(number1.getText()!=null)
                  {
                      display.setText(number1.getText());
                      number1.setText("");
                      operand.setText("");
                  }
                  else
                  {
                       operand.setText("");
                  }

              }
          });




    }




    public boolean onTouchEvent(MotionEvent touchEvent)
    {
        switch (touchEvent.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                x1=touchEvent.getX();
                y1=touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2=touchEvent.getX();
                y2=touchEvent.getY();

                if((x1>x2)&&(y2-y1<400d)&&(y2-y1>-400d))
                {
                    Intent strtopt = new Intent(MainActivity.this,option.class);
                    startActivity(strtopt);

                }
                break;


        }
        return false;
    }



}