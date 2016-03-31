package bit.wym.entity;

/**
 * Created by Midouy on 2016/3/31.
 */

// Generated 2015-2-3 10:43:00 by Hibernate Tools 4.0.0

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

/**
 * SshAuthority generated by hbm2java
 */
@Entity
@Table(name = "ssh_authority", catalog = "work")
public class SshAuthority implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1495787682343110812L;
    private String id;
    private String name;
    private Set<SshRole> sshRoles = new HashSet<SshRole>(0);

    public SshAuthority() {

    }

    public SshAuthority(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public SshAuthority(String id, String name, Set<SshRole> sshRoles) {
        this.id = id;
        this.name = name;
        this.sshRoles = sshRoles;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false, length = 36)
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ssh_role_authority", catalog = "work", joinColumns = { @JoinColumn(name = "authority_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "role_id", nullable = false, updatable = false) })
    public Set<SshRole> getSshRoles() {
        return this.sshRoles;
    }

    public void setSshRoles(Set<SshRole> sshRoles) {
        this.sshRoles = sshRoles;
    }

}

