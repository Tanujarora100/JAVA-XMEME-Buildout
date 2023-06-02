package com.crio.starter.repository;

import com.crio.starter.data.Meme;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemeRepository extends MongoRepository<Meme, Long> {
    public Meme findByNameAndUrlAndCaption(String name, String caption, String url);
}
