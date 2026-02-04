Chương 1: Nguyên lý kiểm thử

Phần 1: Báo cáo Kết quả Self-Test UI/UX

1.Thông tin thực hiện

Ngày 05/01/2026

Nơi thực hiện bài kiểm thử: Can't Unsee

Mục tiêu: Kiểm tra khả năng nhận diện chi tiết trong thiết kế giao diện (padding, typography, contrast, v.v.).

2.🏆 Kết quả

Điểm số đạt được: 7280

3.Hình ảnh minh chứng

<img width="1021" height="580" alt="Screenshot 2026-01-21 170044" src="https://github.com/user-attachments/assets/bfb13afa-3c77-4332-ad32-d01fd69f5376" />

Chương 2: Kiểm thử Đơn vị với JUnit

1. Tổng quan

Tên dự án: Phân tích dữ liệu điểm số học sinh

Báo cáo này mô tả quá trình thực hiện bài tập xây dựng và kiểm thử mô đun phân tích điểm số học sinh. Mục tiêu là áp dụng kỹ thuật kiểm thử đơn vị (Unit Testing) sử dụng JUnit để đảm bảo tính đúng đắn của các chức năng xử lý dữ liệu.

2. Yêu cầu chi tiết

Xây dựng lớp `StudentAnalyzer` với hai chức năng chính: 

1.  `countExcellentStudents`: Đếm số lượng học sinh đạt loại Giỏi (điểm từ 8.0 trở lên).

2.  `calculateValidAverage`: Tính điểm trung bình của các điểm số hợp lệ (từ 0.0 đến 10.0).

Ràng buộc dữ liệu: 

*   Điểm hợp lệ phải nằm trong khoảng [0.0, 10.0].

*   Các điểm số < 0 hoặc > 10 được coi là dữ liệu sai và bị bỏ qua.

*   Xử lý các trường hợp danh sách rỗng hoặc null một cách an toàn.

3. Thiết kế & Cài đặt

Mã nguồn được tổ chức trong thư mục `src/` với lớp chính `StudentAnalyzer.java`.

3.1. Phương thức `countExcellentStudents`
*   Input: Danh sách `List<Double> scores`.
*   Logic:
    *   Kiểm tra danh sách `null` hoặc rỗng -> Trả về 0.
    *   Duyệt qua danh sách, bỏ qua các giá trị `null`, các giá trị < 0 hoặc > 10.
    *   Đếm nếu giá trị >= 8.0.
*   Output: Số nguyên (int).

3.2. Phương thức `calculateValidAverage`
*   Input: Danh sách `List<Double> scores`.
*   Logic:
    *   Kiểm tra danh sách `null` hoặc rỗng -> Trả về 0.0.
    *   Duyệt qua danh sách, tính tổng các điểm hợp lệ và đếm số lượng học sinh hợp lệ.
    *   Nếu không có học sinh hợp lệ nào -> Trả về 0.0.
    *   Ngược lại -> Trả về `sum / validCount`.
*   Output: Số thực (double).

4. Chiến lược Kiểm thử (Testing Strategy)
Sử dụng JUnit 5  để viết các test case trong `test/StudentAnalyzerTest.java`. Các trường hợp kiểm thử được chia thành 3 nhóm chính:

4.1. Trường hợp bình thường (Normal Cases)
Kiểm tra các kịch bản phổ biến mà chương trình dự kiến sẽ gặp phải.
*   Danh sách chứa hỗn hợp điểm hợp lệ, điểm không hợp lệ, điểm giỏi và không giỏi.
*   Danh sách toàn bộ là điểm hợp lệ.

4.2. Trường hợp biên (Boundary Cases)
Kiểm tra các giá trị nằm ngay "mép" của các điều kiện logic.
*   Danh sách rỗng (`empty list`).
*   Điểm số là 0.0 hoặc 10.0.
*   Điểm số là 8.0 (vừa đủ giỏi) và 7.9 (gần giỏi).

4.3. Trường hợp ngoại lệ (Exception/Edge Cases)
Kiểm tra khả năng chịu lỗi của chương trình.
*   Danh sách đầu vào là `null`.
*   Danh sách chứa các phần tử `null`.
*   Danh sách chứa toàn bộ điểm không hợp lệ (âm hoặc > 10).

5. Kết quả Kiểm thử
Tất cả các unit test đã được viết và thực thi thành công. Dưới đây là tóm tắt các test case đã vượt qua:

| Test Case | Mô tả | Trạng thái |
| :--- | :--- | :--- |
| `testCountExcellentStudents_NormalCases` | Đếm đúng với dữ liệu hỗn hợp | ✅ PASSED |
| `testCountExcellentStudents_BoundaryCases` | Xử lý đúng biên 8.0, 0, 10 và list rỗng | ✅ PASSED |
| `testCountExcellentStudents_Exceptions` | Xử lý an toàn với null list/element | ✅ PASSED |
| `testCalculateValidAverage_NormalCases` | Tính trung bình đúng, bỏ qua điểm sai | ✅ PASSED |
| `testCalculateValidAverage_BoundaryCases` | Xử lý đúng khi list rỗng hoặc chỉ có 0 | ✅ PASSED |
| `testCalculateValidAverage_Exceptions` | Trả về 0.0 khi null hoặc toàn điểm sai | ✅ PASSED 

