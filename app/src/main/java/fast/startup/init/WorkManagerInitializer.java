package fast.startup.init;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.startup.Initializer;

import java.util.Collections;
import java.util.List;

import fast.startup.operation.WorkManager;

public class WorkManagerInitializer implements Initializer<WorkManager> {

    @NonNull
    @Override
    public WorkManager create(@NonNull Context context) {
        WorkManager.init(context);
        return WorkManager.getInstance();
    }

    @NonNull
    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }
}
