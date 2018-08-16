package com.example.android.lagosguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class RestaurantFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.assets_list,container,false);
        ArrayList<String> info = new ArrayList<>();
        info.add("Hello");
        info.add("Konichiwa");
        info.add("Na bala send you");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,info);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);



        return rootView;
    }

}
