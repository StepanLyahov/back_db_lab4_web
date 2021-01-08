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

    @Column(name = "number_2")
    String number2;

    @OneToOne(cascade = CascadeType.ALL)
    Image logo;

    @OneToOne(cascade = CascadeType.ALL)
    Image headerImg;

    @OneToOne(cascade = CascadeType.ALL)
    Image logoVk;

    @OneToOne(cascade = CascadeType.ALL)
    Image logoInstagram;

    @OneToOne(cascade = CascadeType.ALL)
    Image logoTwitter;

    @OneToOne(cascade = CascadeType.ALL)
    Image logoFacebook;

    @OneToOne(cascade = CascadeType.ALL)
    Image logoTelegram;

    @Column(name = "url_vk")
    String urlVk;

    @Column(name = "url_instagram")
    String urlInstagram;

    @Column(name = "url_twitter")
    String urlTwitter;

    @Column(name = "url_facebook")
    String urlFacebook;

    @Column(name = "url_telegram")
    String urlTelegram;

    @Column(name = "description")
    @Lob
    String description;
}
