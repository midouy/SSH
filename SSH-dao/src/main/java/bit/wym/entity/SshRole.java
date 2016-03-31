package bit.wym.entity;

/**
 * Created by Midouy on 2016/3/31.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * SshRole generated by hbm2java
 */
@Entity
@Table(name = "ssh_role", catalog = "work")
public class SshRole implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -2341818593980450829L;
    private String id;
    private String name;
    private Set<SshUser> sshUsers = new HashSet<SshUser>(0);
    private Set<SshAuthority> sshAuthorities = new HashSet<SshAuthority>(0);

    public SshRole() {

    }

    public SshRole(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public SshRole(String id, String name, Set<SshUser> sshUsers,
                    Set<SshAuthority> sshAuthorities) {
        this.id = id;
        this.name = name;
        this.sshUsers = sshUsers;
        this.sshAuthorities = sshAuthorities;
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
    @JoinTable(name = "ssh_user_role", catalog = "work", joinColumns = { @JoinColumn(name = "role_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "user_id", nullable = false, updatable = false) })
    public Set<SshUser> getSshUsers() {
        return this.sshUsers;
    }

    public void setSshUsers(Set<SshUser> sshUsers) {
        this.sshUsers = sshUsers;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ssh_role_authority", catalog = "work", joinColumns = { @JoinColumn(name = "role_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "authority_id", nullable = false, updatable = false) })
    public Set<SshAuthority> getSshAuthorities() {
        return this.sshAuthorities;
    }

    public void setSshAuthorities(Set<SshAuthority> sshAuthorities) {
        this.sshAuthorities = sshAuthorities;
    }

}
