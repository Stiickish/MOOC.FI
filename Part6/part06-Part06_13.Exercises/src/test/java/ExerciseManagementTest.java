
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {

    private ExerciseManagement management = new ExerciseManagement();

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    //Testing the method 
    @Test
    public void exerciseListEmptyAtBeginning() {
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }

    //Testing the method add
    @Test
    public void addingExerciseGrowsListByOne() {

        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }

    //Parameter it receives is finally evaluates as true
    @Test
    public void addedExerciseIsInList() {

        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));

    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("Some exercise"));
    }
}
