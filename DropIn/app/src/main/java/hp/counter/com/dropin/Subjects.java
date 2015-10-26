package hp.counter.com.dropin;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by npais_000 on 10/14/2015.
 */
public class Subjects extends ListActivity {
    String classes[]={"English","Science","Social","Maths","GK","Sports","Puzzles","EndTest"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Subjects.this,android.R.layout.simple_list_item_1,classes));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String check=classes[position];
        try {
            Class ourclass = Class.forName("hp.counter.com.dropin." + check);
            Intent ourintent = (new Intent(Subjects.this, ourclass));
            startActivity(ourintent);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
