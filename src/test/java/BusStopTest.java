import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class BusStopTest {

    private ArrayList<Person> queue;
    private BusStop busStop;
    private Person person;


    @Before
    public void before(){
        busStop = new BusStop("Banana");
        queue = new ArrayList<Person>();
        person = new Person();
    }
    @Test
    public void canAddPersonToQueue(){
        busStop.addToQueue(person);
        assertEquals(1, busStop.countQueue());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addToQueue(person);
        busStop.removeFromQueue();
        assertEquals(0, busStop.countQueue());
    }
}
