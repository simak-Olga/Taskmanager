package model;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class TaskUpdatedEvent extends ApplicationEvent {

    private InterTask task;

    public TaskUpdatedEvent(Object source, InterTask task) {
        super(source);
        this.task = task;
    }
}
