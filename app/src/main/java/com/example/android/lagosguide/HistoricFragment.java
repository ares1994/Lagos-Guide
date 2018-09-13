package com.example.android.lagosguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HistoricFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.assets_list, container, false);
        ArrayList<Data> info = new ArrayList<>();
        info.add(new Data(getString(R.string.african_cathedral_name), getString(R.string.african_cathedral_address)));
        info.add(new Data(getString(R.string.afrika_name), getString(R.string.afrika_address)));
        info.add(new Data(getString(R.string.theatre_name), getString(R.string.theatre_address)));

        DataAdapter adapter = new DataAdapter(getActivity(), info);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }
}
