package com.example.roomfinder.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.roomfinder.R;
import com.example.roomfinder.model.Room;
import com.example.roomfinder.views.RoomDescriptionActivity;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

/**
 * Created by Sujan Shrestha.
 */
public class RoomRecyclerAdapter extends FirebaseRecyclerAdapter<Room, RoomViewHolder> {

    public RoomRecyclerAdapter(@NonNull FirebaseRecyclerOptions<Room> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull RoomViewHolder holder, int position, @NonNull Room model) {
        holder.bind(model);
        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), RoomDescriptionActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("model", model);
            intent.putExtras(bundle);
            view.getContext().startActivity(intent);
        });

    }

    @NonNull
    @Override
    public RoomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.room_item, viewGroup, false);
        return new RoomViewHolder(view);
    }
}
