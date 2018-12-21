package com.reddit.tiptop.service;

import com.reddit.tiptop.repository.Post;
import java.util.List;

public interface PostService {

  List<Post> getPosts();
  Post getPostById(long id);
  void addPost(Post post);
  void editPost(Post post);
  void editVoteByIdUp(Post post);
  void editVoteByIdDown(Post post);
  void deletePostById(long id);
}
