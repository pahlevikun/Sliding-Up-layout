package com.github.pahlevikun.slidinguplayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by AisyahAstindraR on 20, 3/20/2018.
 */

public class FragmentTracker extends Fragment {

    @BindView(R.id.sliding_layout)
    SlidingUpPanelLayout slidingUpPanelLayout;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private Unbinder unbinder;

    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<TimelineTrackerData> arrayList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tracker, container, false);
        unbinder = ButterKnife.bind(this, rootView);

        // Init data
        initDataSet();

        // Setup adapter and layout manager
        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new TimelineTrackerAdapter(arrayList);
        // Set adapter and layout to recyclerview
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        // Notify adapter, preventif action for some case
        adapter.notifyDataSetChanged();

        return rootView;
    }

    private void initDataSet() {
        arrayList.add(new TimelineTrackerData(0, "05 Jan 2018", "14:27", "Teknisi sedang dalam perjalanan menuju lokasi"));
        arrayList.add(new TimelineTrackerData(1, "06 Jan 2018", "14:27", "Teknisi melakukan perbaikan"));
        arrayList.add(new TimelineTrackerData(2, "07 Jan 2018", "14:27", "Teknisi selesai melakukan perbaikan"));
        arrayList.add(new TimelineTrackerData(3, "05 Jan 2018", "14:27", "Teknisi sedang dalam perjalanan menuju lokasi"));
        arrayList.add(new TimelineTrackerData(4, "06 Jan 2018", "14:27", "Teknisi melakukan perbaikan"));
        arrayList.add(new TimelineTrackerData(5, "07 Jan 2018", "14:27", "Teknisi selesai melakukan perbaikan"));
        arrayList.add(new TimelineTrackerData(6, "05 Jan 2018", "14:27", "Teknisi sedang dalam perjalanan menuju lokasi"));
        arrayList.add(new TimelineTrackerData(7, "06 Jan 2018", "14:27", "Teknisi melakukan perbaikan"));
        arrayList.add(new TimelineTrackerData(8, "07 Jan 2018", "14:27", "Teknisi selesai melakukan perbaikan"));
        arrayList.add(new TimelineTrackerData(9, "05 Jan 2018", "14:27", "Teknisi sedang dalam perjalanan menuju lokasi"));
        arrayList.add(new TimelineTrackerData(10, "06 Jan 2018", "14:27", "Teknisi melakukan perbaikan"));
        arrayList.add(new TimelineTrackerData(11, "07 Jan 2018", "14:27", "Teknisi selesai melakukan perbaikan"));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
