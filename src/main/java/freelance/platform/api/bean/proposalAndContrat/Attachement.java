package freelance.platform.api.bean.proposalAndContrat;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "attachements")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Attachement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "attachement_id")
    private Long id;

    @Column(nullable = false)
    private String attachementLink;

    @ManyToOne
    @JoinColumn(name = "message_id", nullable = false)
    private Message message;


}
