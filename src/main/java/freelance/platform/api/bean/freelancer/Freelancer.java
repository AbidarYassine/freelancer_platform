package freelance.platform.api.bean.freelancer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import freelance.platform.api.bean.Skill;
import freelance.platform.api.bean.UserAccount;

@Entity
public class Freelancer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "freelancer_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "account_id")
    private UserAccount account;
    
    @Column(nullable = false)
    private LocalDate registrationDate;

    // County (Ex : Morroco)
    @Column(nullable = false)
    private String location;

    @Column(length = 512)
    private String bio;

    @OneToMany(mappedBy = "freelancer")
    private List<Certification> certifications;

    @ElementCollection
    @JoinTable(name = "has_skill",
        joinColumns = { @JoinColumn(name = "freelancer_id" , referencedColumnName = "freelancer_id" ) },
        inverseJoinColumns = { @JoinColumn(name = "skill_id", referencedColumnName = "skill_id") })
    private List<Skill> skills;
    
    public Freelancer() {
    }

    public Freelancer(UserAccount account, LocalDate registrationDate, String location, String bio)
    {
        this.account = account;
        this.registrationDate = registrationDate;
        this.location = location;
        this.bio = bio;
        this.certifications = new ArrayList<Certification>();
        this.skills = new ArrayList<Skill>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserAccount getAccount() {
        return account;
    }

    public void setAccount(UserAccount account) {
        this.account = account;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Certification> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<Certification> certifications) {
        this.certifications = certifications;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((account == null) ? 0 : account.hashCode());
        result = prime * result + ((bio == null) ? 0 : bio.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        result = prime * result + ((registrationDate == null) ? 0 : registrationDate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Freelancer other = (Freelancer) obj;
        if (account == null) {
            if (other.account != null)
                return false;
        } else if (!account.equals(other.account))
            return false;
        if (bio == null) {
            if (other.bio != null)
                return false;
        } else if (!bio.equals(other.bio))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (location == null) {
            if (other.location != null)
                return false;
        } else if (!location.equals(other.location))
            return false;
        if (registrationDate == null) {
            if (other.registrationDate != null)
                return false;
        } else if (!registrationDate.equals(other.registrationDate))
            return false;
        return true;
    }
    
}