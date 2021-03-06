package com.example.android.lagosguide;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.assets_list, container, false);
        ArrayList<Data> info = new ArrayList<>();
        info.add(new Data(getString(R.string.george_name),
                getString(R.string.george_address)));
        info.add(new Data(getString(R.string.eko_name),
                getString(R.string.eko_address)));
        info.add(new Data(getString(R.string.federal_palace_name),
                getString(R.string.federal_palace_address)));


        DataAdapter adapter = new DataAdapter(getActivity(), info);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
