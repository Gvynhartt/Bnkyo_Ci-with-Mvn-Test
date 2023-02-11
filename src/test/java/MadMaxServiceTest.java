import cum.sample.text.MadMaxService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MadMaxServiceTest {
    @Test
    public void shdFindMax() {
        MadMaxService benzak = new MadMaxService();

        int a = 5;
        int b = 3;

        int expected = 5;
        int actual = benzak.max(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shdFindMaxIfB() {
        MadMaxService slav = new MadMaxService();

        int a = 3;
        int b = 5;

        int expected = 5;
        int actual = slav.max(a, b);

        Assertions.assertEquals(expected, actual);
    }
}
