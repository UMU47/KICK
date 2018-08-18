package com.addressapp.umu.kickstartercopy.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.addressapp.umu.kickstartercopy.R;
import com.addressapp.umu.kickstartercopy.ListLayouts.home_items;

import java.util.List;

public class homeadapter extends RecyclerView.Adapter<homeadapter.homeviewholder>{

    Context mycontext;
    List<home_items> homeitems;

    @NonNull
    @Override
    public homeviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mycontext);
        @SuppressLint("InflateParams") View view = inflater.inflate(R.layout.home_layout,null);
        return new homeviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull homeviewholder homeviewholder, int i) {
       home_items home_items = homeitems.get(i);

       homeviewholder.textViewdesc.setText(home_items.getDesc());
       homeviewholder.textViewattr1.setText(home_items.getAttr1());
       homeviewholder.textViewattr2.setText(home_items.getAttr2());
       homeviewholder.textViewattr3.setText(home_items.getAttr3());
       homeviewholder.imageView.setImageDrawable(mycontext.getResources().getDrawable(home_items.getImage()));
    }

    @Override
    public int getItemCount() {
        return homeitems.size();
    }

    class homeviewholder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textViewdesc,textViewattr1,textViewattr2,textViewattr3;

        homeviewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.home_image_view);
            textViewdesc = itemView.findViewById(R.id.home_text1);
            textViewattr1 = itemView.findViewById(R.id.home_text2);
            textViewattr2 = itemView.findViewById(R.id.home_text3);
            textViewattr3 = itemView.findViewById(R.id.home_text4);
        }
    }

}