Chương 3 :Kiểm thử Tự động End-to-End với Cypress  

1. Tổng quan
Dự án này là bài tập thực hành kiểm thử tự động (E2E Testing) cho trang web SauceDemo - một trang web giả lập thương mại điện tử. Mục tiêu là viết các kịch bản kiểm thử để xác minh các chức năng quan trọng của hệ thống bằng công cụ Cypress.

2. Công cụ và Môi trường
  
Ngôn ngữ: JavaScript 

Framework kiểm thử: Cypress 

Môi trường chạy: Node.js

5. Các kịch bản kiểm thử đã thực hiện

Tôi đã xây dựng các kịch bản kiểm thử (Test Cases) bao phủ các chức năng chính sau:

3.1. Kiểm thử chức năng Đăng nhập (login_spec.cy.js) 

File: cypress/e2e/login_spec.cy.js

TC01 - Đăng nhập thành công: 

Sử dụng tài khoản standard_user. 


Kiểm tra hệ thống chuyển hướng thành công sang trang danh sách sản phẩm (/inventory.html). 

TC02 - Đăng nhập thất bại: 

Sử dụng tài khoản không tồn tại. 

Kiểm tra hệ thống hiển thị thông báo lỗi "Username and password do not match". 


3.2. Kiểm thử Giỏ hàng và Thanh toán (cart_spec.cy.js) 

File: cypress/e2e/cart_spec.cy.js

TC03 - Thêm sản phẩm vào giỏ hàng: 

Chọn sản phẩm đầu tiên và nhấn "Add to cart". 

Kiểm tra biểu tượng giỏ hàng hiển thị số lượng là 1. 

TC04 - Sắp xếp sản phẩm theo giá (Thấp đến Cao): 

Chọn bộ lọc "Price (low to high)". 

Kiểm tra sản phẩm đầu tiên hiển thị có giá thấp nhất ($7.99). 

TC05 - Xóa sản phẩm khỏi giỏ hàng (Yêu cầu nâng cao): 

Thêm sản phẩm -> Vào giỏ hàng -> Nhấn "Remove". 

Kiểm tra sản phẩm biến mất và biểu tượng số lượng trên giỏ hàng không còn hiển thị. 

TC06 - Quy trình thanh toán (Checkout) (Yêu cầu nâng cao): 

Thêm sản phẩm -> Vào giỏ hàng -> Nhấn "Checkout".
Điền thông tin cá nhân (First Name, Last Name, Zip Code).
Nhấn "Continue" và kiểm tra hệ thống chuyển đến trang xác nhận (/checkout-step-two.html).
4. Hướng dẫn cài đặt và Chạy kiểm thử
Cài đặt
Để chạy dự án này trên máy cục bộ:

Clone repository về máy: 

git clone https://github.com/mizi472004-sys/KTPM.git 

cd KTPM/cypress-exercise 

Cài đặt các thư viện (dependencies): npm install 

Chạy kiểm thử 

Chế độ giao diện (Interactive Mode) - Xem trực quan quá trình test:npx cypress open 

Chế độ ngầm (Headless Mode) - Chạy nhanh trên terminal:npx cypress run

5. Cấu trúc thư mục

cypress-exercise/ 

├── cypress/  

│   ├── e2e/  

│   │   ├── login_spec.cy.js    # Kịch bản test đăng nhập  

│   │   └── cart_spec.cy.js     # Kịch bản test giỏ hàng & thanh toán  

│   ├── fixtures/               # Dữ liệu mẫu (nếu có)  

│   └── support/                # Cấu hình chung và custom commands  

├── cypress.config.js           # Cấu hình Cypress  

├── package.json                # Quản lý thư viện  

└── README.md                   # Báo cáo này

Chương 4: Kiểm thử Hiệu năng với JMeter

1. Tổng quan
Thực hiện kiểm thử hiệu năng cho website Wikipedia (www.wikipedia.org) sử dụng công cụ Apache JMeter.
Mục tiêu là đo lường thời gian phản hồi, khả năng chịu tải và độ ổn định của hệ thống dưới các mức tải khác nhau.

2. Tài nguyên
- **Thư mục kiểm thử:** `/jmeter`
- **Kịch bản kiểm thử (.jmx):** `/jmeter/performance_test_wikipedia.jmx`
- **Báo cáo chi tiết:** Vui lòng xem file [jmeter/readme.md](./jmeter/readme.md) để xem chi tiết các kịch bản và kết quả kiểm thử.

   Báo cáo Kiểm thử Hiệu năng với JMeter

