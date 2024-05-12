package primera.api.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import primera.api.demo.models.Task;
import primera.api.demo.repository.TodoRepository;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = "/holaMundo")
    public String holaMundo(){
        return "hola mundo";
    }

    @GetMapping(value = "/tasks")
    public List<Task> getTasks(){
        List<Task> tareas = todoRepository.findAll();//metodo findAll encuentra todas las entidades
        return tareas;
    }

    @PostMapping(value = "/savetask")
    public String saveTasks(@RequestBody Task task){
        todoRepository.save(task);
        return "Saved task";
    }

    @PutMapping(value = "/update/{id}")
    public String updateTask(@PathVariable long id, @RequestBody Task task){
        Task updatedTask = todoRepository.findById(id).get();
        updatedTask.setName(task.getName());
        updatedTask.setLastName(task.getLastName());
        updatedTask.setTitle(task.getTitle());
        updatedTask.setDescription(task.getDescription());
        todoRepository.save(updatedTask);
        return "updated task";
    }

    @DeleteMapping(value = "/deleteTask/{id}")
    public String deleteTaskById(@PathVariable long id){
        todoRepository.deleteById(id);
        return "Deleted Task";
    }



}
