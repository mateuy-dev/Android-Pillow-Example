package cat.my.android.mybooksample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.gson.reflect.TypeToken;

import android.content.Context;
import cat.my.android.mybooksample.models.Author;
import cat.my.android.mybooksample.models.Book;
import cat.my.android.pillow.PillowConfigXml;
import cat.my.android.pillow.conf.DefaultModelConfiguration;
import cat.my.android.pillow.conf.IModelConfigurations;
import cat.my.android.pillow.conf.ModelConfiguration;

public class PillowConfiguration implements IModelConfigurations{
	@Override
	public List<ModelConfiguration<?>> getModelConfigurators(Context context, PillowConfigXml config) {
		List<ModelConfiguration<?>> result = new ArrayList<>();
		String url = config.getUrl();
		
		DefaultModelConfiguration<Author> authorConfiguration = 
					new DefaultModelConfiguration<Author>(context, Author.class, new TypeToken<Collection<Author>>(){}, url);
		result.add(authorConfiguration);
		
		DefaultModelConfiguration<Book> bookConfiguration = 
				new DefaultModelConfiguration<Book>(context, Book.class, new TypeToken<Collection<Book>>(){}, url);
		result.add(bookConfiguration);
		
		return result;
	}

}
