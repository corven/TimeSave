package com.example.cos.timesave;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class WorkAdapter extends RecyclerView.Adapter<WorkAdapter.ViewHolder>{

    private ArrayList<Work> works;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvTime, tvWork;

        public ViewHolder(View v) {
            super(v);
            tvTime = (TextView) v.findViewById(R.id.tvTime);
            tvWork = (TextView) v.findViewById(R.id.tvWork);
        }
    }

    public WorkAdapter(ArrayList<Work> works) {
        this.works = works;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.work_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Work work = works.get(position);

        holder.tvWork.setText(work.getWork());
        holder.tvTime.setText(String.valueOf(work.getTime()));
    }

    @Override
    public int getItemCount() {
        return works.size();
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }
}
