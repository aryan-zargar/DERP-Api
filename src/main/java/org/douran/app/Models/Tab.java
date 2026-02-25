package org.douran.app.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("INFRA.AD_TAB")
public class Tab {
    @Id
    @Column("AD_TAB_ID")
    private long Id;

    @Column("AD_CLIENT_ID")
    private long ClientId;

    @Column("AD_ORG_ID")
    private long OrgId;

    @Column("ISACTIVE")
    private char IsActive;

    @Column("Name")
    private String Name;

    @Column("Description")
    private String Description;

    @Column("AD_TABLE_ID")
    private long TableId;

    @Column("AD_WINDOW_ID")
    private long WindowId;

    @Column("SEQNO")
    private int SeqNo;

    @Column("TABLEVEL")
    private int TabLevel;

    @Column("AD_COLUMN_ID")
    private long ColumnId;

    @Column("ENTITYTYPE")
    private char EntityType;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getClientId() {
        return ClientId;
    }

    public void setClientId(long clientId) {
        ClientId = clientId;
    }

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
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

    public long getTableId() {
        return TableId;
    }

    public void setTableId(long tableId) {
        TableId = tableId;
    }

    public long getWindowId() {
        return WindowId;
    }

    public void setWindowId(long windowId) {
        WindowId = windowId;
    }

    public int getSeqNo() {
        return SeqNo;
    }

    public void setSeqNo(int seqNo) {
        SeqNo = seqNo;
    }

    public int getTabLevel() {
        return TabLevel;
    }

    public void setTabLevel(int tabLevel) {
        TabLevel = tabLevel;
    }

    public long getColumnId() {
        return ColumnId;
    }

    public void setColumnId(long columnId) {
        ColumnId = columnId;
    }

    public char getEntityType() {
        return EntityType;
    }

    public void setEntityType(char entityType) {
        EntityType = entityType;
    }
}
