package org.douran.app.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@org.springframework.data.relational.core.mapping.Table("INFRA.AD_TABLE")
public class Table {
    @Id
    @Column("AD_TABLE_ID")
    private long Id;

    @Column("AD_CLIENT_ID")
    private String ClientID;

    @Column("AD_ORG_ID")
    private String OrgID;

    @Column("ISACTIVE")
    private String IsActive;

    @Column("NAME")
    private String Name;

    @Column("DESCRIPTION")
    private String Description;

    @Column("TABLENAME")
    private String TableName;

    @Column("ISVIEW")
    private String IsView;

    @Column("ACCESSLEVEL")
    private String AccessLevel;

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

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String clientID) {
        ClientID = clientID;
    }

    public String getOrgID() {
        return OrgID;
    }

    public void setOrgID(String orgID) {
        OrgID = orgID;
    }

    public String getIsActive() {
        return IsActive;
    }

    public void setIsActive(String isActive) {
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

    public String getAccessLevel() {
        return AccessLevel;
    }

    public void setAccessLevel(String accessLevel) {
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
