package org.example.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor


public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "curse_name")
    private String curseName;
    private String duration;
    private String createAt;
    @Column(name = "image_link")
    private String imageLink;
    private String description;

    @OneToMany(mappedBy = "courses",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Lesson> lessons;

    @ManyToMany(mappedBy = "courses",cascade = {CascadeType.DETACH, CascadeType.MERGE,
    CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    private List<Instructor> instructors = new ArrayList<>();

    public void addInstructors(Instructor instructor) {
        if (instructor == null) {
            new ArrayList<>();
        } else {
            instructor.addCourse(this);
        }
    }

    public Course(String curseName, String duration, String createAt, String imageLink, String description) {
        this.curseName = curseName;
        this.duration = duration;
        this.createAt = createAt;
        this.imageLink = imageLink;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", curseName='" + curseName + '\'' +
                ", duration='" + duration + '\'' +
                ", createAt='" + createAt + '\'' +
                ", imageLink='" + imageLink + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
