package org.douran.app.DbConnections;


import org.douran.app.Models.Book;
import org.douran.app.Models.User;
import org.springframework.data.jdbc.repository.query.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query("SELECT * FROM INFRA.AD_USER ORDER BY ID")
    List<User> findAllUsers();

    @Query("SELECT * FROM INFRA.AD_USER WHERE NAME = :username")
    List<User> findByName(@Param("username") String name);
}
