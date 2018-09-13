package com.example.android.lagosguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RecreationFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.assets_list, container, false);

        ArrayList<Data> info = new ArrayList<>();
        info.add(new Data(getString(R.string.paint_name), getString(R.string.paint_address)));
        info.add(new Data(getString(R.string.jhalobia_name), getString(R.string.jhalobia_address)));
        info.add(new Data(getString(R.string.mall_name), getString(R.string.mall_address)));

        DataAdapter adapter = new DataAdapter(getActivity(), info);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }
}
