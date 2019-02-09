package mypackage;

import java.util.ArrayList;
import java.util.List;

public class Blog {
  private List<BlogPost> blog;

  Blog () {
    blog = new ArrayList<>();
  }

  public void add(BlogPost blogPost) {
    blog.add(blogPost);
  }

  public void removeItem(int index) {
     blog.remove(index);
  }

  public void update(int index, BlogPost blogPost) {
    blog.set(index, blogPost);
  }

  public void returnBlogPost(int index) {
    System.out.println(blog.get(index).authorName);
    System.out.println(blog.get(index).title);
    System.out.println(blog.get(index).text);
    System.out.println("Published on: " + blog.get(index).publicationDate + "\n");
  }
}
