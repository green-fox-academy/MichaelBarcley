package mypackage;

public class Main {

  public static void main(String[] args) {
    //BlogPost exercise
    BlogPost post1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2010.10.10.");
    BlogPost post2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2000.05.04.");
    BlogPost post3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");

    //Blog exercise
    Blog myBlog = new Blog();
    myBlog.add(post1);
    myBlog.add(post2);
    myBlog.add(post3);
    myBlog.returnBlogPost(2);

    BlogPost post4 = new BlogPost("Tony Stark", "I am Iron Man", "You already seen this flying guy several times around the World saving people. Yeah... so that's me!", "2011.11.14");
    myBlog.update(2, post4);
    myBlog.returnBlogPost(2);
  }
}
