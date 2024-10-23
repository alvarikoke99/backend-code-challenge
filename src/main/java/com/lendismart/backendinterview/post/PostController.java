package com.lendismart.backendinterview.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final WebClient webClient;

    public PostController(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://jsonplaceholder.typicode.com/").build();
    }
    /*{
        "userId": 1,
            "id": 1,
            "title": "delectus aut autem",
            "completed": false
    }*/
    @GetMapping("/{post_id}/comments")
    public List<Comment> getComments(@PathVariable("post_id") String postId) {
        return webClient.get()
                .uri("posts/" + postId + "/comments")
                .retrieve()
                .bodyToFlux(Comment.class).collectList().block();
    }
}
