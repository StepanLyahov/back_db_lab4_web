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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "hex")
    String hex;

    @Column(name = "name")
    String name;

    @OneToOne(mappedBy = "colorId")
    ListOfTask listOfTask;
}
