package com.example.enghaya.music;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ENG.HAYA on 8/13/2017 AD.
 */

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {
Context context ;
    List<Music> students;
    TextView name;

    public MusicAdapter(Context context, List<Music> students) {
        this.context = context;
        this.students = students;
    }

    public Context getContext() {
        return context;
    }

    public List<Music> getStudents() {
        return students;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setStudents(List<Music> students) {
        this.students = students;
    }

    @Override
    public MusicAdapter.MusicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.music,parent,false);
        MusicViewHolder viewHolder= new MusicViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MusicAdapter.MusicViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MusicViewHolder extends RecyclerView.ViewHolder {
         public MusicViewHolder(View v) {
            super(v);
            name = (TextView) v.findViewById(R.id.textView);


        }


    }
}
