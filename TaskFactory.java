package model.factory;

import model.Intertask;

public interface TaskFactory {
    Intertask create task(String name);
}
