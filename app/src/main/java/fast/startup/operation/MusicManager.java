package fast.startup.operation;

import android.content.Context;
import android.widget.Toast;


public class MusicManager {

    private static Context mContext;
    private static volatile MusicManager mInstance;

    public static void init(Context context) {
        mContext = context;
    }

    public static MusicManager getInstance() {
        if (mInstance == null) {
            synchronized (MusicManager.class) {
                if (mInstance == null) {
                    mInstance = new MusicManager();
                }
            }
        }
        return mInstance;
    }

    public void operation() {
        for (int i = 0; i < 50000; i++) {
            if (i == 49999) {
                Toast.makeText(mContext, "MusicManager init success!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private MusicManager() {
        operation();
    }
}
