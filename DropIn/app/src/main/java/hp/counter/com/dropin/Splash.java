package hp.counter.com.dropin;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    MediaPlayer oursong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        oursong=MediaPlayer.create(Splash.this,R.raw.song);
        oursong.start();
        Thread timer=new Thread(){
            public void run() {
                try {
                    sleep(8000);

                } catch (InterruptedException e) {
                    e.printStackTrace();


                } finally {
                    Intent myname = new Intent(Splash.this,HomeActivity.class);
                    startActivity(myname);
                }
            }

        };timer.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        oursong.release();
        finish();
    }
}