1. Giới thiệu
Mục tiêu của bài báo cáo này là trình bày kết quả kiểm thử hiệu năng cho website **Wikipedia** (https://www.wikipedia.org) sử dụng công cụ Apache JMeter.
Kiểm thử được thực hiện với 3 kịch bản khác nhau để đánh giá khả năng chịu tải và độ ổn định của hệ thống.

2. Các kịch bản kiểm thử (Test Scenarios)

Kịch bản 1: Cơ bản (Basic)
- **Mục tiêu:** Kiểm tra phản hồi của trang chủ với tải nhẹ.
- **Cấu hình:**
  - Số lượng người dùng (Threads): 10
  - Thời gian khởi động (Ramp-up): 1s
  - Số vòng lặp (Loop Count): 5
- **Hành vi:** Gửi yêu cầu GET đến trang chủ (`/`).

Kịch bản 2: Tải nặng (Heavy Load)
- **Mục tiêu:** Mô phỏng lượng truy cập cao trong thời gian ngắn và truy cập nhiều trang.
- **Cấu hình:**
  - Số lượng người dùng (Threads): 50
  - Thời gian khởi động (Ramp-up): 30s
  - Thời gian chạy (Duration): 60s
- **Hành vi:** Gửi yêu cầu GET đến trang chủ (`/`) và trang Portal Arts (`/wiki/Portal:Arts`).

Kịch bản 3: Tùy chỉnh (Custom)
- **Mục tiêu:** Kiểm tra ổn định trong thời gian dài hơn với các trang chức năng.
- **Cấu hình:**
  - Số lượng người dùng (Threads): 20
  - Thời gian khởi động (Ramp-up): 1s
  - Thời gian chạy (Duration): 60s
- **Hành vi:** Gửi yêu cầu GET đến trang Portal History (`/wiki/Portal:History`) và Portal Technology (`/wiki/Portal:Technology`).

3. Hướng dẫn chạy kiểm thử
Do môi trường hiện tại chưa cài đặt sẵn JMeter, bạn vui lòng thực hiện các bước sau để chạy kiểm thử và điền kết quả:

1.  **Cài đặt JMeter:** Tải về từ [Apache JMeter](https://jmeter.apache.org/download_jmeter.cgi) và giải nén.
2.  **Mở Test Plan:**
    *   Khởi động JMeter (chạy file `jmeter.bat` trên Windows hoặc `jmeter` trên Linux/macOS trong thư mục `bin`).
    *   Chọn `File` -> `Open` và chọn file `performance_test_wikipedia.jmx` trong thư mục này.
3.  **Chạy kiểm thử:** Nhấn nút Start (hình tam giác màu xanh lá) trên thanh công cụ.
4.  **Xem kết quả:** Chọn `Summary Report` hoặc `View Results Tree` ở cột bên trái để xem thông số.

4. Kết quả kiểm thử (Test Results)

*(Sinh viên điền kết quả thực tế vào đây sau khi chạy test)*

4.1. Kết quả Kịch bản 1
| Label | # Samples | Average (ms) | Min (ms) | Max (ms) | Std. Dev. | Error % | Throughput |
|-------|-----------|--------------|----------|----------|-----------|---------|------------|
| HTTP Request - Home | ... | ... | ... | ... | ... | ... | ... |
| **Total** | ... | ... | ... | ... | ... | ... | ... |

**Nhận xét:**
- Thời gian phản hồi trung bình: ...
- Tỷ lệ lỗi: ...

4.2. Kết quả Kịch bản 2
| Label | # Samples | Average (ms) | Min (ms) | Max (ms) | Std. Dev. | Error % | Throughput |
|-------|-----------|--------------|----------|----------|-----------|---------|------------|
| HTTP Request - Home | ... | ... | ... | ... | ... | ... | ... |
| HTTP Request - Search (Portal) | ... | ... | ... | ... | ... | ... | ... |
| **Total** | ... | ... | ... | ... | ... | ... | ... |

**Nhận xét:**
- Khả năng chịu tải: ...
- Các lỗi gặp phải (nếu có): ...

4.3. Kết quả Kịch bản 3
| Label | # Samples | Average (ms) | Min (ms) | Max (ms) | Std. Dev. | Error % | Throughput |
|-------|-----------|--------------|----------|----------|-----------|---------|------------|
| HTTP Request - History | ... | ... | ... | ... | ... | ... | ... |
| HTTP Request - Technology | ... | ... | ... | ... | ... | ... | ... |
| **Total** | ... | ... | ... | ... | ... | ... | ... |

**Nhận xét:**
- Độ ổn định: ...

5. Kết luận
- Đánh giá tổng quan về hiệu năng của website.
- Đề xuất cải thiện (nếu có).

## 6. Minh chứng
*(Đính kèm hình ảnh Screenshot của Summary Report hoặc View Results Tree tại đây)*


