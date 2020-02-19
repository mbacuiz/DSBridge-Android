package wendu.dsbridge;

import android.content.Context;
import android.util.Log;

import com.tencent.smtt.sdk.QbSdk;

public class X5DsBridge {

    public static void init(Context context) {
        QbSdk.initX5Environment(context, new QbSdk.PreInitCallback() {
            @Override
            public void onCoreInitFinished() {
                Log.d("jsbridge", "onCoreInitFinished");
            }

            @Override
            public void onViewInitFinished(boolean b) {
                Log.d("jsbridge", "onCoreInitFinished");
            }
        });
    }


}
