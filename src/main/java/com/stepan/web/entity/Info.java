package com.stepan.web.entity;


import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "info")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Info {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @Column(name = "number")
    String number;

    @OneToOne
    Image logo;

    @Column(name = "description")
    String description;
}
