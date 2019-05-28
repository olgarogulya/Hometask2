package by.epam.training.hometask03.entity;

public class Book {

	private String title;
	private String author;
	private int price;
	private int yearPublished;

	public Book(String title, String author, int price, int yearPublished) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.yearPublished = yearPublished;
	}
	
		public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getYearPublished() {
		return yearPublished;
	}



	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}



	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", yearPublished=" + yearPublished
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearPublished;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearPublished != other.yearPublished)
			return false;
		return true;
	}

	public enum SortType {
		BY_PRICE, BY_YEAR_PUBLISHED
	}
}