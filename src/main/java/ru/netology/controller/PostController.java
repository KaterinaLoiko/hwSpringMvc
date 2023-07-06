package ru.netology.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import ru.netology.model.Post;
import ru.netology.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {
  private final PostService service;

  public PostController(PostService service) {
    this.service = service;
  }

  @GetMapping
  public List<Post> all() {
     return service.all();
  }

  @GetMapping("/{id}")
  public void getById(@PathVariable long id) {
    service.getById(id);
  }

  @PostMapping
  public void save(@RequestBody Post post) {
    service.save(post);
  }

  @DeleteMapping("/{id}")
  public void removeById(@PathVariable long id) {
    service.removeById(id);
  }
}
