package freelance.platform.api.bean.proposalAndContrat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;

public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "message_time", nullable = false)
    private Instant message_time;


    @Column(name = "messageText", nullable = false)
    private String messageText;

    @OneToMany(mappedBy = "message")
    List<Attachement> attachements;
}
