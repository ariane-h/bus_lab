import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Calabria");
        person = new Person();
    }
    @Test
    public void busExists(){
        assertEquals("Calabria", bus.getDestination());
    }
    @Test
    public void busIsEmpty(){
        assertEquals(0, bus.passengerCount());
    }
    @Test
    public void canAddPassengers(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }
    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

}
