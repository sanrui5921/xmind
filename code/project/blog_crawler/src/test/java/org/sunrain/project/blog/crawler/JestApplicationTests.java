package org.sunrain.project.blog.crawler;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.sunrain.project.blog.crawler.persistence.model.Blog;
import org.sunrain.project.blog.crawler.persistence.repository.es.BlogEsRepository;

@SpringBootTest
public class JestApplicationTests {

    @Autowired
    BlogEsRepository blogEsRepository;

    @Test
    public void saveTest() {
        Blog blog = new Blog();
        blog.setTitle("test");
        blog.setContent("test");
        blog.setRefer("test");
        blogEsRepository.save(blog);
    }
}