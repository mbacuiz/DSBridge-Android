package wendu.jsbdemo;

import android.app.Application;

import wendu.dsbridge.X5DsBridge;

public class app extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        X5DsBridge.init(this);
    }
}
