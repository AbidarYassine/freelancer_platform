package freelance.platform.api.bean.freelancer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Test {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "test_id")
    private Long id;
    
    @Column(nullable = false)
    private String testName;

    // URLs over 2,000 characters will not work in the most web browsers
    @Column(nullable = false , length = 2000)
    private String testLink;

    public Test() {
    }

    public Test(String testName, String testLink) {
        this.testName = testName;
        this.testLink = testLink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestLink() {
        return testLink;
    }

    public void setTestLink(String testLink) {
        this.testLink = testLink;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((testLink == null) ? 0 : testLink.hashCode());
        result = prime * result + ((testName == null) ? 0 : testName.hashCode());
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
        Test other = (Test) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (testLink == null) {
            if (other.testLink != null)
                return false;
        } else if (!testLink.equals(other.testLink))
            return false;
        if (testName == null) {
            if (other.testName != null)
                return false;
        } else if (!testName.equals(other.testName))
            return false;
        return true;
    }
    
}
