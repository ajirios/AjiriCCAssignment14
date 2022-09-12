package com.chat.AjiriCCAssignment14.domain;

public class Message 

{
	private String sender;
	private String body;
	private Long channelId;
	
	public Message() {}

	public String getSender() 
	
	{
		return sender;
	}

	public void setSender(String sender) 
	
	{
		this.sender = sender;
	}

	public String getBody() 
	
	{
		return body;
	}

	public void setBody(String body) 
	
	{
		this.body = body;
	}

	public Long getChannelId() 
	
	{
		return channelId;
	}

	public void setChannelId(Long channelId) 
	
	{
		this.channelId = channelId;
	}

	@Override
	public String toString() 
	
	{
		return "Message [sender=" + sender + ", body=" + body + ", channelId=" + channelId + "]";
	}
	
}
