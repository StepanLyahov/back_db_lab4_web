package com.stepan.web.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "list_of_task")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ListOfTask {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "color_id", unique = true)
    Color colorId;

    @Column(name = "name")
    String name;

    @OneToMany(mappedBy = "task_id")
    List<Task> tasks;
}
