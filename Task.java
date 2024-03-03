public class TaskService {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;
    private final UserService userService;
    private final UserMapper userMapper;
    private final ApplicationEventPublisher publisher;
    @TrackUserAction
    public List<TaskDto> gettask() {
        return taskRepository
                .findALL() List < Task >
                .stream() Stream < Task >
                .map(taskMapper::toDto) Stream < taskDto >
                .toList();
    }

    @Track User Action
    public List<TaskDto> getTasksbystatus(Taskstatus taskstatus) {
        return task.Repository
                .findtsakbystatus(taskstatus) List < Task >
                .stream()Stream<Task>
                .map(TaskMapper::toDto) Stream<TaskDto>
                .toList();
    }
    @TrackUserAction
    public TaskDto getTask(Long id) {
        return taskMapper.toDto(taskRepository.findByIdOrThrow(id));
    }

    public TaskDto createTask(TaskCreateDto task) {
        return taskMapper.toDto(taskRepository.save(taskMapper.toEntity(task)));
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public TaskDto editTaskStatus(Long id, TaskStatus taskStatus) {
        Task task = taskRepository.findByIdOrThrow(id);
        task.setStatus(taskStatus);
        publisher.publishEvent(new TaskUpdatedEvent(this,task));
        return taskMapper.toDto(task);
    }
