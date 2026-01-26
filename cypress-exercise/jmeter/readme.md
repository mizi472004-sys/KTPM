# Báo cáo Kiểm thử Hiệu năng với JMeter

## 1. Giới thiệu
Mục tiêu của bài báo cáo này là trình bày kết quả kiểm thử hiệu năng cho website **Swag Labs** (https://www.saucedemo.com) sử dụng công cụ Apache JMeter.
Kiểm thử được thực hiện với 3 kịch bản khác nhau để đánh giá khả năng chịu tải và độ ổn định của hệ thống.

## 2. Các kịch bản kiểm thử (Test Scenarios)

### Kịch bản 1: Cơ bản (Basic)
- **Mục tiêu:** Kiểm tra phản hồi của trang chủ với tải nhẹ.
- **Cấu hình:**
  - Số lượng người dùng (Threads): 10
  - Thời gian khởi động (Ramp-up): 1s
  - Số vòng lặp (Loop Count): 5
- **Hành vi:** Gửi yêu cầu GET đến trang chủ (`/`).

### Kịch bản 2: Tải nặng (Heavy Load)
- **Mục tiêu:** Mô phỏng lượng truy cập cao trong thời gian ngắn và truy cập nhiều trang.
- **Cấu hình:**
  - Số lượng người dùng (Threads): 50
  - Thời gian khởi động (Ramp-up): 30s
  - Thời gian chạy (Duration): 60s
- **Hành vi:** Gửi yêu cầu GET đến trang chủ (`/`) và trang danh sách sản phẩm (`/inventory.html`).

### Kịch bản 3: Tùy chỉnh (Custom)
- **Mục tiêu:** Kiểm tra ổn định trong thời gian dài hơn với các trang chức năng.
- **Cấu hình:**
  - Số lượng người dùng (Threads): 20
  - Thời gian khởi động (Ramp-up): 1s
  - Thời gian chạy (Duration): 60s
- **Hành vi:** Gửi yêu cầu GET đến trang giỏ hàng (`/cart.html`) và trang thanh toán (`/checkout-step-one.html`).

## 3. Kết quả kiểm thử (Test Results)

*(Sinh viên điền kết quả thực tế vào đây sau khi chạy test)*

### 3.1. Kết quả Kịch bản 1
| Label | # Samples | Average (ms) | Min (ms) | Max (ms) | Std. Dev. | Error % | Throughput |
|-------|-----------|--------------|----------|----------|-----------|---------|------------|
| HTTP Request - Home | ... | ... | ... | ... | ... | ... | ... |
| **Total** | ... | ... | ... | ... | ... | ... | ... |

**Nhận xét:**
- Thời gian phản hồi trung bình: ...
- Tỷ lệ lỗi: ...

### 3.2. Kết quả Kịch bản 2
| Label | # Samples | Average (ms) | Min (ms) | Max (ms) | Std. Dev. | Error % | Throughput |
|-------|-----------|--------------|----------|----------|-----------|---------|------------|
| HTTP Request - Home | ... | ... | ... | ... | ... | ... | ... |
| HTTP Request - Inventory | ... | ... | ... | ... | ... | ... | ... |
| **Total** | ... | ... | ... | ... | ... | ... | ... |

**Nhận xét:**
- Khả năng chịu tải: ...
- Các lỗi gặp phải (nếu có): ...

### 3.3. Kết quả Kịch bản 3
| Label | # Samples | Average (ms) | Min (ms) | Max (ms) | Std. Dev. | Error % | Throughput |
|-------|-----------|--------------|----------|----------|-----------|---------|------------|
| HTTP Request - Cart | ... | ... | ... | ... | ... | ... | ... |
| HTTP Request - Checkout | ... | ... | ... | ... | ... | ... | ... |
| **Total** | ... | ... | ... | ... | ... | ... | ... |

**Nhận xét:**
- Độ ổn định: ...

## 4. Kết luận
- Đánh giá tổng quan về hiệu năng của website.
- Đề xuất cải thiện (nếu có).

## 5. Minh chứng
*(Đính kèm hình ảnh Screenshot của Summary Report hoặc View Results Tree tại đây)*
