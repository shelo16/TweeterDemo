/* CREATED BY 
    Tornike Shelia
*/

package com.tornikeshelia.TweeterDemo.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;

@MappedSuperclass
public class SuperModel {

    @PrePersist
    protected void onCreate() {
        dateCreated = System.currentTimeMillis();
    }

    @Column(name = "dateCreated", nullable = false)
    private long dateCreated;

    public SuperModel(long dateCreated) {
        this.dateCreated = dateCreated;
    }

    public SuperModel() {
    }

    public long getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(long dateCreated) {
        this.dateCreated = dateCreated;
    }
}
