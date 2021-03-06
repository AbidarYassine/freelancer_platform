package freelance.platform.api.bean.freelancer;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Certification {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "certification_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="freelancer_id")
    private Freelancer freelancer;

    @Column(name = "certification_name", nullable = false)
    private String certificationName;
    
    @Column(name = "certification_provider", nullable = false)
    private String certificationProvider;

    @Column(name = "description", nullable = false, length = 1024)
    private String description;
    
    @Column(nullable = false)
    private LocalDate dateEarned;
    
    // URLs over 2,000 characters will not work in the most web browsers
    @Column(length = 2000)
    private String certifactionLink;

    public Certification() {
    }

    public Certification(Freelancer freelancer, String certificationName, String certificationProvider,
            String description, LocalDate dateEarned, String certifactionLink) {
        this.freelancer = freelancer;
        this.certificationName = certificationName;
        this.certificationProvider = certificationProvider;
        this.description = description;
        this.dateEarned = dateEarned;
        this.certifactionLink = certifactionLink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Freelancer getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Freelancer freelancer) {
        this.freelancer = freelancer;
    }

    public String getCertificationName() {
        return certificationName;
    }

    public void setCertificationName(String certificationName) {
        this.certificationName = certificationName;
    }

    public String getCertificationProvider() {
        return certificationProvider;
    }

    public void setCertificationProvider(String certificationProvider) {
        this.certificationProvider = certificationProvider;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateEarned() {
        return dateEarned;
    }

    public void setDateEarned(LocalDate dateEarned) {
        this.dateEarned = dateEarned;
    }

    public String getCertifactionLink() {
        return certifactionLink;
    }

    public void setCertifactionLink(String certifactionLink) {
        this.certifactionLink = certifactionLink;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((certifactionLink == null) ? 0 : certifactionLink.hashCode());
        result = prime * result + ((certificationName == null) ? 0 : certificationName.hashCode());
        result = prime * result + ((certificationProvider == null) ? 0 : certificationProvider.hashCode());
        result = prime * result + ((dateEarned == null) ? 0 : dateEarned.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((freelancer == null) ? 0 : freelancer.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Certification other = (Certification) obj;
        if (certifactionLink == null) {
            if (other.certifactionLink != null)
                return false;
        } else if (!certifactionLink.equals(other.certifactionLink))
            return false;
        if (certificationName == null) {
            if (other.certificationName != null)
                return false;
        } else if (!certificationName.equals(other.certificationName))
            return false;
        if (certificationProvider == null) {
            if (other.certificationProvider != null)
                return false;
        } else if (!certificationProvider.equals(other.certificationProvider))
            return false;
        if (dateEarned == null) {
            if (other.dateEarned != null)
                return false;
        } else if (!dateEarned.equals(other.dateEarned))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (freelancer == null) {
            if (other.freelancer != null)
                return false;
        } else if (!freelancer.equals(other.freelancer))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
