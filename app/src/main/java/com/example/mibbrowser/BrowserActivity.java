package com.example.mibbrowser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class BrowserActivity extends AppCompatActivity {

    private ArrayList<Result> resultArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.choices, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        resultArrayList.add(new Result("sysUpTime.0", "4 hours 33 minutes 30 seconds (1641038)", "TimeTicks", "127.0.0.1:161"));
        resultArrayList.add(new Result("ifDescr.2", "TP-LINK Wireless USB Adapter", "OctetString", "127.0.0.1:161"));
        ResultAdapter resultAdapter = new ResultAdapter(this, resultArrayList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(resultAdapter);

    }
}
