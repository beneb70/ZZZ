/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.pajaramicroservice;


/**
 * REST Web Service
 *
 * @author b
 */

public class ItemResource {
    private String id;
    /** Creates a new instance of ItemResource */
    private ItemResource(String id) {
        this.id=id;
    }

    /** Get instance of the ItemResource */
    public static ItemResource getInstance(String id) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of ItemResource class.
        return new ItemResource(id);
    }
}
