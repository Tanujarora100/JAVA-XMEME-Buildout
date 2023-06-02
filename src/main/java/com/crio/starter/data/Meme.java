package com.crio.starter.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Data
@EqualsAndHashCode
@Document(collection = "Memes")
public class Meme {
    @Id
    private long id;
    private String name;
    private String url;
    private String caption;

}
