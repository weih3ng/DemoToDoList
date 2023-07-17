package sg.edu.rp.c346.id22005564.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<ToDoItem> al;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        al = new ArrayList<>();


        Calendar date1 = Calendar.getInstance();
        date1.set(2020, Calendar.AUGUST , 1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2020, Calendar.AUGUST , 2);




        ToDoItem item1 = new ToDoItem("Go for movie", date1);
        ToDoItem item2 = new ToDoItem("Go for haircut", date2);




        // Add the items to the list
        al.add(item1);
        al.add(item2);


        adapter = new CustomAdapter(this, R.layout.row, al);

        lv.setAdapter(adapter);
    }
}

