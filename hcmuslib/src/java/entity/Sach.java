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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sach generated by hbm2java
 */
@Entity
@Table(name="SACH"
    ,schema="dbo"
    ,catalog="QLTHUVIEN"
)
public class Sach  implements java.io.Serializable {


     private String idSach;
     private Bmnhandechinh bmnhandechinh;
     private Bmnxb bmnxb;
     private Bmsophanloai bmsophanloai;
     private Bmtacgia bmtacgia;
     private Bmtendemuc bmtendemuc;
     private Date ngayNhap;
     private Serializable nhanDeSongSong;
     private Serializable nhanDeKhac;
     private Date namXuatBan;
     private String maVach;
     private Integer lanXuatBan;
     private String noiXuatBan;
     private Integer soTrangDau;
     private Serializable noiDung;
     private Serializable minhHoa;
     private Serializable khoSach;
     private Serializable tungThu;
     private Serializable ngonNgu;
     private Serializable isbn;
     private Serializable banQuyen;
     private Serializable ghiChu;
     private Set<Muontaicho> muontaichos = new HashSet<Muontaicho>(0);
     private Set<Luuhanhsach> luuhanhsaches = new HashSet<Luuhanhsach>(0);

    public Sach() {
    }

	
    public Sach(String idSach) {
        this.idSach = idSach;
    }
    public Sach(String idSach, Bmnhandechinh bmnhandechinh, Bmnxb bmnxb, Bmsophanloai bmsophanloai, Bmtacgia bmtacgia, Bmtendemuc bmtendemuc, Date ngayNhap, Serializable nhanDeSongSong, Serializable nhanDeKhac, Date namXuatBan, String maVach, Integer lanXuatBan, String noiXuatBan, Integer soTrangDau, Serializable noiDung, Serializable minhHoa, Serializable khoSach, Serializable tungThu, Serializable ngonNgu, Serializable isbn, Serializable banQuyen, Serializable ghiChu, Set<Muontaicho> muontaichos, Set<Luuhanhsach> luuhanhsaches) {
       this.idSach = idSach;
       this.bmnhandechinh = bmnhandechinh;
       this.bmnxb = bmnxb;
       this.bmsophanloai = bmsophanloai;
       this.bmtacgia = bmtacgia;
       this.bmtendemuc = bmtendemuc;
       this.ngayNhap = ngayNhap;
       this.nhanDeSongSong = nhanDeSongSong;
       this.nhanDeKhac = nhanDeKhac;
       this.namXuatBan = namXuatBan;
       this.maVach = maVach;
       this.lanXuatBan = lanXuatBan;
       this.noiXuatBan = noiXuatBan;
       this.soTrangDau = soTrangDau;
       this.noiDung = noiDung;
       this.minhHoa = minhHoa;
       this.khoSach = khoSach;
       this.tungThu = tungThu;
       this.ngonNgu = ngonNgu;
       this.isbn = isbn;
       this.banQuyen = banQuyen;
       this.ghiChu = ghiChu;
       this.muontaichos = muontaichos;
       this.luuhanhsaches = luuhanhsaches;
    }
   
     @Id 

    
    @Column(name="ID_SACH", unique=true, nullable=false, length=10)
    public String getIdSach() {
        return this.idSach;
    }
    
    public void setIdSach(String idSach) {
        this.idSach = idSach;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="NHAN_DE_CHINH")
    public Bmnhandechinh getBmnhandechinh() {
        return this.bmnhandechinh;
    }
    
    public void setBmnhandechinh(Bmnhandechinh bmnhandechinh) {
        this.bmnhandechinh = bmnhandechinh;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="NHA_XUAT_BAN")
    public Bmnxb getBmnxb() {
        return this.bmnxb;
    }
    
