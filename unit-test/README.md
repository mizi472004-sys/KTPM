# Báo cáo Bài tập Kỹ thuật Phần mềm: Kiểm thử Đơn vị với JUnit

## 1. Tổng quan
**Tên dự án:** Phân tích dữ liệu điểm số học sinh
**Người thực hiện:** [Tên sinh viên]
**Ngày thực hiện:** 26/01/2026

Báo cáo này mô tả quá trình thực hiện bài tập xây dựng và kiểm thử mô đun phân tích điểm số học sinh. Mục tiêu là áp dụng kỹ thuật kiểm thử đơn vị (Unit Testing) sử dụng JUnit để đảm bảo tính đúng đắn của các chức năng xử lý dữ liệu.

## 2. Yêu cầu chi tiết
Xây dựng lớp `StudentAnalyzer` với hai chức năng chính:
1.  **`countExcellentStudents`**: Đếm số lượng học sinh đạt loại Giỏi (điểm từ 8.0 trở lên).
2.  **`calculateValidAverage`**: Tính điểm trung bình của các điểm số hợp lệ (từ 0.0 đến 10.0).

**Ràng buộc dữ liệu:**
*   Điểm hợp lệ phải nằm trong khoảng [0.0, 10.0].
*   Các điểm số < 0 hoặc > 10 được coi là dữ liệu sai và bị bỏ qua.
*   Xử lý các trường hợp danh sách rỗng hoặc null một cách an toàn.

## 3. Thiết kế & Cài đặt
Mã nguồn được tổ chức trong thư mục `src/` với lớp chính `StudentAnalyzer.java`.

### 3.1. Phương thức `countExcellentStudents`
*   **Input**: Danh sách `List<Double> scores`.
*   **Logic**:
    *   Kiểm tra danh sách `null` hoặc rỗng -> Trả về 0.
    *   Duyệt qua danh sách, bỏ qua các giá trị `null`, các giá trị < 0 hoặc > 10.
    *   Đếm nếu giá trị >= 8.0.
*   **Output**: Số nguyên (int).

### 3.2. Phương thức `calculateValidAverage`
*   **Input**: Danh sách `List<Double> scores`.
*   **Logic**:
    *   Kiểm tra danh sách `null` hoặc rỗng -> Trả về 0.0.
    *   Duyệt qua danh sách, tính tổng các điểm hợp lệ và đếm số lượng học sinh hợp lệ.
    *   Nếu không có học sinh hợp lệ nào -> Trả về 0.0.
    *   Ngược lại -> Trả về `sum / validCount`.
*   **Output**: Số thực (double).

## 4. Chiến lược Kiểm thử (Testing Strategy)
Sử dụng **JUnit 5** để viết các test case trong `test/StudentAnalyzerTest.java`. Các trường hợp kiểm thử được chia thành 3 nhóm chính:

### 4.1. Trường hợp bình thường (Normal Cases)
Kiểm tra các kịch bản phổ biến mà chương trình dự kiến sẽ gặp phải.
*   Danh sách chứa hỗn hợp điểm hợp lệ, điểm không hợp lệ, điểm giỏi và không giỏi.
*   Danh sách toàn bộ là điểm hợp lệ.

### 4.2. Trường hợp biên (Boundary Cases)
Kiểm tra các giá trị nằm ngay "mép" của các điều kiện logic.
*   Danh sách rỗng (`empty list`).
*   Điểm số là 0.0 hoặc 10.0.
*   Điểm số là 8.0 (vừa đủ giỏi) và 7.9 (gần giỏi).

### 4.3. Trường hợp ngoại lệ (Exception/Edge Cases)
Kiểm tra khả năng chịu lỗi của chương trình.
*   Danh sách đầu vào là `null`.
*   Danh sách chứa các phần tử `null`.
*   Danh sách chứa toàn bộ điểm không hợp lệ (âm hoặc > 10).

## 5. Kết quả Kiểm thử
Tất cả các unit test đã được viết và thực thi thành công. Dưới đây là tóm tắt các test case đã vượt qua:

| Test Case | Mô tả | Trạng thái |
| :--- | :--- | :--- |
| `testCountExcellentStudents_NormalCases` | Đếm đúng với dữ liệu hỗn hợp | ✅ PASSED |
| `testCountExcellentStudents_BoundaryCases` | Xử lý đúng biên 8.0, 0, 10 và list rỗng | ✅ PASSED |
| `testCountExcellentStudents_Exceptions` | Xử lý an toàn với null list/element | ✅ PASSED |
| `testCalculateValidAverage_NormalCases` | Tính trung bình đúng, bỏ qua điểm sai | ✅ PASSED |
| `testCalculateValidAverage_BoundaryCases` | Xử lý đúng khi list rỗng hoặc chỉ có 0 | ✅ PASSED |
| `testCalculateValidAverage_Exceptions` | Trả về 0.0 khi null hoặc toàn điểm sai | ✅ PASSED |

## 6. Hướng dẫn chạy chương trình
Để chạy lại bộ kiểm thử, sử dụng các lệnh sau trong thư mục gốc của dự án:

**Biên dịch:**
```bash
javac -d bin src/StudentAnalyzer.java test/StudentAnalyzerTest.java
```

**Chạy Test (yêu cầu JUnit Console Launcher):**
```bash
java -jar junit-platform-console-standalone.jar -cp bin --scan-classpath
```

## 7. Kết luận
Dự án đã hoàn thành đúng các yêu cầu chức năng và yêu cầu kiểm thử. Mã nguồn đảm bảo tính rõ ràng, xử lý tốt các trường hợp ngoại lệ và dữ liệu biên, được xác nhận thông qua bộ test case đầy đủ.
