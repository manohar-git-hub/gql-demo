package com.gql;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	private String id;
	private String name;
	private String gender;
	
	public Book(String id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
	private static List<Book> books = Arrays.asList(
			new Book("book-1", "Spring boot dummies" ,"auth-1"),
			new Book("book-2", "Java dummies" ,"auth-2"),
			new Book("book-3", "MicroService Architecture" ,"auth-3")
			);
	
	public static Book getById(String id) {
		return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
