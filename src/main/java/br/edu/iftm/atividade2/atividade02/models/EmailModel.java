package br.edu.iftm.atividade2.atividade02.models;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "emails")
public class EmailModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "remetente")
    private String from;

    @Column(nullable = false, name = "destinatario")
    private String to;

    @Column(nullable = false, name = "subject")
    private String subject;

    @Column(nullable = false, name = "body")
    private String body;

    @Column(nullable = false, name = "attachment")
    private String attachment;

    public EmailModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public EmailModel(Long id, String from, String to, String subject, String body, String attachment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "EmailModel{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", attachment='" + attachment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailModel that)) return false;
        return getId().equals(that.getId()) && getFrom().equals(that.getFrom()) && getTo().equals(that.getTo()) && getSubject().equals(that.getSubject()) && getBody().equals(that.getBody()) && getAttachment().equals(that.getAttachment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFrom(), getTo(), getSubject(), getBody(), getAttachment());
    }
}
