package com.lendismart.backendinterview.post;

import com.lendismart.backendinterview.like.Like;
import com.lendismart.backendinterview.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * A Post is something a user uploads, therefore it belongs to a user.
 *
 * A Post must have:
 *  - a url that points to an image.
 *  - a set of {@link Like}.
 *  - a creation timestamp.
 */


@Entity
@Table(name = "posts")
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Like> likes = new HashSet<>();

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime creationTimestamp;

    public Post() {
    }

    public Post(String imageUrl, User user) {
        this.imageUrl = imageUrl;
        this.user = user;
    }

    public void addLike(Like like) {
        likes.add(like);
        like.setPost(this);
    }
}