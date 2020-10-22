import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;
public class StudentTest {
    Student fer;
    @Before
    public void setUp() {
        fer = new Student(1L, "Fer");
    }
    @Test
    public void testCreateStudentInstance() {
        Student douglas = new Student(2l, "Douglas");
        assertNotNull(douglas);
        assertNotNull(fer);
    }

    @Test
    public void testStudentFields(){
        assertEquals("Fer", fer.getName());
        assertEquals(1l, fer.getId());
    }

    @Test 
    public void testAddGradeAndGetGrade() {
        fer.addGrade(100);
        assertEquals(100, (int)fer.getGrades().get(0));
    }

    @Test
    public void testAverageGrade() {
        fer.addGrade(100);
        fer.addGrade(80);
        assertEquals(90.0, fer.getGradeAverage(), 0);
        fer.addGrade(100);
        assertEquals(93.33, fer.getGradeAverage(), 0.1);
    }
}
