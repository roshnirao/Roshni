package hp.counter.com.dropin;

import android.app.Activity;

/**
 * Created by varun on 17-10-2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class CActivity extends Activity
{
    TextView tv;
    Button btnNext;
    RadioGroup rg;
    RadioButton rb1,rb2;
    String Questions[]={    "1) Hockey is national game of India ",
            "2) Taj Mahal is in Mysore  ",
            "3) Bengaluru is capital of India  ",
            "4) Davangere is a district of Karnataka ",
            "5) Sun sets in east and rises in west   ",
            "6) Our present PM is H.D.Devegowda ",
            "7) Our present CM is H.D.Revanna",
            "8) VTU stands for Visvesvaraya Technological University",
            "9) Chess requires bat and ball to play",
            "10) Sourav ganguly is called Tiger of Bengal ",
            "11) Android is an Operating system ",
            "12) Kitkat is not a version of Android",
            "13) Reflection and refraction of light are same in all medium",
            "14) Person who plays tennis is called cricketer",
            "15) Vishwanathan Anand is a chess player from Newyork"




    };


    String ans[]={"True","False","False","True","False","False","False","True","False","True","True","False","False","False","False"


    };

    String opt[]={
            "True","False","True","False","True","False","True","False","True","False","True","False",
            "True","False","True","False","True","False","True","False","True","False","True","False","True",
            "False","True","False","True","False"

    };

    int flag=0;
    public static int marks,correct,wrong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mlayout);

        tv=(TextView)findViewById(R.id.textView);
        btnNext =(Button) findViewById(R.id.button4);

        rg= (RadioGroup) findViewById(R.id.radioGroup1);

        rb1 =(RadioButton) findViewById(R.id.radioButton0);
        rb2 =(RadioButton) findViewById(R.id.radioButton1);



        tv.setText(Questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);



        Toast.makeText(this,"Hey All the best",Toast.LENGTH_LONG).show();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                RadioButton uans = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();

                if (ansText.equalsIgnoreCase(ans[flag])) {
                    correct++;
                } else {
                    wrong++;
                }
                flag++;

                if (flag < Questions.length) {
                    tv.setText(Questions[flag]);
                    rb1.setText(opt[flag * 2]);
                    rb2.setText(opt[(flag * 2) + 1]);



                } else {
                    marks = correct;

                    Intent in = new Intent(getApplicationContext(), ResultfActivity.class);
                    startActivity(in);
                }


            }


        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main,menu);//menu.quiz
        return true;
    }
}

