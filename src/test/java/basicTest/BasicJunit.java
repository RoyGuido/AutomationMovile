package basicTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicJunit {
    // setup - initialize
    @BeforeEach
    public void setup(){
        System.out.println("Before");
    }
    //cleanup - teardown
    @AfterEach
    public void cleanup(){
        System.out.println("After");
    }
    @Test
    public void thisIsATest(){
            System.out.println("Test");
        }
    @Test
    public void thisIsATest2(){
        System.out.println("Test2");
    }


}
