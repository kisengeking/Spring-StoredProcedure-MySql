package com.bookapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@NamedStoredProcedureQuery(
		name = "getBookCountByAuthor",
		procedureName = "get_count_of_books",
		parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN,name = "auth", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT,name = "total", type = Integer.class)
		})
public class Book {
	
	@Column(name="title")
	private String title;
	@Column(name="author")
	private String author;
	@Id
	private Integer bookId;
	@Column(name="cost")
	private double price;
	@Column(name="category")
	private String category;
}
