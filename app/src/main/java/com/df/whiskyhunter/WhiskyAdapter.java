package com.df.whiskyhunter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.df.whiskyhunter.models.Whisky;

import java.util.List;

public class WhiskyAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Whisky> myWhiskys;

    public WhiskyAdapter(Activity activity, List<Whisky> myWhiskys) {
        this.activity = activity;
        this.myWhiskys = myWhiskys;
    }

    @Override
    public int getCount() {
        return myWhiskys.size();
    }

    @Override
    public Object getItem(int position) {
        return myWhiskys.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.whisky_item, null);
        }
        Whisky whisky = myWhiskys.get(position);
        TextView nameWhisky = view.findViewById(R.id.txtNameWhisky);
        nameWhisky.setText(whisky.getNameWhisky());
        return view;
    }
}
