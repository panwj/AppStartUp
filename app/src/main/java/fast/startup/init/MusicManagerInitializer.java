package fast.startup.init;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.startup.Initializer;

import java.util.Collections;
import java.util.List;

import fast.startup.operation.MusicManager;
import fast.startup.operation.WorkManager;

public class MusicManagerInitializer implements Initializer<MusicManager> {

    /**
     * 该方法进行sdk初始化
     * @param context
     * @return
     */
    @NonNull
    @Override
    public MusicManager create(@NonNull Context context) {
        MusicManager.init(context);
        return MusicManager.getInstance();
    }

    /**
     * 设置该sdk初始化的依赖关系
     * @return
     */
    @NonNull
    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        //不能直接返回 NULL, 否则 startup 会发生空指针错误
        return Collections.emptyList();
    }
}
