package top.zh.springbootdatabase.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerId;

    private String content;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Long getAnswerId() {
        return answerId;
    }

    public String getContent() {
        return content;
    }

    public Question getQuestion() {
        return question;
    }

    public User getUser() {
        return user;
    }

    // Getters and setters...
}
