import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    main a;

    @BeforeEach
    void setUp() {
        a = new main(1,2);
    }

    @Test
    @DisplayName("Get X TEST")
    void getX(){
        assertEquals(1, a.getX());
    }

    @AfterEach
    void tearDown() {
    }
}