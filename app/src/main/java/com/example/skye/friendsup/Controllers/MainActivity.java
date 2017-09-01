package com.example.skye.friendsup.Controllers;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.skye.friendsup.R;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Status changed ";

    private TextView mTextMessage;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    Intent intentFriends = new Intent(getApplicationContext(), FriendsActivity.class);
                    startActivity(intentFriends);

                    Log.i(TAG,"Friends pressed");

                    //mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);

                    Log.i(TAG,"Meetings pressed");
                    return true;
                case R.id.navigation_notifications:
                    Intent intentNotif = new Intent(getApplicationContext(), NotificationActivity.class);
                    startActivity(intentNotif);
                    Log.i(TAG,"Notification pressed");
                    //mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Log.i(TAG,"onCreateMeetings");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResumeMeetings");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestartMeetings");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStartMeetings");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPauseMeetings");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroyMeetings");
    }
}