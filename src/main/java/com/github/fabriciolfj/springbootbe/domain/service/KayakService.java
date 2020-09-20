package com.github.fabriciolfj.springbootbe.domain.service;

import com.github.fabriciolfj.springbootbe.domain.document.Kayak;
import com.github.fabriciolfj.springbootbe.domain.repository.KayakRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class KayakService {

    private final KayakRepository kayakRepository;

    public Mono<Kayak> save(final Kayak kayak) {
        return kayakRepository.save(kayak);
    }

    public Flux<Kayak> findAll() {
        return kayakRepository.findAll();
    }
}
