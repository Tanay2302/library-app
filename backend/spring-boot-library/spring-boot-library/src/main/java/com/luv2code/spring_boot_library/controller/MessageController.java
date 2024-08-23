package com.luv2code.spring_boot_library.controller;

import com.luv2code.spring_boot_library.entity.Message;
import com.luv2code.spring_boot_library.service.MessagesService;
import com.luv2code.spring_boot_library.utils.ExtractJWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/messages")
public class MessageController {
    MessagesService messagesService;
    @Autowired
    public  MessageController(MessagesService messagesService){
        this.messagesService=messagesService;
    }
    @PostMapping("/secure/add/message")
    public void postMessage(@RequestHeader(value="Authorization") String token,
                            @RequestBody Message messageRequest){
        String userEmail= ExtractJWT.extract(token,"\"sub\"");
        messagesService.postMessage(messageRequest,userEmail);

    }
}
