package com.jaisoft.bdd.repository;


import com.jaisoft.bdd.domain.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("toDoRepository")
public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}
