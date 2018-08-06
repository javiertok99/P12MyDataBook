package com.example.a16022934.p12_mydatabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter{
    Context parent_context;
    int layout_id;
    ArrayList<Row> names;
    TextView tvName;
    ImageView ivIcon;


    public CustomAdapter(Context context, int resource, ArrayList<Row> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        names = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        tvName = rowView.findViewById(R.id.tvName);
        ivIcon = rowView.findViewById(R.id.ivIcon);

        Row currRow = names.get(position);

        tvName.setText(currRow.getName());
        ivIcon.setImageResource(currRow.getImage());

        return rowView;
    }

}
