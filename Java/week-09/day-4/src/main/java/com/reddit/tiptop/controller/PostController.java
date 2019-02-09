package com.reddit.tiptop.controller;

import com.reddit.tiptop.repository.Post;
import com.reddit.tiptop.service.PostServiceImpl;
import com.reddit.tiptop.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static com.reddit.tiptop.service.DateService.timeSinceCreation;

@Controller
public class PostController {

  PostServiceImpl postService;
  UserServiceImpl userService;

  @Autowired
  PostController(PostServiceImpl postService, UserServiceImpl userService) {
    this.postService = postService;
    this.userService = userService;
  }

  @GetMapping(value = {"", "/"})
  public String mainPage(Model model) {
    for (int i = 0; i < postService.getPosts().size(); i++) {
      postService.getPosts().get(i).setTimeSinceCreation(timeSinceCreation
              (postService.getPosts().get(i).getDate()));
    }
    model.addAttribute("posts", postService.getPosts());
    return "index";
  }

  @GetMapping("/{id}/upvote")
  public String upVote(@PathVariable long id) {
    Post post = postService.getPostById(id);
    postService.editVoteByIdUp(post);
    postService.editPost(post);
    return "redirect:/";
  }

  @GetMapping("/{id}/downvote")
  public String downVote(@PathVariable long id) {
    Post post = postService.getPostById(id);
    postService.editVoteByIdDown(post);
    postService.editPost(post);
    return "redirect:/";
  }

  @GetMapping("/submit")
  public String addPost(Model model) {
    model.addAttribute("post", new Post());
    return "submit";
  }

  @PostMapping("/submit")
  public String addPost(@ModelAttribute("post") Post post) {
    postService.addPost(post);
    return "redirect:/";
  }

  @GetMapping("/{id}/edit")
  public String editPost(@PathVariable long id, Model model) {
    model.addAttribute("editedpost", postService.getPostById(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String editPost(@ModelAttribute("editedpost") Post post) {
    postService.editPost(post);
    return "redirect:/";
  }

  @GetMapping("/{id}/delete")
  public String deletePost(@PathVariable long id) {
    postService.deletePostById(id);
    return "redirect:/";
  }

}
