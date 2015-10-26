package hp.counter.com.dropin;

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

/**
 * Created by varun on 17-10-2015.
 */
public class QuizActivity extends Activity {

    TextView tv;
    Button btnNext;
    RadioGroup rg;
    RadioButton rb1,rb2,rb3,rb4;
    String Questions[]={    "1) Who invented the BALLPOINT PEN ? ",
            "2) Which scientist discovered the radioactive element radium ? ",
            "3) Who is the father of Geometry ? ",
            "4) Android is a which kind of software ",
            "5) Professor Amartya Sen is famous in which of the fields ? ",
            "6) Who wrote the famous book - We the people ? ",
            "7) Which of the following is NOT written by Munshi Premchand ? ",
            "8) The owner of Star TV is ",
            "9) The percentage of irrigated land in India is about ",
            "10) Which of the following crops is regarded as a plantation crop ? ",
            "11) The members of the panchayat are ",
            "12) The members of the Rajya Sabha are elected for a term of ",
            "13) The members of Parliament can express themselves in the House in ",
            "14) The members of the State Public Service Commission are appointed by the ",
            "15) The words 'Satyameva Jayate' inscribed below the base plate of the emblem of India are taken from",
            "16) Who composed the famous song Sare Jahan SeAchha ?",
            "17) Kathakali is a folk dance prevalent in which state ",
            "18) Wadia Institute of Himalayan Geology is located at ",
            "19) National Police Academy is located at ",
            "20) Which was the 1st non Test playing country to beat India in an international match?",
            "21) Which player has scored the most runs in a single Test innings ? ",
            "22) Who took Sourav Ganguly's wicket in his last Test innings ? ",
            "23) Subhash Chandra Bose was born on 23rd January 1897. Which city was was he born ? ",
            "24) Which of the following is not associated with the UNO ? ",
            "25) Who is the present vice chancellor of VTU Belagavi? "



    };


    String ans[]={
            "Biro Brothers","Marie Curie","Euclid","Operating System","Economics","Nani Palkhivala",
            "Guide","Rupert Murdoch","35 %","Coconut","the electorates of the respective territorial constituencies",
            "6 years","English, Hindi or mother tongue","governor","Manduk Upanishad","Mohammad Iqbal","Kerala","Dehradun",
            "Hyderabad","Sri Lanka","Brian Lara","Jason Krejza","Cuttack","ASEAN","Dr.H.Maheshappa"

    };

    String opt[]={
            "Biro Brothers","Waterman Brothers","Bicc Brothers","Write Brothers",
            "Isaac Newton","Albert Einstein","Benjamin Franklin","Marie Curie",
            "Aristotle","Euclid","Pythagoras","Kepler",
            "AntiVirus","Operating System","Application","None",
            "Biochemistry","Electronics","Economics","Geology",
            "Nani Palkhivala","Sachin Tendulkar","A Sarabhai","J.R.D. Tata",
            "Gaban","Godan","Manasorovar","Guide",
            "Star Rudolph","Rupert Murdoch","Rupert Star","Rupert Mars",
            "100 %","20 %","35 %","39 %",
            "Coconut","SugarCane","Cotton","Rice",
            "the electorates of the respective territorial constituencies","nominated by the district officer","nominated by the block development organization","NONE",
            "1 year","2 years","3 years","6 years",
            "English, Hindi or mother tongue","English only","Hindi only","Tamil only",
            "governor","Chief Minister","president","NONE",
            "Samaveda","Yajurveda","Rigveda","Manduk Upanishad",
            "Mohammad Iqbal","Iqbal Sheik","Tagore","MK Gandhi",
            "Kerala","Karnataka","Andhra","J&K",
            "Dehradun","Delhi","Kolkata","Mysuru",
            "Hyderabad","Delhi","Kolkata","Mysuru",
            "Sri Lanka","Zimbabwe","Africa","Australia",
            "Brian Lara","Sourav Ganguly","Gilchrist","Hayden",
            "Brett Lee","Jason Krejza","Gilchrist","Warne",
            "Cuttack","Calcutta","California","Mumbai",
            "ASEAN","UNICEF","WHO","UNESCO",
            "Dr.Kaliwalar","Dr.H.Maheshappa","Dr.Jagadish","Governor Wala"
    };

    int flag=0;
    public static int marks,correct,wrong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizlayout);

        tv=(TextView)findViewById(R.id.textView);
        btnNext =(Button) findViewById(R.id.button4);

        rg= (RadioGroup) findViewById(R.id.radioGroup1);

        rb1 =(RadioButton) findViewById(R.id.radioButton0);
        rb2 =(RadioButton) findViewById(R.id.radioButton1);
        rb3 =(RadioButton) findViewById(R.id.radioButton2);
        rb4 =(RadioButton) findViewById(R.id.radioButton3);


        tv.setText(Questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);


        Toast.makeText(this, "Hey All the best", Toast.LENGTH_LONG).show();

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
                    rb1.setText(opt[flag * 4]);
                    rb2.setText(opt[(flag * 4) + 1]);
                    rb3.setText(opt[(flag * 4) + 2]);
                    rb4.setText(opt[(flag * 4) + 3]);


                } else {
                    marks = correct;

                    Intent in = new Intent(getApplicationContext(), ResultActivity.class);
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


