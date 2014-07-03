/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.drools.mas.body.content.adapter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.drools.mas.body.content.Action;

/**
 *
 * @author esteban
 */
public class ActionAdapter extends XmlAdapter<String, Action>{

    @Override
    public Action unmarshal(String v) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Action.class);
        Object unmarshal = jc.createUnmarshaller().unmarshal(new ByteArrayInputStream(v.getBytes()));
        return (Action)unmarshal;
    }

    @Override
    public String marshal(Action v) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        
        JAXBContext jc = JAXBContext.newInstance(Action.class);
        Marshaller marshaller = jc.createMarshaller();
        marshaller.marshal(v, baos);
        
        return baos.toString();
    }

    
}