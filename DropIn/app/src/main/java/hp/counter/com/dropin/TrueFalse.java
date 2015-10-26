package hp.counter.com.dropin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by varun on 17-10-2015.
 */
public class TrueFalse extends Activity
{
    Button btn;
    public static boolean tbflag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_tfs);

        btn =(Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent in = new Intent(getApplicationContext(),CActivity.class);
                startActivity(in);

            }
        });



    }

}



