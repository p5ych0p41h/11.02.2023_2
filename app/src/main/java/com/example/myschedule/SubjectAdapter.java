package com.example.myschedule;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SubjectAdapter extends ArrayAdapter<Subject> {

    public SubjectAdapter(Context context, Subject[] objects) {
        super(context, R.layout.subject, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Subject subject = getItem(position);
        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.subject, null);
        ((TextView) convertView.findViewById(R.id.text_view_name)).setText(subject.getName());
        ((TextView) convertView.findViewById(R.id.text_view_time)).setText(subject.getTime());
        return convertView;
    }
}
