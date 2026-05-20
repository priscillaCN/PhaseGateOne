import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MiniParkingSystemTest {


    @Test
    public void givenParkingSlotSpace_whenCaris0_thenExpectedResultIs0() {

        int [] slotSpace = new int [20];

        int car = 0;

        int [] actual = MiniParkingSystem.parkingSlotSpace(slotSpace);

        assertEquals(0, actual);

    }

    @Test
    public void givenParkingSlotSpace_whenCaris1_thenExpectedResultIs1() {

        int [] slotSpace = new int [20];

        int car = 1;

        int [] actual = MiniParkingSystem.parkingSlotSpace(slotSpace);

        assertEquals(1, actual);

    }


    @Test
    public void givenIsFreeSlot_whenSlotSpaceIsO_thenExpectedResultIsTrue() {

        int [] slotSpace = new int [20];

        boolean [] actual = MiniParkingSystem.IsfreeSlot(slotSpace);

        assertTrue(true, actual);

    }



}
