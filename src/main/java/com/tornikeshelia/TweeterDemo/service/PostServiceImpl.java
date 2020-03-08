/* CREATED BY 
    Tornike Shelia
*/

package com.tornikeshelia.TweeterDemo.service;

import com.tornikeshelia.TweeterDemo.dao.PostDao;
import com.tornikeshelia.TweeterDemo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostDao postDao;

    @Override
    public List<Post> getAllPosts() {
        return postDao.getAllPosts();
    }
}
