package com.chat.AjiriCCAssignment14.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.AjiriCCAssignment14.domain.Channel;
import com.chat.AjiriCCAssignment14.domain.Message;
import com.chat.AjiriCCAssignment14.repository.ChannelRepository;
import com.chat.AjiriCCAssignment14.repository.MessageRepository;

@Service
public class ChannelService 

{
	@Autowired
	private ChannelRepository channelRepository;
	
	@Autowired
	private MessageRepository messageRepository;
	
	public List<Channel> findAll()
	
	{
		return this.channelRepository.findAll();
	}
	
	public Channel findById(Long channelId)
	
	{
		return this.channelRepository.findById(channelId);
	}

	public void saveMessage(Long channelId, Message message) 
	
	{
		this.channelRepository.findById(channelId).getMessages().add(message);
	}
}
