package org.douran.app.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("INFRA.AD_USER")
public class User {
    @Id
    @Column("AD_USER_ID")
    private long Id;

    @Column("AD_CLIENT_ID")  // Maps to TITLE column
    private String ClientId;

    @Column("NAME")  // Maps to AUTHOR column
    private String Username;

    @Column("PASSWORD")  // Maps to ISBN column
    private String Password;

    public long getId() {return this.Id;}
    public String getClientId() {return this.ClientId;}
    public String getUsername() {return this.Username;}
    public String getPassword() {return this.Password;}

}
