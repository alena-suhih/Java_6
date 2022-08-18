import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.lesson_6.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource (files="src/test/resources/sqr.csv")
    public void test (int expected, int lowerBound, int upperBound) {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(lowerBound, upperBound);
        Assertions.assertEquals(expected, actual);

    }
}
