import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    void testCountExcellentStudents_NormalCases() {
        // Danh sách có nhiều điểm hợp lệ và không hợp lệ.
        // 9.0 (Giỏi), 8.5 (Giỏi), 7.0 (Khá), 11.0 (Invalid), -1.0 (Invalid)
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));

        // Danh sách toàn bộ hợp lệ
        assertEquals(3, analyzer.countExcellentStudents(Arrays.asList(8.0, 9.0, 10.0)));
    }

    @Test
    void testCountExcellentStudents_BoundaryCases() {
        // Danh sách trống
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));

        // Danh sách chỉ chứa giá trị biên 8.0 (Giỏi) và 7.9 (Không giỏi)
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(8.0, 7.9)));

        // Danh sách chỉ chứa 0 hoặc 10
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(0.0)));
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(10.0)));
    }

    @Test
    void testCountExcellentStudents_Exceptions() {
        // Null list
        assertEquals(0, analyzer.countExcellentStudents(null));

        // List with null elements
        List<Double> listWithNull = new ArrayList<>();
        listWithNull.add(9.0);
        listWithNull.add(null);
        assertEquals(1, analyzer.countExcellentStudents(listWithNull));
    }

    @Test
    void testCalculateValidAverage_NormalCases() {
        // 9.0 + 8.5 + 7.0 = 24.5. Valid count = 3. Avg = 8.1666...
        assertEquals(8.17, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);

        // Toàn bộ hợp lệ: 5.0 + 10.0 = 15.0 / 2 = 7.5
        assertEquals(7.5, analyzer.calculateValidAverage(Arrays.asList(5.0, 10.0)), 0.001);
    }

    @Test
    void testCalculateValidAverage_BoundaryCases() {
        // Danh sách trống
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.001);

        // Danh sách chỉ chứa 0
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(0.0)), 0.001);
    }

    @Test
    void testCalculateValidAverage_Exceptions() {
        // Null list
        assertEquals(0.0, analyzer.calculateValidAverage(null), 0.001);

        // Tất cả không hợp lệ
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-1.0, 11.0)), 0.001);
    }
}
