package entity;
// Generated Nov 24, 2014 9:54:24 PM by Hibernate Tools 3.6.0


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Bmnhandechinh generated by hbm2java
 */
@Entity
@Table(name="BMNHANDECHINH"
    ,schema="dbo"
    ,catalog="QLTHUVIEN"
)
public class Bmnhandechinh  implements java.io.Serializable {


     private String idNhanDe;
     private Serializable nhanDeChinh;
     private Set<Sach> saches = new HashSet<Sach>(0);

    public Bmnhandechinh() {
    }

	
    public Bmnhandechinh(String idNhanDe) {
        this.idNhanDe = idNhanDe;
    }
    public Bmnhandechinh(String idNhanDe, Serializable nhanDeChinh, Set<Sach> saches) {
       this.idNhanDe = idNhanDe;
       this.nhanDeChinh = nhanDeChinh;
       this.saches = saches;
    }
   
     @Id 

    
    @Column(name="ID_NHAN_DE", unique=true, nullable=false, length=10)
    public String getIdNhanDe() {
        return this.idNhanDe;
    }
    
    public void setIdNhanDe(String idNhanDe) {
        this.idNhanDe = idNhanDe;
    }

    
    @Column(name="NHAN_DE_CHINH")
    public Serializable getNhanDeChinh() {
        return this.nhanDeChinh;
    }
    
    public void setNhanDeChinh(Serializable nhanDeChinh) {
        this.nhanDeChinh = nhanDeChinh;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bmnhandechinh")
    public Set<Sach> getSaches() {
        return this.saches;
    }
    
    public void setSaches(Set<Sach> saches) {
        this.saches = saches;
    }




}

