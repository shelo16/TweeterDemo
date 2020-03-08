/* CREATED BY 
    Tornike Shelia
*/

package com.tornikeshelia.TweeterDemo.model;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment extends SuperModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "text")
    private String text;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    public Comment(String text, Post post) {
        this.text = text;
        this.post = post;
    }

    public Comment(String text) {
        this.text = text;
    }

    public Comment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
