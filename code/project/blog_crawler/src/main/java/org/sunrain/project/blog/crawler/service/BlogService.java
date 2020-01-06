package org.sunrain.project.blog.crawler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sunrain.project.blog.crawler.persistence.repository.es.BlogEsRepository;

@Service
public class BlogService {

    @Autowired
    BlogEsRepository blogEsRepository;



}
