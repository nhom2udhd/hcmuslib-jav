package entity;
// Generated Dec 12, 2014 9:07:56 PM by Hibernate Tools 3.6.0


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ThietbiDichvu generated by hbm2java
 */
@Entity
@Table(name="THIETBI_DICHVU"
    ,schema="dbo"
    ,catalog="QLTHUVIEN"
)
public class ThietbiDichvu  implements java.io.Serializable {


     private String idThietBi;
     private Serializable tenThietBi;
     private Date ngayNhap;
     private Serializable tinhTrang;
     private Set<Learncommons> learncommonses = new HashSet<Learncommons>(0);

    public ThietbiDichvu() {
    }

	
    public ThietbiDichvu(String idThietBi) {
        this.idThietBi = idThietBi;
    }
    public ThietbiDichvu(String idThietBi, Serializable tenThietBi, Date ngayNhap, Serializable tinhTrang, Set<Learncommons> learncommonses) {
       this.idThietBi = idThietBi;
       this.tenThietBi = tenThietBi;
       this.ngayNhap = ngayNhap;
       this.tinhTrang = tinhTrang;
       this.learncommonses = learncommonses;
    }
   
     @Id 

    
    @Column(name="ID_THIET_BI", unique=true, nullable=false, length=10)
    public String getIdThietBi() {
        return this.idThietBi;
    }
    
    public void setIdThietBi(String idThietBi) {
        this.idThietBi = idThietBi;
    }

    
    @Column(name="TEN_THIET_BI")
    public Serializable getTenThietBi() {
        return this.tenThietBi;
    }
    
    public void setTenThietBi(Serializable tenThietBi) {
        this.tenThietBi = tenThietBi;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="NGAY_NHAP", length=10)
    public Date getNgayNhap() {
        return this.ngayNhap;
    }
    
    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    
    @Column(name="TINH_TRANG")
    public Serializable getTinhTrang() {
        return this.tinhTrang;
    }
    
    public void setTinhTrang(Serializable tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="thietbiDichvu")
    public Set<Learncommons> getLearncommonses() {
        return this.learncommonses;
    }
    
    public void setLearncommonses(Set<Learncommons> learncommonses) {
        this.learncommonses = learncommonses;
    }




}


