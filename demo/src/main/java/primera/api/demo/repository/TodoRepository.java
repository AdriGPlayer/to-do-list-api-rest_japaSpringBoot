package primera.api.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import primera.api.demo.models.Task;

public interface TodoRepository extends JpaRepository <Task, Long> {}
