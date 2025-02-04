package entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@Table(name = "test")
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @NonNull
    Boolean isStarted;

    @NonNull
    String name;

    @ManyToOne
    //@JoinColumn(table = "psychologist")
    PsychologistEntity psychologist;


}
