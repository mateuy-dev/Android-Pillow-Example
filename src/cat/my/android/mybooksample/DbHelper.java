package cat.my.android.mybooksample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import cat.my.android.pillow.AbstractDBHelper;

public class DbHelper extends AbstractDBHelper {
	public static int DATABASE_VERSION = 1;
	public static String DATABASE_NAME = "mybook.db";
	
	public DbHelper(Context context){
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	
	
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		resetTables(db);
	};
}
