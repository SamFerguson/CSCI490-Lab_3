package com.intoandroid.listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listy = (ListView)findViewById(R.id.class_schedule);
        final String [] classArray = getResources().getStringArray(R.array.array);
        ArrayAdapter<String> spinPls = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classArray);
        listy.setAdapter(spinPls);
        listy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast toast = Toast.makeText(getApplicationContext(), classArray[position].toLowerCase(), Toast.LENGTH_LONG);
                toast.show();

            }
        });
        listy.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(getApplicationContext(), classArray[position].toUpperCase(), Toast.LENGTH_LONG);
                toast.show();
                return true;
            }
        });



    }
}
