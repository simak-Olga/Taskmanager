package model.factory;

import model.Intertask;
import model.task;
import model.TaskStatus;

public class TaskToDoFactory implements TaskFactory{
    @Override
    public Intertask createtask(String name) {

        return Task.builder()
                .name(name)
                .status(TaskStatus.TODO)
                .build();
    }
}
