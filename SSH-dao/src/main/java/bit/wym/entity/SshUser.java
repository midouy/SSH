package bit.wym.entity;

/**
 * Created by Midouy on 2016/3/31.
 */
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * SshUser generated by hbm2java
 */
@Entity
@Table(name = "acct_user", catalog = "work")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SshUser implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 6980093847795726310L;
    private String id;
    private String nickName;
    private String telephone;
    private Date registerTime;
    private Set<SshRole> acctRoles = new HashSet<SshRole>(0);

    public SshUser() {

    }

    public SshUser(String id, String nickName) {
        this.id = id;
        this.nickName = nickName;
    }

    public SshUser(String id, String nickName, String telephone,
                    Date registerTime, Set<SshRole> acctRoles) {
        this.id = id;
        this.nickName = nickName;
        this.telephone = telephone;
        this.registerTime = registerTime;
        this.acctRoles = acctRoles;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false, length = 36)
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "nick_name", nullable = false)
    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Column(name = "telephone")
    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "register_time", length = 19)
    public Date getRegisterTime() {
        return this.registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    @JsonIgnoreProperties(value={"acctUsers", "acctAuthorities"})
    @ManyToMany(fetch = FetchType.LAZY)
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JoinTable(name = "acct_user_role", catalog = "work", joinColumns = { @JoinColumn(name = "user_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "role_id", nullable = false, updatable = false) })
    public Set<SshRole> getSshRoles() {
        return this.acctRoles;
    }

    public void setSshRoles(Set<SshRole> acctRoles) {
        this.acctRoles = acctRoles;
    }

}