package org.launchcode.techjobs.oo;

import org.junit.Test;
//import org.junit.Assert.*;
import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
    //use this to show that job1 and job2's ID are not equal
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3.getName() instanceof String);
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(job3.getName(), "Product tester");
//       turn these into Strings?
//        System.out.println(job3.getEmployer());
//        System.out.println(job3.getEmployer().getValue().getClass().getName());
//        System.out.println(job3.getEmployer().getValue());

        assertEquals(job3.getEmployer().getValue(), "ACME");
        assertEquals(job3.getLocation().getValue(), "Desert");
        assertEquals(job3.getPositionType().getValue(), "Quality control");
        assertEquals(job3.getCoreCompetency().getValue(), "Persistence");

    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

    @Test
    public void testJobsForEquality() {
//        Do I use equals() or AssertEquals?
        Job job4 = new Job("Mouse Shaver", new Employer("WUSTL"), new Location("STL"), new PositionType("Research Technician"), new CoreCompetency("Hunger"));
        Job job5 = new Job("Mouse Shaver", new Employer("WUSTL"), new Location("STL"), new PositionType("Research Technician"), new CoreCompetency("Hunger"));
//        @Override
//        public boolean equals(Object obj) {
//            return super.equals(obj);
//        }
//        why does assertFalse work here and not assertEquals?
//        System.out.println(assertFalse(job4.equals(job5)));
            assertFalse(job4.equals(job5));
    }
}
