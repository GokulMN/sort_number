package com.example.gokulmn.gokulmnomnifyhire;
import java.util.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button RandomButton;
        RandomButton = (Button) findViewById(R.id.button);

        final int[] Rnumber = new int[10];
        final int[] values = new int[10];


        final Random randomgenerator = new Random();

        final EditText txtValue0 = (EditText) findViewById(R.id.editText0);
        final EditText txtValue1 = (EditText) findViewById(R.id.editText1);
        final EditText txtValue2 = (EditText) findViewById(R.id.editText2);
        final EditText txtValue3 = (EditText) findViewById(R.id.editText3);
        final EditText txtValue4 = (EditText) findViewById(R.id.editText4);
        final EditText txtValue5 = (EditText) findViewById(R.id.editText5);
        final EditText txtValue6 = (EditText) findViewById(R.id.editText6);
        final EditText txtValue7 = (EditText) findViewById(R.id.editText7);
        final EditText txtValue8 = (EditText) findViewById(R.id.editText8);
        final EditText txtValue9 = (EditText) findViewById(R.id.editText9);


        final EditText txtValue19 = (EditText) findViewById(R.id.editText19);
        final EditText txtValue20 = (EditText) findViewById(R.id.editText20);
        final EditText txtValue22 = (EditText) findViewById(R.id.editText22);
        final EditText txtValue23 = (EditText) findViewById(R.id.editText23);
        final EditText txtValue24 = (EditText) findViewById(R.id.editText24);
        final EditText txtValue25 = (EditText) findViewById(R.id.editText25);
        final EditText txtValue26 = (EditText) findViewById(R.id.editText26);
        final EditText txtValue27 = (EditText) findViewById(R.id.editText27);
        final EditText txtValue28 = (EditText) findViewById(R.id.editText28);
        final EditText txtValue21 = (EditText) findViewById(R.id.editText21);

        final EditText txtValue30 = (EditText) findViewById(R.id.editText30);
        final EditText txtValue31 = (EditText) findViewById(R.id.editText31);
        final EditText txtValue32 = (EditText) findViewById(R.id.editText32);
        final EditText txtValue33 = (EditText) findViewById(R.id.editText33);
        final EditText txtValue34 = (EditText) findViewById(R.id.editText34);
        final EditText txtValue35 = (EditText) findViewById(R.id.editText35);
        final EditText txtValue36 = (EditText) findViewById(R.id.editText36);
        final EditText txtValue37 = (EditText) findViewById(R.id.editText37);
        final EditText txtValue38 = (EditText) findViewById(R.id.editText38);
        final EditText txtValue39 = (EditText) findViewById(R.id.editText39);



        RandomButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                for (int i = 0; i < 10; i++) {

                    Rnumber[i] = randomgenerator.nextInt(90) + 10;
                    values[i] = Rnumber[i];
                    txtValue0.setText("" + values[0]);
                    txtValue1.setText("" + values[1]);
                    txtValue2.setText("" + values[2]);
                    txtValue3.setText("" + values[3]);
                    txtValue4.setText("" + values[4]);
                    txtValue5.setText("" + values[5]);
                    txtValue6.setText("" + values[6]);
                    txtValue7.setText("" + values[7]);
                    txtValue8.setText("" + values[8]);
                    txtValue9.setText("" + values[9]);


                    Button SORT;

                    SORT = (Button) findViewById(R.id.button2);

                    SORT.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            for(int m =0;m<10;m++ )
                            {

                                for(int n=0;n<10;n++) {

                                       if(values[m]>values[n])
                                       {
                                           int temp;

                                           temp=values[m];
                                           values[m]=values[n];
                                           values[n]=temp;

                                       }
                                }
                            }


                            txtValue19.setText("" + values[0]);
                            txtValue20.setText("" + values[1]);
                            txtValue21.setText("" + values[2]);
                            txtValue22.setText("" + values[3]);
                            txtValue23.setText("" + values[4]);
                            txtValue24.setText("" + values[5]);
                            txtValue25.setText("" + values[6]);
                            txtValue26.setText("" + values[7]);
                            txtValue27.setText("" + values[8]);
                            txtValue28.setText("" + values[9]);


                            Button dec;
                            dec =(Button)findViewById(R.id.button3);

                            dec.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {

                                    for(int m =0;m<10;m++ )
                                    {

                                        for(int n=0;n<10;n++) {

                                            if(values[m]<values[n])
                                            {
                                                int temp;

                                                temp=values[m];
                                                values[m]=values[n];
                                                values[n]=temp;

                                            }
                                        }
                                    }


                                    txtValue30.setText("" + values[0]);
                                    txtValue31.setText("" + values[1]);
                                    txtValue32.setText("" + values[2]);
                                    txtValue33.setText("" + values[3]);
                                    txtValue34.setText("" + values[4]);
                                    txtValue35.setText("" + values[5]);
                                    txtValue36.setText("" + values[6]);
                                    txtValue37.setText("" + values[7]);
                                    txtValue38.setText("" + values[8]);
                                    txtValue39.setText("" + values[9]);

                                }
                            });

                        }
                    });

                }
            }
        });
                      }
                  }




