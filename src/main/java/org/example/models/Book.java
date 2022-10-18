package org.example.models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class Book {

    private Integer bookId;
    @NotEmpty(message = "Title should not be empty")
    @Size(min = 1, max = 30, message = "Title should be between 1 and 30 characters")
    private String title;
    @NotEmpty(message = "Author should not be empty")
    @Size(min = 3, max = 30, message = "Author should be between 2 and 30 characters")
    private String author;
    @Min(value = 0, message = "Year of publication should be greater than 0")
    private Integer yearOfPublication;

    private Integer ownerId;

    public Book() {
    }

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

}
