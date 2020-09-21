package com.github.fabriciolfj.springbootbe;

import com.github.fabriciolfj.springbootbe.domain.document.Kayak;
import com.github.fabriciolfj.springbootbe.domain.repository.KayakRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@SpringBootApplication
public class SpringbootbeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootbeApplication.class, args);
    }

    @Bean
    ApplicationRunner init(KayakRepository repository) {
        var list = List.of(new Kayak(null, "Sea", "Andrew", 300.12, "NDK"),
                new Kayak(null,"Creek", "Andrew", 100.75, "Piranha"),
                new Kayak(null, "Loaner", "Andrew", 75, "Necky"));

        return args -> repository.deleteAll()
                .thenMany(
                        Flux.fromIterable(list)
                                .flatMap(repository::save)
                ).thenMany(repository.findAll())
                .subscribe(kayak -> System.out.println("Saving " + kayak));
    }

}
