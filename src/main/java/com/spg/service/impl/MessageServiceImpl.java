package com.spg.service.impl;

import com.spg.dao.MessageMapper;
import com.spg.domin.Message;
import com.spg.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author
 * @date 04/01/19 13:34
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageMapper messageMapper;

    @Override
    public void generateMessage(Message message) {
        messageMapper.insertOne(message);
    }
}
