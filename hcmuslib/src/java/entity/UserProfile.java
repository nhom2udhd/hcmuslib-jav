package entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * UserProfile generated by hbm2java
 */
@Entity
@Table(name="UserProfile"
    ,schema="dbo"
    ,catalog="QLTHUVIEN"
    , uniqueConstraints = @UniqueConstraint(columnNames="UserName") 
)
public class UserProfile  implements java.io.Serializable {


     private int userId;
     private Serializable userName;

    public UserProfile() {
    }

    public UserProfile(int userId, Serializable userName) {
       this.userId = userId;
       this.userName = userName;
    }
   
     @Id 

    
    @Column(name="UserId", unique=true, nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    
    @Column(name="UserName", unique=true, nullable=false)
    public Serializable getUserName() {
        return this.userName;
    }
    
    public void setUserName(Serializable userName) {
        this.userName = userName;
    }




}


