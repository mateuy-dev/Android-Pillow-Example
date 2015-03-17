package cat.my.android.mybooksample.adapters;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import cat.my.android.mybooksample.models.Author;
import cat.my.android.pillow.view.list.PillowListAdapter;

public class AuthorAdapter extends PillowListAdapter<Author>{

	public AuthorAdapter(Context context) {
		super(context, Author.class);
	}
	
	@Override
	public void updateListView(Author model, TextView titleView, TextView textView, ImageView imageView) {
		textView.setText(model.toString());
		titleView.setText("");
	}

}
