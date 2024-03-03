package model.factory;

import model.Intertask;
import model.task;
import model.TaskStatus;

public class TaskInProgressFactory implements TaskFactory{
    @Override
    public ITask createTask(String name) {

        return Task.builder()
                .name(name)
                .status(TaskStatus.IN_PROGRESS)
                .build();
    }
}
