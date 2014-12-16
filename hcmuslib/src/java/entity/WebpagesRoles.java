package entity;
<<<<<<< HEAD
// Generated Dec 12, 2014 9:07:56 PM by Hibernate Tools 3.6.0
=======
// Generated Dec 12, 2014 5:30:45 PM by Hibernate Tools 4.3.1
>>>>>>> origin/master


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * WebpagesRoles generated by hbm2java
 */
@Entity
@Table(name="webpages_Roles"
    ,schema="dbo"
    ,catalog="QLTHUVIEN"
    , uniqueConstraints = @UniqueConstraint(columnNames="RoleName") 
)
public class WebpagesRoles  implements java.io.Serializable {


     private int roleId;
     private String roleName;
     private Set<UserPassword> userPasswords = new HashSet<UserPassword>(0);
     private Set<UserPassword> userPasswords_1 = new HashSet<UserPassword>(0);

    public WebpagesRoles() {
    }

	
    public WebpagesRoles(int roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public WebpagesRoles(int roleId, String roleName, Set<UserPassword> userPasswords, Set<UserPassword> userPasswords_1) {

       this.roleId = roleId;
       this.roleName = roleName;
       this.userPasswords = userPasswords;
       this.userPasswords_1 = userPasswords_1;
    }
   
     @Id 

    
    @Column(name="RoleId", unique=true, nullable=false)
    public int getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    
    @Column(name="RoleName", unique=true, nullable=false)
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="webpages_UsersInRoles", schema="dbo", catalog="QLTHUVIEN", joinColumns = { 
        @JoinColumn(name="RoleId", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="UserId", nullable=false, updatable=false) })
    public Set<UserPassword> getUserPasswords() {
        return this.userPasswords;
    }
    
    public void setUserPasswords(Set<UserPassword> userPasswords) {
        this.userPasswords = userPasswords;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="webpagesRoles")
    public Set<UserPassword> getUserPasswords_1() {
        return this.userPasswords_1;
    }
    
    public void setUserPasswords_1(Set<UserPassword> userPasswords_1) {
        this.userPasswords_1 = userPasswords_1;
    }




}


