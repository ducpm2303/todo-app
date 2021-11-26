package main.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String userName;

    @Size(min = 10, message = "Enter at least 10 Characters...")
    private String description;

    private Date targetDate;

    public Todo(String user, String desc, Date targetDate) {
        super();
        this.userName = user;
        this.description = desc;
        this.targetDate = targetDate;
    }

    public Todo() {
        super();
    }
}
