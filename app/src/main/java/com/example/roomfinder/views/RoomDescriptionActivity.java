package com.example.roomfinder.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.roomfinder.R;
import com.example.roomfinder.model.Room;

public class RoomDescriptionActivity extends AppCompatActivity {

    private TextView tvName, tvPrice, tvDescription;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_description);

        tvName = findViewById(R.id.tvName);
        tvPrice = findViewById(R.id.tvPrice);
        tvDescription = findViewById(R.id.tvDesc);
        imageView = findViewById(R.id.imgProfile);

        Room room = (Room) getIntent().getSerializableExtra("model");
        tvName.setText(room.getName());
        tvPrice.setText(room.getPrice());
        tvDescription.setText(room.getType());

    }
}
