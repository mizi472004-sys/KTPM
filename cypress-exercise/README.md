# 🚀 BÁO CÁO THỰC HÀNH KIỂM THỬ TỰ ĐỘNG (E2E)
## 🎯 Đề tài: Kiểm thử Website SauceDemo với Cypress

<div align="center">

![Cypress](https://img.shields.io/badge/Tested_With-Cypress-17202C?style=for-the-badge&logo=cypress&logoColor=white)
![JavaScript](https://img.shields.io/badge/Language-JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![NodeJS](https://img.shields.io/badge/Runtime-Node.js-339933?style=for-the-badge&logo=node.js&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)

</div>

---

## 1. 📖 Tổng Quan
Dự án này là bài tập thực hành **Kiểm thử Tự động End-to-End (E2E)** cho trang web thương mại điện tử giả lập [SauceDemo](https://www.saucedemo.com). 

Mục tiêu chính là xây dựng các kịch bản kiểm thử tự động để đảm bảo tính ổn định của các chức năng quan trọng như **Đăng nhập**, **Giỏ hàng**, và **Thanh toán**.

---

## 2. 🛠️ Công Cụ & Môi Trường
| Thành phần | Công nghệ sử dụng | Phiên bản |
| :--- | :--- | :--- |
| **Ngôn ngữ** | JavaScript | ES6+ |
| **Framework** | Cypress | ^13.0.0 |
| **Runtime** | Node.js | v14+ |
| **IDE** | VS Code | Latest |

---

## 3. ✅ Danh Sách Kịch Bản Kiểm Thử (Test Cases)

Dưới đây là chi tiết các kịch bản đã được hiện thực hóa trong dự án:

### 🔐 3.1. Chức năng Đăng nhập (Login)
*File nguồn: `cypress/e2e/login_spec.cy.js`*

| Mã TC | Tên Kịch Bản | Mô tả |
| :--- | :--- | :--- |
| **TC-01** | **Đăng nhập thành công** | Xác minh người dùng đăng nhập được với tài khoản hợp lệ (`standard_user`), hệ thống chuyển hướng đúng. |
| **TC-02** | **Đăng nhập thất bại** | Xác minh hệ thống chặn và báo lỗi khi nhập sai thông tin đăng nhập. |

### 🛒 3.2. Chức năng Giỏ hàng & Thanh toán (Cart & Checkout)
*File nguồn: `cypress/e2e/cart_spec.cy.js`*

| Mã TC | Tên Kịch Bản | Mô tả |
| :--- | :--- | :--- |
| **TC-03** | **Thêm vào giỏ** | Thêm sản phẩm vào giỏ hàng và kiểm tra bộ đếm số lượng cập nhật đúng. |
| **TC-04** | **Sắp xếp giá** | Kiểm tra bộ lọc "Price (low to high)" hoạt động chính xác. |
| **TC-05** | **Xóa sản phẩm** | Xóa sản phẩm khỏi giỏ hàng và xác minh trạng thái giỏ hàng rỗng. |
| **TC-06** | **Quy trình Checkout** | Thực hiện toàn bộ luồng mua hàng: Giỏ hàng -> Điền thông tin -> Xác nhận đơn. |

---

## 4. ⚡ Kiểm thử Hiệu năng với JMeter
*Báo cáo chi tiết xem tại: [`jmeter/readme.md`](jmeter/readme.md)*

Dự án đã thực hiện kiểm thử hiệu năng cho website SauceDemo sử dụng công cụ **Apache JMeter**.

### 🧪 Các kịch bản kiểm thử:
- **Thread Group 1 (Cơ bản):** 10 users, kiểm tra tải nhẹ trang chủ.
- **Thread Group 2 (Tải nặng):** 50 users, kiểm tra khả năng chịu tải khi truy cập trang chủ và trang danh sách.
- **Thread Group 3 (Tùy chỉnh):** 20 users, kiểm thử độ ổn định trong 60s trên các trang giỏ hàng và thanh toán.

### 📊 Kết quả:
Vui lòng tham khảo file [`jmeter/readme.md`](jmeter/readme.md) để xem báo cáo chi tiết và file [`jmeter/performance_test.jmx`](jmeter/performance_test.jmx) để xem cấu hình test plan.

---

## 5. 🚀 Hướng Dẫn Cài Đặt & Chạy Test

### Bước 1: Cài đặt (Installation)
Clone dự án và cài đặt các thư viện cần thiết:
```bash
git clone https://github.com/mizi472004-sys/KTPM.git
cd KTPM/cypress-exercise
npm install
```

### Bước 2: Thực thi Kiểm thử (Execution)

Bạn có thể chọn một trong hai chế độ sau:

#### 🖥️ Chế độ Giao diện (Interactive Mode)
Xem robot thực hiện thao tác trực tiếp trên trình duyệt:
```bash
npx cypress open
```

#### ⚡ Chế độ Ngầm (Headless Mode)
Chạy nhanh và xuất báo cáo kết quả ra terminal:
```bash
npx cypress run
```

---

## 6. 📂 Cấu Trúc Dự Án
```tree
cypress-exercise/
├── 📁 cypress/
│   ├── 📁 e2e/
│   │   ├── 📄 login_spec.cy.js    # Test scripts cho Đăng nhập
│   │   └── 📄 cart_spec.cy.js     # Test scripts cho Giỏ hàng
│   ├── 📁 fixtures/               # Dữ liệu test mẫu
│   └── 📁 support/                # Commands & Config chung
├── 📄 cypress.config.js           # Cấu hình chính của Cypress
├── 📁 jmeter/                   # Kịch bản & báo cáo JMeter
├── 📄 package.json                # Khai báo dependencies
└── 📄 README.md                   # Tài liệu hướng dẫn này
```

---
<div align="center">
  <i>Báo cáo thực hành môn Kiểm thử Phần mềm</i>
</div>
