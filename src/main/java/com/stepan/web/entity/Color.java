package com.stepan.web.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "color")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @Column(name = "hex")
    String hex;

    @Column(name = "name")
    String name;

    @OneToOne(mappedBy = "color_id")
    ListOfTask listOfTask;
}
