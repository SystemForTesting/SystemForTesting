package com.epam.testsystem.form;

import com.epam.testsystem.model.Answer;
import com.epam.testsystem.model.Question;
import org.springframework.core.GenericTypeResolver;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public class StrutsArrayList<E> extends ArrayList<E> {
    Class<E> clazz;

    public StrutsArrayList(Class<E> clazz) {
        this.clazz = clazz;
    }

    @Override
    public E get(int index) {
        if(this.size() <= index) {
            int gap = index + 1 - this.size();
            for (int i = 0; i < gap; i++) {
                this.add(elementToAdd());
            }
        }
        return super.get(index);
    }

    protected E elementToAdd() {
        try {
            return clazz.newInstance();
        }  catch (InstantiationException | IllegalAccessException e) {
            // won't happen if used properly
            throw new RuntimeException(e);
        }
    }
}
