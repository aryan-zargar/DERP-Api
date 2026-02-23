package org.douran.app.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("INFRA.AD_CLIENT")
public class Client {
    @Id
    @Column("AD_CLIENT_ID")
    private long Id;

    @Column("VALUE")
    private String Value;

    @Column("NAME")
    private String Name;

    public long getId() {return this.Id;}
    public String getValue() {return this.Value;}
    public String getName() {return this.Name;}
}
