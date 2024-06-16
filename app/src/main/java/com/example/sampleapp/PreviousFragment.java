package com.example.sampleapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Arrays;
public class PreviousFragment extends Fragment {

    View view;
//    private ListView listView;
    private ArrayAdapter<String> adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_previous, container, false);

       ListView listView = view.findViewById(R.id.carlist);

        ArrayList<String> itemsList = new ArrayList<>(Arrays.asList(
                "Supra Mk4",
                "Supra Mk5",
                "GTR R34",
                "GTR R35",
                "Lancer evo 9",
                "Lancer evo 10",
                "Lancer evo x"
        ));

        // Initialize the ArrayAdapter
        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, itemsList);

        // Set the adapter to the ListView
        listView.setAdapter(adapter);


        return view;
    }
}