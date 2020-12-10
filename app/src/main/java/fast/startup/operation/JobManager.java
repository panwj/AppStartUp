package fast.startup.operation;

import android.content.Context;
import android.widget.Toast;


public class JobManager {

    private static Context mContext;
    private static volatile JobManager mInstance;

    public static void init(Context context) {
        mContext = context;
    }

    public static JobManager getInstance() {
        if (mInstance == null) {
            synchronized (JobManager.class) {
                if (mInstance == null) {
                    mInstance = new JobManager();
                }
            }
        }
        return mInstance;
    }

    public void operation() {
        for (int i = 0; i < 100000; i++) {
            if (i == 9999) {
                Toast.makeText(mContext, "JobManager init success!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private JobManager() {
        operation();
    }
}
