package org.douran.app.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("INFRA.AD_WINDOW")
public class Window {
    @Id
    @Column("AD_WINDOW_ID")
    private long Id;

    @Column("AD_CLIENT_ID")
    private long ClientId;

    @Column("AD_ORG_ID")
    private long OrgId;

    @Column("ISACTIVE")
    private char IsActive;

    @Column("NAME")
    private String Name;

    @Column("HELP")
    private String Help;

    @Column("DESCRIPTION")
    private String Description;

    @Column("WINDOWTYPE")
    private char WindowType;

    @Column("ISSOTRX")
    private char Issotrx;

    @Column("ENTITYTYPE")
    private int EntityType;

    @Column("WINWIDTH")
    private int WindowsWidth;

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

    public String getHelp() {
        return Help;
    }

    public void setHelp(String help) {
        Help = help;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public char getWindowType() {
        return WindowType;
    }

    public void setWindowType(char windowType) {
        WindowType = windowType;
    }

    public char getIssotrx() {
        return Issotrx;
    }

    public void setIssotrx(char issotrx) {
        Issotrx = issotrx;
    }

    public int getEntityType() {
        return EntityType;
    }

    public void setEntityType(int entityType) {
        EntityType = entityType;
    }

    public int getWindowsWidth() {
        return WindowsWidth;
    }

    public void setWindowsWidth(int windowsWidth) {
        WindowsWidth = windowsWidth;
    }
}
