package com.example.onetomanytest;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="notes")
public class Note {

    @Id
    @GeneratedValue
    @Column(name="nid")
    private Long id;

    @Column(name="content")
    private String content;

    @ManyToOne
    @JoinColumn(name="uid", nullable=false)
    private User user;

    public Note() {
    }

    public Note(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(id, note.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
