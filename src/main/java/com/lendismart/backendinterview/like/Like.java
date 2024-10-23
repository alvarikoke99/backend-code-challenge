package com.lendismart.backendinterview.like;

import com.lendismart.backendinterview.post.Post;
import com.lendismart.backendinterview.user.User;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

/**
 * A Like belongs to a {@link Post}
 *
 * A Like must have
 *  - a {@link User} indicating who gave the like
 *  - a creation timestamp.
 */


@Entity
@Table(name = "likes")
@Getter
@Setter
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime creationTimestamp;

    public Like() {
    }

    public Like(Post post, User user) {
        this.post = post;
        this.user = user;
    }
}

