package hp.counter.com.dropin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by varun on 17-10-2015.
 */
public class ResultActivity extends Activity
{
    TextView tw;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tw= (TextView) findViewById(R.id.textView2);
        but=(Button)findViewById(R.id.button2);

        StringBuffer sb = new StringBuffer();
        sb.append("Thanks for taking Quiz\n\n");
        sb.append("\nCorrect Answers : "+QuizActivity.correct);
        sb.append("\n\nWrong Answers : "+QuizActivity.wrong);
        sb.append("\n\nFinal Score : "+QuizActivity.marks);
        tw.setText(sb);

        QuizActivity.correct=0;
        QuizActivity.wrong=0;
        QuizActivity.marks=0;

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intt = new Intent(getApplicationContext(),QandA.class);
                startActivity(intt);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
}
