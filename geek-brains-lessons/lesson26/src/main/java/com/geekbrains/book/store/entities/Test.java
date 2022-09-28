package store.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "fpch_k3")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pipeline_status")
    private String pipelineStatus;

    @Column(name = "dataset")
    private String dataset;

    @Column(name = "date_create")
    private LocalDateTime dateCreate;

    @Column(name = "date_modify")
    private LocalDateTime dateModify;
}
