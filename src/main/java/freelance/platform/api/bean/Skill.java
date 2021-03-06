package freelance.platform.api.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import freelance.platform.api.bean.freelancer.Freelancer;

@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skill_id")
    private Long id;

    @Column(name = "skill_name", unique = true , nullable = false)
    private String skillName;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "skills")
    private List<Freelancer> freelancers;

    public Skill() {
    }

    public Skill(String skillName) {
        this.skillName = skillName;
        this.freelancers = new ArrayList<Freelancer>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public List<Freelancer> getFreelancers() {
        return freelancers;
    }

    public void setFreelancers(List<Freelancer> freelancers) {
        this.freelancers = freelancers;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((skillName == null) ? 0 : skillName.hashCode());
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
        Skill other = (Skill) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (skillName == null) {
            if (other.skillName != null)
                return false;
        } else if (!skillName.equals(other.skillName))
            return false;
        return true;
    }

}
