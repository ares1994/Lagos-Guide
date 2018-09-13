package com.example.android.lagosguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends ArrayAdapter<Data> {
    DataAdapter(Activity context, ArrayList<Data> info) {
        super(context, 0, info);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.assets_item, parent, false);
        }


        Data currentData = getItem(position);

        ImageView imageView = convertView.findViewById(R.id.picture);

        if (currentData.hasImage()) {
            imageView.setImageResource(currentData.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }


        TextView nameTextView = convertView.findViewById(R.id.name);
        nameTextView.setText(currentData.getName());

        TextView addressTextView = convertView.findViewById(R.id.address);
        addressTextView.setText(currentData.getAddress());


        return convertView;
    }
}
