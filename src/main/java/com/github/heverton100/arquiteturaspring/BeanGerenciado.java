package com.github.heverton100.arquiteturaspring;

import com.github.heverton100.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
//@Scope("request")
//@Scope("session")
//@Scope("application")
public class BeanGerenciado {

    @Autowired
    private TodoValidator validator;

    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }

    @Autowired
    public void setValidator(TodoValidator validator) {
        this.validator = validator;
    }
}
