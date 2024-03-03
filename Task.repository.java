package spring.repository;

import spring.exception.model.NotFoundException;
import spring.model.Task;
import spring.model.Taskstatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    default Task findByIdOrThrow(Long id) {
        return findById(id).orElseThrow(
                () -> new NotFoundException("Задача с ID:" + id + " не найден!")
        );
    }

    List<Task> findTaskByStatus(Taskstatus status);
}
