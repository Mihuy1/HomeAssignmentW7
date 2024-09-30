import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testGetName() {
        SportApp sportApp = new SportApp("Running", 2, "Monday");
        assertEquals("Running", sportApp.getName());
    }

    public void testGetDuration() {
        SportApp sportApp = new SportApp("Running", 2, "Monday");
        assertEquals(2, sportApp.getDuration());
    }

    public void testGetDay() {
        SportApp sportApp = new SportApp("Running", 2, "Monday");
        assertEquals("Monday", sportApp.getDay());
    }

    public void testSetName() {
        SportApp sportApp = new SportApp("Running", 2, "Monday");
        sportApp.setName("Swimming");
        assertEquals("Swimming", sportApp.getName());
    }

    public void testSetDuration() {
        SportApp sportApp = new SportApp("Running", 2, "Monday");
        sportApp.setDuration(3);
        assertEquals(3, sportApp.getDuration());
    }

    public void testSetDay() {
        SportApp sportApp = new SportApp("Running", 2, "Monday");
        sportApp.setDay("Tuesday");
        assertEquals("Tuesday", sportApp.getDay());
    }

    public void testToString() {
        SportApp sportApp = new SportApp("Running", 2, "Monday");
        String expected = "Activity: Running, Duration: 2, Day: Monday";
        assertEquals(expected, sportApp.toString());
    }
    
}