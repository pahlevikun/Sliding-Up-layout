package com.github.pahlevikun.slidinguplayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by AisyahAstindraR on 22, 3/22/2018.
 */

public class TimelineTrackerAdapter extends RecyclerView.Adapter<TimelineTrackerAdapter.ViewHolder> {

    private ArrayList<TimelineTrackerData> rvData;

    public TimelineTrackerAdapter(ArrayList<TimelineTrackerData> inputData) {
        this.rvData = inputData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.textViewAdapter)
        TextView textViewAdapter;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_tracker, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TimelineTrackerData timelineTrackerDataList = rvData.get(position);
        holder.textViewAdapter.setText(timelineTrackerDataList.getDetail());
    }

    @Override
    public int getItemCount() {
        return rvData.size();
    }
}
