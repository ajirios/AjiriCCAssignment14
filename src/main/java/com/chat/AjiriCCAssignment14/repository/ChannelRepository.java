package com.chat.AjiriCCAssignment14.repository;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.chat.AjiriCCAssignment14.domain.Channel;

@Repository
public class ChannelRepository 

{
	private HashMap<Long, Channel> channelMap = new HashMap<Long, Channel>();
	
	public ChannelRepository()
	
	{
		Long channelId = Long.valueOf(1);
		Channel channel = new Channel();
		channel.setChannelId(channelId);
		channel.setChannelName("General");
		this.channelMap.put(channelId, channel);
	}
	
	public Channel findById(Long channelId)
	
	{
		return this.channelMap.get(channelId);
	}
	
	public List<Channel> findAll()
	
	{
		return this.channelMap.entrySet().stream().map((entry) -> entry.getValue()).collect(Collectors.toList());
	}
}
