package freelance.platform.api.bean.freelancer;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TestResult {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "test_result_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "freelancer_id")
    private Freelancer freelancer;

    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;

    @Column(nullable = false)
    private LocalDateTime startTime;

    private LocalDateTime endTime;

    // URLs over 2,000 characters will not work in the most web browsers
    @Column(length = 2000)
    private String testResultLink;

    private Double score;

    private Boolean dispalyOnProfile;

    public TestResult() {
    }

    public TestResult(Freelancer freelancer, Test test, LocalDateTime startTime, LocalDateTime endTime,
            String testResultLink, Double score, Boolean dispalyOnProfile) {
        this.freelancer = freelancer;
        this.test = test;
        this.startTime = startTime;
        this.endTime = endTime;
        this.testResultLink = testResultLink;
        this.score = score;
        this.dispalyOnProfile = dispalyOnProfile;
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

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getTestResultLink() {
        return testResultLink;
    }

    public void setTestResultLink(String testResultLink) {
        this.testResultLink = testResultLink;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Boolean getDispalyOnProfile() {
        return dispalyOnProfile;
    }

    public void setDispalyOnProfile(Boolean dispalyOnProfile) {
        this.dispalyOnProfile = dispalyOnProfile;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dispalyOnProfile == null) ? 0 : dispalyOnProfile.hashCode());
        result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
        result = prime * result + ((freelancer == null) ? 0 : freelancer.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((score == null) ? 0 : score.hashCode());
        result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
        result = prime * result + ((test == null) ? 0 : test.hashCode());
        result = prime * result + ((testResultLink == null) ? 0 : testResultLink.hashCode());
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
        TestResult other = (TestResult) obj;
        if (dispalyOnProfile == null) {
            if (other.dispalyOnProfile != null)
                return false;
        } else if (!dispalyOnProfile.equals(other.dispalyOnProfile))
            return false;
        if (endTime == null) {
            if (other.endTime != null)
                return false;
        } else if (!endTime.equals(other.endTime))
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
        if (score == null) {
            if (other.score != null)
                return false;
        } else if (!score.equals(other.score))
            return false;
        if (startTime == null) {
            if (other.startTime != null)
                return false;
        } else if (!startTime.equals(other.startTime))
            return false;
        if (test == null) {
            if (other.test != null)
                return false;
        } else if (!test.equals(other.test))
            return false;
        if (testResultLink == null) {
            if (other.testResultLink != null)
                return false;
        } else if (!testResultLink.equals(other.testResultLink))
            return false;
        return true;
    }
    
}
