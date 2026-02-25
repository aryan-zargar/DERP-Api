package org.douran.app.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@org.springframework.data.relational.core.mapping.Table("INFRA.AD_TABLE")
public class Table {
    @Id
    @Column("AD_TABLE_ID")
    private long Id;

    @Column("AD_CLIENT_ID")
    private long ClientID;

    @Column("AD_ORG_ID")
    private long OrgID;

    @Column("ISACTIVE")
    private char IsActive;

    @Column("NAME")
    private String Name;

    @Column("DESCRIPTION")
    private String Description;

    @Column("TABLENAME")
    private String TableName;

    @Column("ISVIEW")
    private String IsView;

    @Column("ACCESSLEVEL")
    private int AccessLevel;

    @Column("ENTITYTYPE")
    private String EntityType;

    @Column("AD_WINDOW_ID")
    private String WindowId;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getClientID() {
        return ClientID;
    }

    public void setClientID(long clientID) {
        ClientID = clientID;
    }

    public long getOrgID() {
        return OrgID;
    }

    public void setOrgID(long orgID) {
        OrgID = orgID;
    }

    public char getIsActive() {
        return IsActive;
    }

    public void setIsActive(char isActive) {
        IsActive = isActive;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTableName() {
        return TableName;
    }

    public void setTableName(String tableName) {
        TableName = tableName;
    }

    public String getIsView() {
        return IsView;
    }

    public void setIsView(String isView) {
        IsView = isView;
    }

    public int getAccessLevel() {
        return AccessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        AccessLevel = accessLevel;
    }

    public String getEntityType() {
        return EntityType;
    }

    public void setEntityType(String entityType) {
        EntityType = entityType;
    }

    public String getWindowId() {
        return WindowId;
    }

    public void setWindowId(String windowId) {
        WindowId = windowId;
    }
}
