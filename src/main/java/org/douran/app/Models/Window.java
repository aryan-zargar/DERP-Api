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
    private String ClientId;

    @Column("AD_ORG_ID")
    private String OrgId;

    @Column("ISACTIVE")
    private String IsActive;

    @Column("NAME")
    private String Name;

    @Column("HELP")
    private String Help;

    @Column("DESCRIPTION")
    private String Description;

    @Column("WINDOWTYPE")
    private String WindowType;

    @Column("ISSOTRX")
    private String Issotrx;

    @Column("ENTITYTYPE")
    private String EntityType;

    @Column("WINWIDTH")
    private String WindowsWidth;

    public long getId() {return Id;}

    public void setId(long id) {Id = id;}

    public String getClientId() {return ClientId;}

    public void setClientId(String clientId) {ClientId = clientId;}

    public String getOrgId() {return OrgId;}

    public void setOrgId(String orgId) {OrgId = orgId;}

    public String getIsActive() {return IsActive;}

    public void setIsActive(String isActive) {IsActive = isActive;}

    public String getName() {return Name;}

    public void setName(String name) {Name = name;}

    public String getHelp() {return Help;}

    public void setHelp(String help) {Help = help;}

    public String getDescription() {return Description;}

    public void setDescription(String description) {Description = description;}

    public String getWindowType() {return WindowType;}

    public void setWindowType(String windowType) {WindowType = windowType;}

    public String getIssotrx() {return Issotrx;}

    public void setIssotrx(String issotrx) {Issotrx = issotrx;}

    public String getEntityType() {return EntityType;}

    public void setEntityType(String entityType) {EntityType = entityType;}

    public String getWindowsWidth() {return WindowsWidth;}

    public void setWindowsWidth(String windowsWidth) {WindowsWidth = windowsWidth;}
}
