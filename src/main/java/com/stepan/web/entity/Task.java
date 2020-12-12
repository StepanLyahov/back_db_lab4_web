package com.stepan.web.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "task")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "text")
    String text;

    @Column(name = "completed")
    Boolean completed;

    @ManyToOne
    @JoinColumn(name = "list_id")
    ListOfTask listId;
}
