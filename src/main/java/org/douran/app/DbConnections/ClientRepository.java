package org.douran.app.DbConnections;

import org.douran.app.Models.Client;
import org.douran.app.Models.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<User, Long> {
    @Query("SELECT * FROM INFRA.AD_CLIENT ORDER BY AD_CLIENT_ID")
    List<Client> findAllClients();

    @Query("SELECT * FROM INFRA.AD_CLIENT WHERE AD_CLIENT_ID = :id")
    List<Client> findById(@Param("id") long id);
}
