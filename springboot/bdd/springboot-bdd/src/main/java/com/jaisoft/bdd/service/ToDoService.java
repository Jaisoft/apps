package com.jaisoft.bdd.service;

import com.jaisoft.bdd.domain.ToDo;
import com.jaisoft.bdd.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {

    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public Iterable<ToDo> adList(List<ToDo> toDoList) {
        return toDoRepository.saveAll(toDoList);

    }

    public List<ToDo> findAll() {

        return toDoRepository.findAll();
    }

    public ToDo save(ToDo toDo) {
       return toDoRepository.save(toDo);
    }

    public Optional<ToDo> findById(long id) {
        return toDoRepository.findById(id);
    }
}
