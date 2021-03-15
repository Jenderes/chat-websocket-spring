package com.server.chat.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "recipientUser", fetch = FetchType.LAZY)
    private List<ChatRoom> recipientChatRoom;

    @OneToMany(mappedBy = "senderUser", fetch = FetchType.LAZY)
    private List<ChatRoom> senderChatRoom;

    @OneToMany(mappedBy = "messageSenderUser", fetch = FetchType.LAZY)
    private List<Message> messageSender;

    @OneToMany(mappedBy = "messageRecipientUser", fetch = FetchType.LAZY)
    private List<Message> messageRecipient;

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ChatRoom> getRecipientChatRoom() {
        return recipientChatRoom;
    }

    public void setRecipientChatRoom(List<ChatRoom> recipientChatRoom) {
        this.recipientChatRoom = recipientChatRoom;
    }

    public List<ChatRoom> getSenderChatRoom() {
        return senderChatRoom;
    }

    public void setSenderChatRoom(List<ChatRoom> senderChatRoom) {
        this.senderChatRoom = senderChatRoom;
    }

    public List<Message> getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(List<Message> messageSender) {
        this.messageSender = messageSender;
    }

    public List<Message> getMessageRecipient() {
        return messageRecipient;
    }

    public void setMessageRecipient(List<Message> messageRecipient) {
        this.messageRecipient = messageRecipient;
    }
}
