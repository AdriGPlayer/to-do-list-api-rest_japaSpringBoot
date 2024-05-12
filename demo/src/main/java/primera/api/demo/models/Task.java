package primera.api.demo.models;


import jakarta.persistence.*;

import java.beans.ConstructorProperties;
import java.util.Date;

@Entity
@Table (schema = "Tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private Date dateTask;

    public Task(){}

    public Task(long id, String name, String lastName, String title, String description, Date dateTask) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.title = title;
        this.description = description;
        this.dateTask = dateTask;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateTask() {
        return dateTask;
    }

    public void setDateTask(Date dateTask) {
        this.dateTask = dateTask;
    }
}
