package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;


public class CustomArrayAdapter extends ArrayAdapter<ListItemClass> {
    private LayoutInflater inflater;
    private List<ListItemClass> listItem = new ArrayList<>();
    private Context context;


    public CustomArrayAdapter(@NonNull Context context, int resource, List<ListItemClass> listItem,LayoutInflater inflater) {
        super(context, resource, listItem);
        this.inflater = inflater;
        this.listItem = listItem;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        ListItemClass listItemMain = listItem.get(position);
        if(convertView == null){
            convertView = inflater.inflate(R.layout.list_item_1, null, false);
            viewHolder = new ViewHolder();
            viewHolder.data_1 = convertView.findViewById(R.id.tvData1);
            convertView.setTag(viewHolder);



        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.data_1.setText(listItemMain.getData_1());




        return convertView;
    }
    private class ViewHolder{
        TextView data_1;
    }
}