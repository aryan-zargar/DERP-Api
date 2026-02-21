package org.douran.app.DbConnections;

import org.douran.app.Models.Book;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    // Method 1: Find all books from REPOS.D_BOOKS
    @Query("SELECT * FROM REPOS.D_BOOKS ORDER BY ID")
    List<Book> findAllBooks();

    // Method 2: Find by title
    @Query("SELECT * FROM REPOS.D_BOOKS WHERE TITLE = :title")
    List<Book> findByTitle(@Param("title") String title);

    // Method 3: Find by author
    @Query("SELECT * FROM REPOS.D_BOOKS WHERE AUTHOR = :author ORDER BY TITLE")
    List<Book> findByAuthor(@Param("author") String author);

    // Method 4: Find by ISBN
    @Query("SELECT * FROM REPOS.D_BOOKS WHERE ISBN = :isbn")
    Optional<Book> findByIsbn(@Param("isbn") Integer isbn);

    // Method 5: Search by title
    @Query("SELECT * FROM REPOS.D_BOOKS WHERE UPPER(TITLE) LIKE UPPER(CONCAT('%', :titleFragment, '%'))")
    List<Book> findByTitleContaining(@Param("titleFragment") String titleFragment);

    // Method 6: Get all books sorted
    @Query("SELECT * FROM REPOS.D_BOOKS ORDER BY AUTHOR, TITLE")
    List<Book> findAllOrderByAuthor();

    // Method 7: Count total books
    @Query("SELECT COUNT(*) FROM REPOS.D_BOOKS")
    int countAllBooks();

    // Method 8: Add a new book
    @Query("INSERT INTO REPOS.D_BOOKS (ID, TITLE, AUTHOR, ISBN) VALUES (BOOK_SEQ.NEXTVAL, :title, :author, :isbn)")
    void addBook(@Param("title") String title,
                 @Param("author") String author,
                 @Param("isbn") Integer isbn);

    // Method 9: Update a book
    @Query("UPDATE REPOS.D_BOOKS SET TITLE = :title, AUTHOR = :author, ISBN = :isbn WHERE ID = :id")
    int updateBook(@Param("id") Long id,
                   @Param("title") String title,
                   @Param("author") String author,
                   @Param("isbn") Integer isbn);

    // Method 10: Delete a book
    @Query("DELETE FROM REPOS.D_BOOKS WHERE ID = :id")
    int deleteBookById(@Param("id") Long id);

    // Method 11: Pagination query
    @Query("SELECT * FROM REPOS.D_BOOKS ORDER BY ID OFFSET :offset ROWS FETCH NEXT :limit ROWS ONLY")
    List<Book> findBooksWithPagination(@Param("offset") int offset,
                                       @Param("limit") int limit);

    // Method 12: Get books published after a certain year (if you have a YEAR column)
    // @Query("SELECT * FROM REPOS.D_BOOKS WHERE PUBLICATION_YEAR > :year")
    // List<Book> findBooksAfterYear(@Param("year") int year);
}