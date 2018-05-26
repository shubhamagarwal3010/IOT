package com.letthingsspeak.shubham.letthingsspeak;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class RoomIotDevices extends AppCompatActivity {
    private static final String KEY_INDEX = "news_index";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_devices);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int index = getIntent().getIntExtra(KEY_INDEX, -1);
        if (index != -1) {

        } else {
            Toast.makeText(RoomIotDevices.this, "Sorry incorrect index passed", Toast.LENGTH_SHORT).show();
        }
    }


    public static void launch(Context context, int index) {
        Intent intent = new Intent(context, RoomIotDevices.class);
        intent.putExtra(KEY_INDEX, index);
        context.startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
