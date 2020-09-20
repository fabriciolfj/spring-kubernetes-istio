package com.github.fabriciolfj.springbootbe.domain.repository;

import com.github.fabriciolfj.springbootbe.domain.document.Kayak;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

import java.util.List;

public interface KayakRepository extends ReactiveMongoRepository<Kayak, String> {
}
