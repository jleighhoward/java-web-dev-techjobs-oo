package org.launchcode.techjobs_oo.Tests;


import org.junit.jupiter.api.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.jupiter.api.Assertions.*;


public class JobTest {
    Job testJob1 = new Job("cat petter", new Employer("cat co"), new Location("my house"), new PositionType("animal petter"), new CoreCompetency("cats"));
    Job testJob2 = new Job("dog petter", new Employer("dog inc"), new Location("your house"), new PositionType("animal petter"), new CoreCompetency("dogs"));
    Job testJob3 = new Job("dog petter", new Employer("dog inc"), new Location("your house"), new PositionType("animal petter"), new CoreCompetency("dogs"));


   @Test
    public void testSettingJobId(){
       //System.out.println(testJob1.getId() + " " + testJob2.getId());
       assertNotEquals(testJob1.getId(), testJob2.getId());
   }


   @Test
   public void testJobConstructorSetsAllFields(){
       assertEquals(testJob1.getName(),"cat petter");
       assertEquals(testJob1.getEmployer().getValue(), "cat co");
       assertEquals(testJob1.getLocation().getValue(), "my house");
       assertEquals(testJob1.getPositionType().getValue(), "animal petter");
       assertEquals(testJob1.getCoreCompetency().getValue(), "cats");
    }

    @Test
    public void testJobsForEquality(){
       System.out.println(testJob2.getId() + " " + testJob3.getId());
        assertNotEquals(testJob2, testJob3);
    }

    @Test
    public void toStringReturn(){
       assertEquals(testJob1.toString(),
               "Job { ID: __1__, " +
                "\n NAME: __cat petter__, " +
            "\n EMPLOYER: __cat co__, " +
            "\n LOCATION: __my house__, " +
            "\n POSITION TYPE: __animal petter__, " +
            "\n CORE COMPETENCY: __cats__ " +
                       "\n }"
        );
        }
};




