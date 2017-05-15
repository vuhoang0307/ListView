package activity.minhhoang.uet.listview;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

/**
 * Created by MINHHOANG-PC on 15/05/2017.
 */

public class MyBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (isNetworkConnected(context)){
            Toast.makeText(context, "Internet Connect", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(context, "Internet Disconnect", Toast.LENGTH_SHORT).show();
    }

    private boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }
}
