package com.example.android.lagosguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.assets_list, container, false);
        ArrayList<Data> info = new ArrayList<>();
        info.add(new Data(getString(R.string.nok_name), getString(R.string.nok_address),
                R.drawable.nok_by_alara));
        info.add(new Data(getString(R.string.rsvp_name), getString(R.string.rsvp_address), R.drawable.rsvp));
        info.add(new Data(getString(R.string.crossroads_name), getString(R.string.crossroads_address),
                R.drawable.crossroads));


        DataAdapter adapter = new DataAdapter(getActivity(), info);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }

}
