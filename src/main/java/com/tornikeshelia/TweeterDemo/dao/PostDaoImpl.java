/* CREATED BY 
    Tornike Shelia
*/

package com.tornikeshelia.TweeterDemo.dao;

import com.tornikeshelia.TweeterDemo.model.Post;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class PostDaoImpl implements PostDao{


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unchecked")
    public List<Post> getAllPosts() {

        Session session = entityManager.unwrap(Session.class);
        Query query = session.createSQLQuery(
                "SELECT p.* FROM post p"
        ).addEntity("p",Post.class);

        return (List<Post>)query.list();
    }
}
