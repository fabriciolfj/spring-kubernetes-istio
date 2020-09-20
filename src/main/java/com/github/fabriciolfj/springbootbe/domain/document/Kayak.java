package com.github.fabriciolfj.springbootbe.domain.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "kayaks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kayak {

    @Id
    private String id;
    private String name;
    private String owner;
    private Number value;
    private String makeModel;
}