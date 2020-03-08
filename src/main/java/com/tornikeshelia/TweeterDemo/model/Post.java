/* CREATED BY 
    Tornike Shelia
*/

package com.tornikeshelia.TweeterDemo.model;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post extends SuperModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "text")
    private String text;

    public Post(String text) {
        this.text = text;
    }

    public Post() {
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
}
