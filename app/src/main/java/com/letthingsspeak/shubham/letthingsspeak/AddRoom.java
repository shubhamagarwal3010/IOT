package com.letthingsspeak.shubham.letthingsspeak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AddRoom extends AppCompatActivity {

    public static final String ADDED_ROOM = "NEW_ROOM";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_room);
    }

    public void addRoomToList(View view) {
        TextView addTaskView = (TextView) findViewById(R.id.room_type);
        Intent intent = new Intent();
        intent.putExtra(this.ADDED_ROOM, addTaskView.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
