package Zadanie0.Test;
import Zadanie0.Main.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Hellotest {
    @Test
    public void meh(){
        //Arrange
        HelloWorld hejka = new HelloWorld();
        //Act
        String greeting = hejka.getGreeting();
        //Assert
        assertEquals("HelloWorld!!one",greeting);
    }
}
