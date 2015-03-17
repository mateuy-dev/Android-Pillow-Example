package cat.my.android.mybooksample.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import cat.my.android.mybooksample.models.Author;
import cat.my.android.mybooksample.models.Book;
import cat.my.android.pillow.view.forms.views.PillowShowWithReferencesFragment;

public class ShowAuthorFragment extends PillowShowWithReferencesFragment<Author>{
	
	public android.view.View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		getArguments().putSerializable(PillowShowWithReferencesFragment.REFERENCED_CLASS_ATTRIBUTE, Book.class);
		return super.onCreateView(inflater, container, savedInstanceState);
	};

}
