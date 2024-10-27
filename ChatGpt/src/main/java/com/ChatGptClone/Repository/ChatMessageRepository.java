package com.ChatGptClone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ChatGptClone.Model.ChatMessage;
@Repository
public interface ChatMessageRepository  extends JpaRepository<ChatMessage, Long>{

}
