package com.github.fabriciolfj.springbootbe.api;

import com.github.fabriciolfj.springbootbe.domain.document.Kayak;
import com.github.fabriciolfj.springbootbe.domain.service.KayakService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kayaks")
public class KayakController {

    private final KayakService service;

    @PostMapping()
    public Mono<Kayak> add(@RequestBody final Kayak kayak){
        return service.save(kayak);
    }

    @GetMapping()
    public Flux<Kayak> getAllKayaks(){
        return service.findAll();
    }
}
