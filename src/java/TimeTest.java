/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author triosStudent
 */
@Named(value = "timeTest")
@RequestScoped
public class TimeTest {

    /**
     * Creates a new instance of TimeBean
     */
    public TimeTest() {
    }
    public String getTime(){
        return new java.util.Date().toString();
    } 
}
