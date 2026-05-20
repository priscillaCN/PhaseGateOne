import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacebookLikeSystemTest {

    @Test
    public void givenGetName_whenInputIsAnArrayWithLength1_thenExpectedResultIsOneName() { 

    String []expected = {"Alex"};
    
    assertEquals(expected, FacebookLikeSystem.getNames("Alex"));

    }


    @
    Test
    public void givenGetName_whenInputIsNoName_thenMessageReturnsNoLikes() {

    String[]names = new String [0];
    String message = "no one likes this";
    
    assertEquals(message, FacebookLikeSystem.getNames(names));

    }


}
