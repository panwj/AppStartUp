package fast.startup.operation;

import android.content.Context;
import android.widget.Toast;


public class WorkManager {

    private static Context mContext;
    private static volatile WorkManager mInstance;

    public static void init(Context context) {
        mContext = context;
    }

    public static WorkManager getInstance() {
        if (mInstance == null) {
            synchronized (WorkManager.class) {
                if (mInstance == null) {
                    mInstance = new WorkManager();
                }
            }
        }
        return mInstance;
    }

    public void operation() {
        for (int i = 0; i < 10000; i++) {
            if (i == 9999) {
                Toast.makeText(mContext, "WorkManager init success!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private WorkManager() {
        operation();
    }
}
