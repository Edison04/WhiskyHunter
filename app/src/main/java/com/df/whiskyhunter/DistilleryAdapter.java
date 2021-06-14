package com.df.whiskyhunter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.df.whiskyhunter.models.Distillery;

import java.util.List;

public class DistilleryAdapter extends BaseAdapter {
    protected Activity activity;
    protected List<Distillery> myDistilleries;

    public DistilleryAdapter(Activity activity, List<Distillery> myDistilleries) {
        this.activity = activity;
        this.myDistilleries = myDistilleries;
    }

    @Override
    public int getCount() {
        return myDistilleries.size();
    }

    @Override
    public Object getItem(int position) {
        return myDistilleries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (convertView == null) {
            LayoutInflater inflater =(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.distillery_item, null);
        }
        Distillery distillery = myDistilleries.get(position);
        TextView nameDistillery = view.findViewById(R.id.txtNameDistillery);
        nameDistillery.setText(distillery.getNameDistillery());
        return view;
    }
}
