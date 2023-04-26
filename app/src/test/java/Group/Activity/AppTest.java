/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Group.Activity;

import org.junit.Test;
import org.junit.internal.Throwables;

import static org.junit.Assert.*;
import java.util.ArrayList;
public class AppTest {  
    private Class IllegalArgumentException;
    @Test
    public void checkSize(){
        int expected = 3;
        assertEquals(expected, App.checkSize(-3));
    }
    @Test 
    public void illegalSize(){
        //var expected = IllegalArgumentException;
     assertThrows(IllegalArgumentException.class,
      () -> App.checkSize(-3));
    }
    @Test
   public void even_Checker() {
        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> actual = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        actual.add(2);
        actual.add(3);
        actual.add(4);
        actual.add(5);
        actual.add(6);
        assertArrayEquals(expected.toArray(), (App.even_Checker(actual)).toArray());
   }


}
    
