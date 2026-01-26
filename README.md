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

Kiểm thử Tự động End-to-End với Cypress  

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
