package com.a2zdaddy.dailynews;

/**
 * Created by FARHAN SAIKH on 3/4/2018.
 */

import android.annotation.SuppressLint;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;


@SuppressLint("Registered")
public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String TAG = "NOTIFICATION";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Token: " + token);
    }
}