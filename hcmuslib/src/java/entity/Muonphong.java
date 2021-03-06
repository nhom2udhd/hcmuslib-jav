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
 * Muonphong generated by hbm2java
 */
@Entity
@Table(name="MUONPHONG"
    ,schema="dbo"
    ,catalog="QLTHUVIEN"
)
public class Muonphong  implements java.io.Serializable {


     private String idMuonPhong;
     private Docgia docgia;
     private Phong phong;
     private Date ngayMuon;
     private Serializable tinhTrang;

    public Muonphong() {
    }

	
    public Muonphong(String idMuonPhong) {
        this.idMuonPhong = idMuonPhong;
    }
    public Muonphong(String idMuonPhong, Docgia docgia, Phong phong, Date ngayMuon, Serializable tinhTrang) {
       this.idMuonPhong = idMuonPhong;
       this.docgia = docgia;
       this.phong = phong;
       this.ngayMuon = ngayMuon;
       this.tinhTrang = tinhTrang;
    }
   
     @Id 

    
    @Column(name="ID_MUON_PHONG", unique=true, nullable=false, length=10)
    public String getIdMuonPhong() {
        return this.idMuonPhong;
    }
    
    public void setIdMuonPhong(String idMuonPhong) {
        this.idMuonPhong = idMuonPhong;
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
    @JoinColumn(name="ID_PHONG")
    public Phong getPhong() {
        return this.phong;
    }
    
    public void setPhong(Phong phong) {
        this.phong = phong;
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


