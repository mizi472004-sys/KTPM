# Báo cáo Thực hành Kiểm thử Tự động End-to-End với Cypress

## 1. Tổng quan
Dự án này là bài tập thực hành kiểm thử tự động (E2E Testing) cho trang web [SauceDemo](https://www.saucedemo.com) - một trang web giả lập thương mại điện tử. Mục tiêu là viết các kịch bản kiểm thử để xác minh các chức năng quan trọng của hệ thống bằng công cụ Cypress.

## 2. Công cụ và Môi trường
- **Ngôn ngữ**: JavaScript
- **Framework kiểm thử**: Cypress
- **Môi trường chạy**: Node.js

## 3. Các kịch bản kiểm thử đã thực hiện

Tôi đã xây dựng các kịch bản kiểm thử (Test Cases) bao phủ các chức năng chính sau:

### 3.1. Kiểm thử chức năng Đăng nhập (`login_spec.cy.js`)
*File: `cypress/e2e/login_spec.cy.js`*

*   **TC01 - Đăng nhập thành công**: 
    *   Sử dụng tài khoản `standard_user`.
    *   Kiểm tra hệ thống chuyển hướng thành công sang trang danh sách sản phẩm (`/inventory.html`).
*   **TC02 - Đăng nhập thất bại**:
    *   Sử dụng tài khoản không tồn tại.
    *   Kiểm tra hệ thống hiển thị thông báo lỗi "Username and password do not match".

### 3.2. Kiểm thử Giỏ hàng và Thanh toán (`cart_spec.cy.js`)
*File: `cypress/e2e/cart_spec.cy.js`*

*   **TC03 - Thêm sản phẩm vào giỏ hàng**:
    *   Chọn sản phẩm đầu tiên và nhấn "Add to cart".
    *   Kiểm tra biểu tượng giỏ hàng hiển thị số lượng là `1`.
*   **TC04 - Sắp xếp sản phẩm theo giá (Thấp đến Cao)**:
    *   Chọn bộ lọc "Price (low to high)".
    *   Kiểm tra sản phẩm đầu tiên hiển thị có giá thấp nhất ($7.99).
*   **TC05 - Xóa sản phẩm khỏi giỏ hàng** (Yêu cầu nâng cao):
    *   Thêm sản phẩm -> Vào giỏ hàng -> Nhấn "Remove".
    *   Kiểm tra sản phẩm biến mất và biểu tượng số lượng trên giỏ hàng không còn hiển thị.
*   **TC06 - Quy trình thanh toán (Checkout)** (Yêu cầu nâng cao):
    *   Thêm sản phẩm -> Vào giỏ hàng -> Nhấn "Checkout".
    *   Điền thông tin cá nhân (First Name, Last Name, Zip Code).
    *   Nhấn "Continue" và kiểm tra hệ thống chuyển đến trang xác nhận (`/checkout-step-two.html`).

## 4. Hướng dẫn cài đặt và Chạy kiểm thử

### Cài đặt
Để chạy dự án này trên máy cục bộ:

1. Clone repository về máy:
   ```bash
   git clone https://github.com/mizi472004-sys/KTPM.git
   cd KTPM/cypress-exercise
   ```
2. Cài đặt các thư viện (dependencies):
   ```bash
   npm install
   ```

### Chạy kiểm thử
*   **Chế độ giao diện (Interactive Mode)** - Xem trực quan quá trình test:
    ```bash
    npx cypress open
    ```
*   **Chế độ ngầm (Headless Mode)** - Chạy nhanh trên terminal:
    ```bash
    npx cypress run
    ```

## 5. Cấu trúc thư mục
```
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
```
