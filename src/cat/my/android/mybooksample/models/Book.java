package cat.my.android.mybooksample.models;

import java.util.Calendar;

import cat.my.android.pillow.AbstractIdentificableModel;
import cat.my.android.pillow.util.reflection.ValuesTypes.ValueType;
import cat.my.android.pillow.util.reflection.ValuesTypes.ValueTypeClass;

public class Book extends AbstractIdentificableModel{
	public enum BookEdition{STANDARD, POCKET};
	
	String title;
	String description;
	int pages;
	Calendar publishDate;
	@ValueType(belongsTo=Author.class)
	String authorId;
	BookEdition edition;
	@ValueType(type=ValueTypeClass.COLOR)
	int coverColor;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public Calendar getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Calendar publishDate) {
		this.publishDate = publishDate;
	}
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	public BookEdition getEdition() {
		return edition;
	}
	public void setEdition(BookEdition edition) {
		this.edition = edition;
	}
	public int getCoverColor() {
		return coverColor;
	}
	public void setCoverColor(int coverColor) {
		this.coverColor = coverColor;
	}
	
	@Override
	public String toString() {
		return getTitle();
	}
}
