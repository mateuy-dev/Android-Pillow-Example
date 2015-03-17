package cat.my.android.mybooksample.adapters;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import cat.my.android.mybooksample.models.Book;
import cat.my.android.pillow.view.list.PillowListAdapter;

public class BookAdapter extends PillowListAdapter<Book>{

	public BookAdapter(Context context) {
		super(context, Book.class);
	}
	
	public void updateListView(Book model, TextView titleView, TextView textView, ImageView imageView) {
		titleView.setText(model.getTitle());
		textView.setText(model.getDescription());
		imageView.setBackgroundColor(model.getCoverColor());
	};
	

}
