import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    
    @Test
    public void testAppend(){
        LinkedList input = new LinkedList();
        LinkedList output = new LinkedList();
        output.root = new Node(1, new Node(2, new Node(3, null)));
        input.append(1);
        input.append(2);
        input.append(3);
        assertEquals(output.toString(), input.toString());
    }
}
