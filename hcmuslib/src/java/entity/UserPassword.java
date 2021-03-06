package entity;

// Generated Dec 12, 2014 5:30:45 PM by Hibernate Tools 4.3.1
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.*;

import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * UserPassword generated by hbm2java
 */
@Entity
@Table(name = "USER_PASSWORD", schema = "dbo", catalog = "QLTHUVIEN"
)

public class UserPassword implements java.io.Serializable {

    private int idUser;
    private WebpagesRoles webpagesRoles;
    @NotEmpty
    private String userName;
    @NotEmpty
    @Size(min = 6)
    private String password;
    private Set<Docgia> docgias = new HashSet<Docgia>(0);
    private Set<Nhanvien> nhanviens = new HashSet<Nhanvien>(0);
    private Set<WebpagesRoles> webpagesRoleses = new HashSet<WebpagesRoles>(0);

    public UserPassword() {
    }

    public UserPassword(int idUser) {
        this.idUser = idUser;
    }

    public UserPassword(int idUser, WebpagesRoles webpagesRoles, String userName, String password, Set<Docgia> docgias, Set<Nhanvien> nhanviens, Set<WebpagesRoles> webpagesRoleses) {
        this.idUser = idUser;
        this.webpagesRoles = webpagesRoles;
        this.userName = userName;
        this.password = password;
        this.docgias = docgias;
        this.nhanviens = nhanviens;
        this.webpagesRoleses = webpagesRoleses;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USER", unique = true, nullable = false)
    public int getIdUser() {
        return this.idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ROLE")
    public WebpagesRoles getWebpagesRoles() {
        return this.webpagesRoles;
    }

    public void setWebpagesRoles(WebpagesRoles webpagesRoles) {
        this.webpagesRoles = webpagesRoles;
    }

    @Column(name = "USER_NAME", length = 50)

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "PASSWORD", length = 50)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userPassword")
    public Set<Docgia> getDocgias() {
        return this.docgias;
    }

    public void setDocgias(Set<Docgia> docgias) {
        this.docgias = docgias;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userPassword")
    public Set<Nhanvien> getNhanviens() {
        return this.nhanviens;
    }

    public void setNhanviens(Set<Nhanvien> nhanviens) {
        this.nhanviens = nhanviens;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "webpages_UsersInRoles", schema = "dbo", catalog = "QLTHUVIEN", joinColumns = {
        @JoinColumn(name = "UserId", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "RoleId", nullable = false, updatable = false)})
    public Set<WebpagesRoles> getWebpagesRoleses() {
        return this.webpagesRoleses;
    }

    public void setWebpagesRoleses(Set<WebpagesRoles> webpagesRoleses) {
        this.webpagesRoleses = webpagesRoleses;
    }

   

}
