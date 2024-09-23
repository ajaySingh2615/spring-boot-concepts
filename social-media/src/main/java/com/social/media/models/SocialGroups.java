package com.social.media.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class SocialGroups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "groups")
    private Set<SocialUser> socialUsers = new HashSet<>();
}
