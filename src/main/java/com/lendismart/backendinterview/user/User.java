package com.lendismart.backendinterview.user;

import com.lendismart.backendinterview.post.Post;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * A User represents a user account in our fake Instagram example.
 *
 * A User must have:
 *
 * - a username.
 * - a set of {@link Post}.
 * - a creation timestamp.
 * - a country code.
 * - a phone number.
 */

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Post> posts = new HashSet<>();

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime creationTimestamp;

    @Column(nullable = false, length = 3)
    private String countryCode;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    public User() {
    }

    public User(String username, String countryCode, String phoneNumber) {
        this.username = username;
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    public void addPost(Post post) {
        posts.add(post);
        post.setUser(this);
    }
}
