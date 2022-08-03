package org.example.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lessons")
@NoArgsConstructor
@Getter
@Setter
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "video_link")
    private String videoLink;

    @ManyToOne(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id")
    private Course courses;


    @OneToMany(cascade = {CascadeType.DETACH,
    CascadeType.MERGE,
    CascadeType.PERSIST,
    CascadeType.REFRESH})

    @JoinColumn(name = "lesson_id")
    private List<Task> tasks;

    public Lesson(String name, String videoLink) {
        this.name = name;
        this.videoLink = videoLink;
    }
    public void addTask(Task task) {
        if (tasks==null){
            tasks= new ArrayList<>();
        }
        else{
            tasks.add(task);
        }
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", videoLink='" + videoLink + '\'' +
                '}';
    }
}
