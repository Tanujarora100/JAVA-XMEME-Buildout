package com.crio.starter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@EntityScan
@Data
@EqualsAndHashCode
@AllArgsConstructor
@Document(collection = "Memes")
public class Meme {
    @Id
    private String id;
    private String name;
    private String URL;
    private String caption;
    @CreatedDate
    private LocalDateTime createdAt;

}
