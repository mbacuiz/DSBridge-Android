package wendu.jsbdemo;

import android.app.Application;

import wendu.dsbridge.DsBridge;

public class app extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DsBridge.init(this);
    }
}
