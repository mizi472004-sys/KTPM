# DANH SÁCH BÁO CÁO LỖI (BUG REPORTS)
**Dự án:** Website E-commerce  
**Tổng số bug:** 10  

| Bug ID | Tóm tắt (Summary) | Các bước tái hiện (Steps to Reproduce) | Kết quả mong đợi (Expected) | Kết quả thực tế (Actual) | Mức độ (Severity) | Độ ưu tiên (Priority) | Môi trường |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| **BUG_CHECK_001** | Lỗi 500 khi thanh toán bằng thẻ Visa hợp lệ | 1. Thêm SP vào giỏ<br>2. Checkout<br>3. Chọn Visa, nhập info đúng<br>4. Place Order | Đặt hàng thành công, chuyển trang Thank You | Hệ thống báo lỗi "Internal Server Error 500" | **Critical** | High | Chrome/Win |
| **BUG_CART_002** | Ứng dụng crash (Màn hình trắng) khi cập nhật số lượng thành 0 | 1. Vào giỏ hàng<br>2. Sửa số lượng SP = 0<br>3. Bấm Update | Hiển thị thông báo lỗi hoặc xóa SP | Màn hình trắng xóa, phải F5 mới hết | **Critical** | High | Chrome/Win |
| **BUG_PROD_003** | Tính năng Tìm kiếm phân biệt hoa thường (Case Sensitive) | 1. Có SP tên "Laptop"<br>2. Liệu từ khóa "laptop" vào search<br>3. Enter | Hiển thị SP "Laptop" | Thông báo "No products found" | **Major** | High | Chrome/Win |
| **BUG_CART_004** | Tổng tiền tính sai khi số lượng sản phẩm > 10 | 1. Add SP giá 100k<br>2. Set quantity = 11<br>3. View Total | Total = 1.100.000đ | Total hiển thị 100.000đ (mất số hàng triệu) | **Major** | Medium | Chrome/Win |
| **BUG_AUTH_005** | Email quên mật khẩu không gửi về hộp thư | 1. Vào Forgot Pass<br>2. Nhập email đúng<br>3. Submit | Nhận được email reset trong 5p | Đã 24h vẫn không nhận được email nào | **Major** | High | All Browsers |
| **BUG_PROD_006** | Ảnh sản phẩm bị vỡ (Broken Image) ở danh mục "Phụ kiện" | 1. Vào danh mục Phụ kiện<br>2. Xem list SP | Hiển thị đủ ảnh thumbnail | 30% ảnh hiển thị icon lỗi (404) | **Major** | Medium | Chrome/Win |
| **BUG_UI_007** | Sai chính tả thông báo đặt hàng thành công | 1. Place Order thành công | Thông báo "Order Placed Successfully" | Hiển thị "Order Placed Succesfully" (thiếu 1 's') | Minor | Low | All Browsers |
| **BUG_UI_008** | Canh lề nút "Add to Cart" bị lệch trên màn hình nhỏ | 1. Resize cửa sổ trình duyệt < 800px<br>2. Xem trang Detail | Nút nằm giữa hoặc thẳng hàng | Nút bị trôi ra ngoài khung div container | Minor | Low | Chrome Responsive |
| **BUG_UI_009** | Thứ tự Tab (Tab Order) trên form Đăng ký không đúng | 1. Vào Register<br>2. Nhập Email<br>3. Nhấn Tab | Con trỏ nhảy sang ô Password | Con trỏ nhảy xuống nút Submit (bỏ qua Password) | Minor | Low | Chrome/Win |
| **BUG_UI_010** | Thiếu Tooltip hướng dẫn khi hover vào icon (? ) | 1. Rê chuột vào icon [?] ở mục CVV | Hiện tooltip giải thích CVV là gì | Không có gì hiện ra | Minor | Low | Chrome/Win |
