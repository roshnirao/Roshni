package hp.counter.com.dropin;

/**
 * Created by varun on 17-10-2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ResultfActivity extends Activity
{
    TextView tw;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reslayout);
        tw= (TextView) findViewById(R.id.textView2);
        but=(Button)findViewById(R.id.button2);

        StringBuffer sb = new StringBuffer();
        sb.append("Thanks for taking Quiz\n\n");
        sb.append("\nCorrect Answers : "+CActivity.correct);
        sb.append("\n\nWrong Answers : "+CActivity.wrong);
        sb.append("\n\nFinal Score : "+CActivity.marks);
        tw.setText(sb);

        CActivity.correct=0;
        CActivity.wrong=0;
        CActivity.marks=0;

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intt = new Intent(getApplicationContext(),CActivity.class);
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

