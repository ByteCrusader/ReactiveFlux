package ru.tinkoff.reactor.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.tinkoff.reactor.domain.Message;
import ru.tinkoff.reactor.repo.MessageRepository;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository repository;

    public Flux<Message> getMessagesList() {
        return repository.findAll();
    }

    public Mono<Message> addMessage(Message message) {
        return repository.save(message);
    }
}
