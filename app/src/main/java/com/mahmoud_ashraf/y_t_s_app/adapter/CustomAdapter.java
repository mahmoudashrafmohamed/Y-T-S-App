package com.mahmoud_ashraf.y_t_s_app.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mahmoud_ashraf.y_t_s_app.R;
import com.mahmoud_ashraf.y_t_s_app.model.movies;
import com.squareup.picasso.Picasso;

/**
 * Created by mahmoud_ashraf on 7/17/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    movies mov;
    Context context;

    public CustomAdapter(movies mov, Context context) {
        this.mov = mov;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_item_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        movies CurrentMov = mov;
        holder.mov_name.setText(CurrentMov.data.movies.get(position).title);
        holder.mov_summary.setText(CurrentMov.data.movies.get(position).summary);
        Picasso.with(holder.itemView.getContext())
                .load(CurrentMov.data.movies.get(position).medium_cover_image)
                .into(holder.pic);


    }

    @Override
    public int getItemCount() {
        return mov.data.movies.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mov_name, mov_summary;
        ImageView pic;


        public MyViewHolder(View itemView) {
            super(itemView);
            mov_name = (TextView) itemView.findViewById(R.id.mov_name);
            mov_summary = (TextView) itemView.findViewById(R.id.mov_summary);
            pic = (ImageView) itemView.findViewById(R.id.mov_pic);


        }
    }
}
