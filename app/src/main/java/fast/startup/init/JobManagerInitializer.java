package fast.startup.init;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.startup.Initializer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import fast.startup.operation.JobManager;
import fast.startup.operation.WorkManager;

public class JobManagerInitializer implements Initializer<JobManager> {

    /**
     * 进行sdk的初始化
     * @param context
     * @return
     */
    @NonNull
    @Override
    public JobManager create(@NonNull Context context) {
        JobManager.init(context);
        return JobManager.getInstance();
    }

    /**
     * 设置sdk初始化的依赖关系
     * 该例中依赖WorkManagerInitializer，WorkManagerInitializer初始化完成后才会初始化JobManagerInitializer
     * @return
     */
    @NonNull
    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Arrays.asList(WorkManagerInitializer.class);
    }
}
