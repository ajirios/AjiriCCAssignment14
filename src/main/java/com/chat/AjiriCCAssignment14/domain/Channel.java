package com.chat.AjiriCCAssignment14.domain;

import java.util.ArrayList;
import java.util.List;

public class Channel 

{
	private Long channelId;
	private String channelName;
	private List<Message> messages = new ArrayList<Message>();
	
	public Channel() {}

	public Long getChannelId() 
	
	{
		return channelId;
	}

	public void setChannelId(Long channelId) 
	
	{
		this.channelId = channelId;
	}

	public String getChannelName() 
	
	{
		return channelName;
	}

	public void setChannelName(String channelName) 
	
	{
		this.channelName = channelName;
	}

	public List<Message> getMessages() 
	
	{
		return messages;
	}

	public void setMessages(List<Message> messages) 
	
	{
		this.messages = messages;
	}
	
}
