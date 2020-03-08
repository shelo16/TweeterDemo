/* CREATED BY 
    Tornike Shelia
*/

package com.tornikeshelia.TweeterDemo.controller;

import com.tornikeshelia.TweeterDemo.model.Post;
import com.tornikeshelia.TweeterDemo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/getPosts",produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
    public List<Post> getAllPost(){
        System.out.println("hey");
        return postService.getAllPosts();
    }
}
