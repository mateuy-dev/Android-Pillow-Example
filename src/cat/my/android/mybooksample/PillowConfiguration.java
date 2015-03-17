package cat.my.android.mybooksample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.gson.reflect.TypeToken;

import android.content.Context;
import android.support.v4.app.Fragment;
import cat.my.android.mybooksample.adapters.AuthorAdapter;
import cat.my.android.mybooksample.adapters.BookAdapter;
import cat.my.android.mybooksample.fragments.ShowAuthorFragment;
import cat.my.android.mybooksample.models.Author;
import cat.my.android.mybooksample.models.Book;
import cat.my.android.pillow.PillowConfigXml;
import cat.my.android.pillow.conf.DefaultModelConfiguration;
import cat.my.android.pillow.conf.DefaultModelViewConfiguration;
import cat.my.android.pillow.conf.IModelConfigurations;
import cat.my.android.pillow.conf.ModelConfiguration;
import cat.my.android.pillow.view.base.IModelListAdapter;

public class PillowConfiguration implements IModelConfigurations{
	@Override
	public List<ModelConfiguration<?>> getModelConfigurators(Context context, PillowConfigXml config) {
		List<ModelConfiguration<?>> result = new ArrayList<>();
		String url = config.getUrl();
		
		DefaultModelConfiguration<Author> authorConfiguration = 
					new DefaultModelConfiguration<Author>(context, Author.class, new TypeToken<Collection<Author>>(){}, url);
		DefaultModelViewConfiguration<Author> authorViewConfiguration = new DefaultModelViewConfiguration<Author>(Author.class){
			@Override
			public IModelListAdapter<Author> getListAdapter(Context context) {
				return new AuthorAdapter(context);
			}
			@Override
			public Fragment getShowFragment() {
				return new ShowAuthorFragment();
			}
		};
		authorConfiguration.setViewConfiguration(authorViewConfiguration);
		result.add(authorConfiguration);
		
		DefaultModelConfiguration<Book> bookConfiguration = 
				new DefaultModelConfiguration<Book>(context, Book.class, new TypeToken<Collection<Book>>(){}, url);
		DefaultModelViewConfiguration<Book> bookViewConfiguration = new DefaultModelViewConfiguration<Book>(Book.class){
			@Override
			public IModelListAdapter<Book> getListAdapter(Context context) {
				return new BookAdapter(context);
			}
		};
		bookConfiguration.setViewConfiguration(bookViewConfiguration);
		result.add(bookConfiguration);
		
		return result;
	}

}
