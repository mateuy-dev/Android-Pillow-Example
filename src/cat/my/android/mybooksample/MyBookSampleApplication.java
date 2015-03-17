package cat.my.android.mybooksample;

import cat.my.android.pillow.Pillow;
import android.app.Application;

public class MyBookSampleApplication extends Application{	
	@Override
	public void onCreate() {
		super.onCreate();
		Pillow.setConfigurationFile(R.xml.android_pillow);
	}
}
