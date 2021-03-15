package com.server.chat.Entity;

import javax.persistence.*;

@Entity
@Table(name = "MESSAGE")
public class Message {
    @Id
    @Column(name = "message_id")
    private Long id;

    @Column(name = "body_message")
    private String bodyMessage;

    @Column(name = "status")
    private String status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "message_sender_id")
    private User messageSenderUser;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "message_recepient_id")
    private User messageRecipientUser;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBodyMessage() {
        return bodyMessage;
    }

    public void setBodyMessage(String bodyMessage) {
        this.bodyMessage = bodyMessage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getMessageSenderUser() {
        return messageSenderUser;
    }

    public void setMessageSenderUser(User messageSenderUser) {
        this.messageSenderUser = messageSenderUser;
    }

    public User getMessageRecipientUser() {
        return messageRecipientUser;
    }

    public void setMessageRecipientUser(User messageRecipientUser) {
        this.messageRecipientUser = messageRecipientUser;
    }
}
