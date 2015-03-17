package cat.my.android.mybooksample;

import cat.my.android.mybooksample.models.Author;
import cat.my.android.mybooksample.models.Book;
import cat.my.android.pillow.view.NavigationUtil;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		NavigationUtil navigationUtil;
		public PlaceholderFragment() {
			navigationUtil = new NavigationUtil(this);
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container, false);
			Button booksButton = (Button) rootView.findViewById(R.id.books_button);
			booksButton.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					navigationUtil.displayListModel(Book.class);
				}
			});
			Button authorsButton = (Button)rootView.findViewById(R.id.authors_button);
			authorsButton.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					navigationUtil.displayListModel(Author.class);
				}
			});
			return rootView;
		}
	}
}
