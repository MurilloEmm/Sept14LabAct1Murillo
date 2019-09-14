package com.murillo.sept14act;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;

public class MyService extends IntentService {
    public MyService(){
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        Log.d("Place", "Roque Ruano");
        Log.d("Place", "Plaza Mayor");
        Log.d("Place", "Quadricentinnial Pavillion");
        Log.d("Place", "Arch of the Centuries");
    }


}
