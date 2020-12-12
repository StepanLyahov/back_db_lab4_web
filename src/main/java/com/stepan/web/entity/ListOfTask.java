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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @OneToOne
    @JoinColumn(name = "color_id")
    Color colorId;

    @Column(name = "name")
    String name;

    @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "listId")
    List<Task> tasks;
}
