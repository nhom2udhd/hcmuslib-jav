package entity;



import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Learncommons generated by hbm2java
 */
@Entity
@Table(name="LEARNCOMMONS"
    ,schema="dbo"
    ,catalog="QLTHUVIEN"
)
public class Learncommons  implements java.io.Serializable {


     private String idLc;
     private Docgia docgia;
     private ThietbiDichvu thietbiDichvu;
     private Date ngayMuon;
     private Serializable tinhTrang;

    public Learncommons() {
    }

	
    public Learncommons(String idLc) {
        this.idLc = idLc;
    }
    public Learncommons(String idLc, Docgia docgia, ThietbiDichvu thietbiDichvu, Date ngayMuon, Serializable tinhTrang) {
       this.idLc = idLc;
       this.docgia = docgia;
       this.thietbiDichvu = thietbiDichvu;
       this.ngayMuon = ngayMuon;
       this.tinhTrang = tinhTrang;
    }
   
     @Id 

    
    @Column(name="ID_LC", unique=true, nullable=false, length=10)
    public String getIdLc() {
        return this.idLc;
    }
    
    public void setIdLc(String idLc) {
        this.idLc = idLc;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DOC_GIA")
    public Docgia getDocgia() {
        return this.docgia;
    }
    
    public void setDocgia(Docgia docgia) {
        this.docgia = docgia;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_THIET_BI")
    public ThietbiDichvu getThietbiDichvu() {
        return this.thietbiDichvu;
    }
    
    public void setThietbiDichvu(ThietbiDichvu thietbiDichvu) {
        this.thietbiDichvu = thietbiDichvu;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="NGAY_MUON", length=10)
    public Date getNgayMuon() {
        return this.ngayMuon;
    }
    
    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    
    @Column(name="TINH_TRANG")
    public Serializable getTinhTrang() {
        return this.tinhTrang;
    }
    
    public void setTinhTrang(Serializable tinhTrang) {
        this.tinhTrang = tinhTrang;
    }




}


