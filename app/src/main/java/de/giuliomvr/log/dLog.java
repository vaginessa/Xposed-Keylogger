package de.giuliomvr.log;

/**
 * Created by ststa on 9/21/2015.
 */
public class dLog {
    private int id;
    private String time;
    private String message;
    private String application;

    public dLog(){}

    public dLog(String time, String message, String application) {
        super();
        this.time = time;
        this.message = message;
        this.application = application;
    }

    //getters & setters

    @Override
    public String toString() {
        return "dLog [id=" + id + ", time=" + time + ", message=" + message + ", application=" + application
                + "]";
    }
}
