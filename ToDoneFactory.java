package model.factory;

import model.Intertask;
import model.Task;
import model.TaskStatus;

public class TaskDoneFactory implements TaskFactory{
    @Override
    public ITask createTask(String name) {

        return Task.builder()
                .name(name)
                .status(TaskStatus.DONE)
                .build();
    }
}
