package hp.counter.com.dropin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by varun on 17-10-2015.
 */
public class QandA extends Activity
{
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.secondlayout);
        btn =(Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent in = new Intent(getApplicationContext(),QuizActivity.class);
                startActivity(in);

            }
        });



    }

    }


