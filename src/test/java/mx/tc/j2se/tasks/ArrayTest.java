package mx.tc.j2se.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {
    @Test
    public void TaskArray(){

        Task task1 = new TaskImpl("Comer", 5);
        Task task2 = new TaskImpl("Dormir",2,122,24);
        Task task3 = new TaskImpl("Levantarse", 7);

        ArrayTaskList tasks = new ArrayTaskListImpl();
        assertEquals(0,tasks.size());
        tasks.add(task1);
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        assertEquals(4,tasks.size());

        //assertTrue(tasks.remove(task2));
        //assertEquals(3,tasks.size());
        assertEquals(4,tasks.incoming(4,8).size());
    }
}