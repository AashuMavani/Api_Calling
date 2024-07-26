package com.app.api_calling_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Recyclerview_Adapter extends RecyclerView.Adapter<Recyclerview_Adapter.Holder> {
    MainActivity mainActivity;
    List<Model> modellist;

    public Recyclerview_Adapter(MainActivity mainActivity, List<Model> modellist) {

        this.mainActivity = mainActivity;
        this.modellist = modellist;
    }

    @NonNull
    @Override
    public Recyclerview_Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.item_flie, parent, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Recyclerview_Adapter.Holder holder, int position){
        holder.txt1.setText(""+modellist.get(position).getTitle());
        holder.txt2.setText(""+modellist.get(position).getBody());


    }

    @Override
    public int getItemCount() {
        return modellist.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView  txt1,txt2;
        public Holder(@NonNull View itemView) {
            super(itemView);
            txt1=itemView.findViewById(R.id.text1);
            txt2=itemView.findViewById(R.id.text2);


        }
    }
}
