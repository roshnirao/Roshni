package hp.counter.com.dropin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by npais_000 on 10/15/2015.
 */
public class Menu1 extends Activity {
    ImageButton i1,i2,i3,i4,i5,i6;
    TextView t1,t2,t3,t4,t5,t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu1);
        i1=(ImageButton)findViewById(R.id.imageButton);
        i2=(ImageButton)findViewById(R.id.imageButton2);
        i3=(ImageButton)findViewById(R.id.imageButton3);
        i4=(ImageButton)findViewById(R.id.imageButton4);
        i5=(ImageButton)findViewById(R.id.imageButton5);
        i6=(ImageButton)findViewById(R.id.imageButton6);
        t1=(TextView)findViewById(R.id.textView6);
        t2=(TextView)findViewById(R.id.textView7);
        t3=(TextView)findViewById(R.id.textView8);
        t4=(TextView)findViewById(R.id.textView9);
        t5=(TextView)findViewById(R.id.textView10);
        t6=(TextView)findViewById(R.id.textView11);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sub=new Intent(Menu1.this,Subjects.class);
                startActivity(sub);
            }
        });
       /* i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent as=new Intent(Menu1.this,Assignments.class);
                startActivity(as);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hel=new Intent(Menu1.this,HelpLine.class);
                startActivity(hel);
            }
        });*/
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(Menu1.this,Motivation.class);
                startActivity(m);
            }
        });
       i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r=new Intent(Menu1.this,MyRadio.class);
                startActivity(r);
            }
        });
        //selflearn is radio, vise versa
       i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sl=new Intent(Menu1.this,SelfLearn.class);
                startActivity(sl);
            }
        });


    }
}
