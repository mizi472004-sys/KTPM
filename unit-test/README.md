# Student Analyzer Project

## Mô tả
Dự án phân tích điểm số học sinh, bao gồm tính năng đếm số lượng học sinh giỏi và tính điểm trung bình hợp lệ.

## Chức năng
1. `countExcellentStudents(List<Double> scores)`: Đếm số học sinh giỏi (điểm >= 8.0).
2. `calculateValidAverage(List<Double> scores)`: Tính điểm trung bình của các điểm hợp lệ (0 <= điểm <= 10).

## Cấu trúc thư mục
- `src/`: Mã nguồn chính (`StudentAnalyzer.java`)
- `test/`: Mã nguồn kiểm thử (`StudentAnalyzerTest.java`)

## Cách chạy kiểm thử
Sử dụng JUnit 5 để chạy các bài kiểm thử trong thư mục `test/`.

Nếu sử dụng command line (cần có junit-platform-console-standalone jar):
```bash
javac -d bin src/StudentAnalyzer.java test/StudentAnalyzerTest.java
java -jar junit-platform-console-standalone.jar -cp bin --scan-classpath
```
(Lưu ý: Bạn cần cài đặt hoặc tải thư viện JUnit)

## Yêu cầu bài tập
- [x] Viết hàm `countExcellentStudents`
- [x] Viết hàm `calculateValidAverage`
- [x] Viết unit tests
- [x] Viết tài liệu README
