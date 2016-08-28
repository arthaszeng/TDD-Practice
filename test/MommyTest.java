import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MommyTest {

    private Mommy mommy;
    private String actual;

    @Before
    public void setUp() throws Exception {
        mommy = new Mommy();
    }

    @org.junit.Test
    public void givenTheLetterHShouldReturnH() throws Exception {

        actual = mommy.getResult("H");

        assertThat(actual, is("H"));
    }

    @Test
    public void givenTheLetterAShouldReturnMommy() throws Exception {

        actual = mommy.getResult("A");

        assertThat(actual, is("mommy"));
    }

    @Test
    public void givenEmptyStringShouldReturnAnEmptyString() throws Exception {

        actual = mommy.getResult("");

        assertThat(actual, is(""));
    }

    @Test
    public void givenHAShouldReturnHmommy() throws Exception {

        actual = mommy.getResult("HA");

        assertThat(actual, is("Hmommy"));
    }

    @Test
    public void givenLowerCaseAEShouldReturnMommy() throws Exception {

        actual = mommy.getResult("ae");

        assertThat(actual, is("mommy"));
    }

    @Test
    public void givenAComplexCombinationShouldReturnCorrectResult() throws Exception {

        actual = mommy.getResult("AHAAHHA");

        assertThat(actual, is("mommyHmommyHHmommy"));
    }
}
