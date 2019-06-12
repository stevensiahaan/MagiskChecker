package id.stevensiahaan.magiskchecker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import stevensiahaan.com.magiskchecker.MagiskUtils;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MagiskUtils magiskUtils = new MagiskUtils();
        Log.e(TAG, (magiskUtils.isDeviceRootedByMagisk() ? "Rooted" : "Not Rooted"));
        magiskUtils.isDeviceRootedByMagisk();
    }
}
