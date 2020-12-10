package fast.startup;

import android.app.Application;

import androidx.startup.AppInitializer;

import fast.startup.init.JobManagerInitializer;
import fast.startup.init.MusicManagerInitializer;

public class AppStartUpApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppInitializer.getInstance(getApplicationContext()).
                initializeComponent(JobManagerInitializer.class);
        AppInitializer.getInstance(getApplicationContext()).
                initializeComponent(MusicManagerInitializer.class);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
