package com.example.mibbrowser;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Adrian on 17.12.2017.
 */

public class ResultAdapter extends ArrayAdapter<Result> {

    public ResultAdapter(Activity context, ArrayList<Result> results) {
        super(context, 0, results);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Result currentResult = getItem(position);


        TextView nameTextView = listItemView.findViewById(R.id.name);
        TextView valueTextView = listItemView.findViewById(R.id.value);
        TextView typeTextView = listItemView.findViewById(R.id.type);
        TextView ipTextView = listItemView.findViewById(R.id.ip);

        nameTextView.setText(currentResult.getName());
        valueTextView.setText(currentResult.getValue());
        typeTextView.setText(currentResult.getType());
        ipTextView.setText(currentResult.getIP());
        return listItemView;
    }
}
