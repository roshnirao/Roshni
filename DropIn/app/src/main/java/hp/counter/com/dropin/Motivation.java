package hp.counter.com.dropin;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;

/**
 * Created by npais_000 on 10/15/2015.
 */
public class Motivation extends Activity {
    ScrollView s;
    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motivation);
        s=(ScrollView)findViewById(R.id.scrollView);
        i1=(ImageView)findViewById(R.id.imageView2);
        i2=(ImageView)findViewById(R.id.imageView3);
        i3=(ImageView)findViewById(R.id.imageView4);
        i4=(ImageView)findViewById(R.id.imageView5);
        i5=(ImageView)findViewById(R.id.imageView6);
        i6=(ImageView)findViewById(R.id.imageView7);
        i7=(ImageView)findViewById(R.id.imageView8);
        i8=(ImageView)findViewById(R.id.imageView9);
        i9 =(ImageView)findViewById(R.id.imageView10);
        i10=(ImageView)findViewById(R.id.imageView11);


    }
}