    public void setBmnxb(Bmnxb bmnxb) {
        this.bmnxb = bmnxb;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SO_PHAN_LOAI")
    public Bmsophanloai getBmsophanloai() {
        return this.bmsophanloai;
    }
    
    public void setBmsophanloai(Bmsophanloai bmsophanloai) {
        this.bmsophanloai = bmsophanloai;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TAC_GIA")
    public Bmtacgia getBmtacgia() {
        return this.bmtacgia;
    }
    
    public void setBmtacgia(Bmtacgia bmtacgia) {
        this.bmtacgia = bmtacgia;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TEN_DE_MUC")
    public Bmtendemuc getBmtendemuc() {
        return this.bmtendemuc;
    }
    
    public void setBmtendemuc(Bmtendemuc bmtendemuc) {
        this.bmtendemuc = bmtendemuc;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="NGAY_NHAP", length=10)
    public Date getNgayNhap() {
        return this.ngayNhap;
    }
    
    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    
    @Column(name="NHAN_DE_SONG_SONG")
    public Serializable getNhanDeSongSong() {
        return this.nhanDeSongSong;
    }
    
    public void setNhanDeSongSong(Serializable nhanDeSongSong) {
        this.nhanDeSongSong = nhanDeSongSong;
    }

    
    @Column(name="NHAN_DE_KHAC")
    public Serializable getNhanDeKhac() {
        return this.nhanDeKhac;
    }
    
    public void setNhanDeKhac(Serializable nhanDeKhac) {
        this.nhanDeKhac = nhanDeKhac;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="NAM_XUAT_BAN", length=10)
    public Date getNamXuatBan() {
        return this.namXuatBan;
    }
    
    public void setNamXuatBan(Date namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    
    @Column(name="MA_VACH", length=12)
    public String getMaVach() {
        return this.maVach;
    }
    
    public void setMaVach(String maVach) {
        this.maVach = maVach;
    }

    
    @Column(name="LAN_XUAT_BAN")
    public Integer getLanXuatBan() {
        return this.lanXuatBan;
    }
    
    public void setLanXuatBan(Integer lanXuatBan) {
        this.lanXuatBan = lanXuatBan;
    }

    
    @Column(name="NOI_XUAT_BAN", length=50)
    public String getNoiXuatBan() {
        return this.noiXuatBan;
    }
    
    public void setNoiXuatBan(String noiXuatBan) {
        this.noiXuatBan = noiXuatBan;
    }

    
    @Column(name="SO_TRANG_DAU")
    public Integer getSoTrangDau() {
        return this.soTrangDau;
    }
    
    public void setSoTrangDau(Integer soTrangDau) {
        this.soTrangDau = soTrangDau;
    }

    
    @Column(name="NOI_DUNG")
    public Serializable getNoiDung() {
        return this.noiDung;
    }
    
    public void setNoiDung(Serializable noiDung) {
        this.noiDung = noiDung;
    }

    
    @Column(name="MINH_HOA")
    public Serializable getMinhHoa() {
        return this.minhHoa;
    }
    
    public void setMinhHoa(Serializable minhHoa) {
        this.minhHoa = minhHoa;
    }

    
    @Column(name="KHO_SACH")
    public Serializable getKhoSach() {
        return this.khoSach;
    }
    
    public void setKhoSach(Serializable khoSach) {
        this.khoSach = khoSach;
    }

    
    @Column(name="TUNG_THU")
    public Serializable getTungThu() {
        return this.tungThu;
    }
    
    public void setTungThu(Serializable tungThu) {
        this.tungThu = tungThu;
    }

    
    @Column(name="NGON_NGU")
    public Serializable getNgonNgu() {
        return this.ngonNgu;
    }
    
    public void setNgonNgu(Serializable ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    
    @Column(name="ISBN")
    public Serializable getIsbn() {
        return this.isbn;
    }
    
    public void setIsbn(Serializable isbn) {
        this.isbn = isbn;
    }

    
    @Column(name="BAN_QUYEN")
    public Serializable getBanQuyen() {
        return this.banQuyen;
    }
    
    public void setBanQuyen(Serializable banQuyen) {
        this.banQuyen = banQuyen;
    }

    
    @Column(name="GHI_CHU")
    public Serializable getGhiChu() {
        return this.ghiChu;
    }
    
    public void setGhiChu(Serializable ghiChu) {
        this.ghiChu = ghiChu;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="sach")
    public Set<Muontaicho> getMuontaichos() {
        return this.muontaichos;
    }
    
    public void setMuontaichos(Set<Muontaicho> muontaichos) {
        this.muontaichos = muontaichos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="sach")
    public Set<Luuhanhsach> getLuuhanhsaches() {
        return this.luuhanhsaches;
    }
    
    public void setLuuhanhsaches(Set<Luuhanhsach> luuhanhsaches) {
        this.luuhanhsaches = luuhanhsaches;
    }




}


