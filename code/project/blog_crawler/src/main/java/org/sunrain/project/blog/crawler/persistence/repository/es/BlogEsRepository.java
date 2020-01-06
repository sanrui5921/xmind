package org.sunrain.project.blog.crawler.persistence.repository.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.sunrain.project.blog.crawler.persistence.model.Blog;

public interface BlogEsRepository extends ElasticsearchRepository<Blog, Long> {

}
