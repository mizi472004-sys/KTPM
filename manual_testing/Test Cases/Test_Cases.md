# DANH SÁCH CA KIỂM THỬ (TEST CASES)
**Dự án:** Website E-commerce  
**Tổng số:** 45 Test Cases  

## 1. Module Xác thực (Authentication) - 15 TCs

| TC ID | Tiêu đề (Title) | Điều kiện trước (Precondition) | Các bước (Steps) | Kết quả mong đợi (Expected Result) | Độ ưu tiên | Loại test |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| TC_AUTH_001 | Đăng ký với email hợp lệ | Chưa có tài khoản | 1. Vào trang Đăng ký<br>2. Nhập email hợp lệ<br>3. Nhập pass >= 8 char<br>4. Submit | Đăng ký thành công, chuyển hướng trang Login | High | Positive |
| TC_AUTH_002 | Đăng ký với email đã tồn tại | Email đã tồn tại | 1. Vào trang Đăng ký<br>2. Nhập email đã tồn tại<br>3. Submit | Báo lỗi "Email already exists" | Medium | Negative |
| TC_AUTH_003 | Đăng ký email sai định dạng | N/A | 1. Nhập email không có @<br>2. Submit | Báo lỗi định dạng email | Medium | Negative |
| TC_AUTH_004 | Đăng ký mật khẩu < 8 ký tự | N/A | 1. Nhập pass "123"<br>2. Submit | Báo lỗi "Password too short" | Medium | Boundary |
| TC_AUTH_005 | Đăng ký bỏ trống các trường | N/A | 1. Để trống Email/Pass<br>2. Submit | Báo lỗi "Fields required" | Low | Negative |
| TC_AUTH_006 | Đăng nhập hợp lệ | Đã có tài khoản | 1. Vào Login<br>2. Nhập user/pass đúng<br>3. Submit | Đăng nhập thành công, về Home | High | Positive |
| TC_AUTH_007 | Đăng nhập sai email | N/A | 1. Nhập email không tồn tại<br>2. Submit | Báo lỗi "User not found" | High | Negative |
| TC_AUTH_008 | Đăng nhập sai mật khẩu | N/A | 1. Nhập email đúng, pass sai<br>2. Submit | Báo lỗi "Wrong password" | High | Negative |
| TC_AUTH_009 | Đăng nhập bỏ trống | N/A | 1. Không nhập gì<br>2. Submit | Báo lỗi "Fields required" | Low | Negative |
| TC_AUTH_010 | Kiểm tra SQL Injection Login | N/A | 1. Nhập user: `' OR 1=1 --`<br>2. Submit | Không đăng nhập được, báo lỗi invalid | High | Security |
| TC_AUTH_011 | Quên mật khẩu email đúng | Email tồn tại | 1. Vào Forgot Pass<br>2. Nhập email đúng<br>3. Gửi | Thông báo "Email sent" | Medium | Positive |
| TC_AUTH_012 | Quên mật khẩu email sai format | N/A | 1. Nhập "abc"<br>2. Gửi | Báo lỗi định dạng | Low | Negative |
| TC_AUTH_013 | Quên mật khẩu email không tồn tại | N/A | 1. Nhập email chưa đk<br>2. Gửi | Báo lỗi "Email not found" | Medium | Negative |
| TC_AUTH_014 | Đăng xuất hệ thống | Đã đăng nhập | 1. Click Logout | Đăng xuất, về trang Login | Medium | Positive |
| TC_AUTH_015 | Truy cập trang cần Auth khi chưa Login | Chưa đăng nhập | 1. Nhập URL `/chart`<br>2. Enter | Chuyển hướng về Login | High | Security |

## 2. Module Sản phẩm & Giỏ hàng (Product & Cart) - 20 TCs

| TC ID | Tiêu đề (Title) | Điều kiện trước (Precondition) | Các bước (Steps) | Kết quả mong đợi (Expected Result) | Độ ưu tiên | Loại test |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| TC_PROD_001 | Tìm kiếm chính xác tên | Có sản phẩm "Laptop" | 1. Nhập "Laptop"<br>2. Search | Hiển thị sản phẩm Laptop | High | Positive |
| TC_PROD_002 | Tìm kiếm một phần tên | Có SP "Samsung S21" | 1. Nhập "Samsung"<br>2. Search | Hiển thị các SP Samsung | Medium | Positive |
| TC_PROD_003 | Tìm kiếm không có kết quả | N/A | 1. Nhập "TênLạHoắc"<br>2. Search | Thông báo "No products found" | Medium | Negative |
| TC_PROD_004 | Tìm kiếm ký tự đặc biệt | N/A | 1. Nhập "@#$%"<br>2. Search | Xử lý an toàn, không lỗi server | Low | Security |
| TC_PROD_005 | Lọc giá Thấp -> Cao | List SP đa dạng giá | 1. Chọn Sort: Low to High | SP giá thấp nhất lên đầu | Medium | Positive |
| TC_PROD_006 | Lọc giá Cao -> Thấp | List SP đa dạng giá | 1. Chọn Sort: High to Low | SP giá cao nhất lên đầu | Medium | Positive |
| TC_PROD_007 | Lọc theo Danh mục | Có Category "Phone" | 1. Chọn Cat "Phone" | Chỉ hiển thị điện thoại | Medium | Positive |
| TC_PROD_008 | Lọc Danh mục rỗng | Cat "Toy" rỗng | 1. Chọn Cat "Toy" | Thông báo "No items" | Low | Boundary |
| TC_PROD_009 | Xem chi tiết sản phẩm | Tại trang Home | 1. Click vào SP A | Chuyển trang Detail SP A | High | Positive |
| TC_PROD_010 | Back từ trang chi tiết | Tại trang Detail | 1. Click Back browser | Quay lại trang list đúng vị trí | Low | Positive |
| TC_CART_001 | Thêm vào giỏ thành công | Tại trang Detail | 1. Click "Add to Cart" | Thông báo thành công | High | Positive |
| TC_CART_002 | Tăng số lượng icon giỏ | Giỏ hàng rỗng | 1. Add 1 SP | Icon giỏ hiện số 1 | Medium | Positive |
| TC_CART_003 | Thêm cùng SP nhiều lần | Giỏ có SP A (qty=1) | 1. Add SP A lần nữa | Giỏ có SP A (qty=2) | Medium | Positive |
| TC_CART_004 | Cập nhật số lượng dương | Giỏ có SP A | 1. Sửa qty = 5<br>2. Update | Tổng tiền update theo qty 5 | High | Positive |
| TC_CART_005 | Cập nhật số lượng = 0 | Giỏ có SP A | 1. Sửa qty = 0 | Tự động xóa SP hoặc báo lỗi min=1 | Medium | Boundary |
| TC_CART_006 | Cập nhật số lượng âm | Giỏ có SP A | 1. Sửa qty = -1 | Báo lỗi hoặc tự về 1 | Medium | Negative |
| TC_CART_007 | Cập nhật max số lượng | Giỏ có SP A | 1. Sửa qty = 1000 | Báo lỗi "Out of stock" nếu quá | Low | Boundary |
| TC_CART_008 | Xóa 1 sản phẩm | Giỏ có SP A | 1. Click Remove SP A | SP A biến mất khỏi giỏ | High | Positive |
| TC_CART_009 | Tính tổng tiền giỏ hàng | Giỏ: A (10k), B (20k) | 1. View Cart | Total = 30k | High | Positive |
| TC_CART_010 | Xóa toàn bộ giỏ (nếu có) | Giỏ nhiều món | 1. Click Clear Cart | Giỏ rỗng, Total = 0 | Low | Positive |

## 3. Module Thanh toán (Checkout) - 10 TCs

| TC ID | Tiêu đề (Title) | Điều kiện trước (Precondition) | Các bước (Steps) | Kết quả mong đợi (Expected Result) | Độ ưu tiên | Loại test |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| TC_CHECK_001 | Checkout thành công COD | Giỏ có hàng, Login | 1. Vào Checkout<br>2. Nhập Address<br>3. Chọn COD<br>4. Place Order | Đặt hàng thành công, hiển thị Order ID | High | Positive |
| TC_CHECK_002 | Checkout thành công Visa | Giỏ có hàng | 1. Nhập thẻ hợp lệ<br>2. Place Order | Đặt hàng thành công | High | Positive |
| TC_CHECK_003 | Bỏ trống địa chỉ giao hàng | N/A | 1. Xóa Address<br>2. Place Order | Báo lỗi "Address required" | High | Negative |
| TC_CHECK_004 | Số điện thoại sai định dạng | N/A | 1. Nhập Phone="abcd"<br>2. Place Order | Báo lỗi Phone | Medium | Negative |
| TC_CHECK_005 | Nhập thẻ Visa quá ngắn | Chọn Visa | 1. Nhập Card 12 số<br>2. Place Order | Báo lỗi Card Invalid | High | Negative |
| TC_CHECK_006 | Nhập thẻ hết hạn | Chọn Visa | 1. Nhập Date quá khứ<br>2. Place Order | Báo lỗi Expired | Medium | Negative |
| TC_CHECK_007 | Tổng tiền khớp giỏ hàng | Cart total = 100k | 1. Tại trang Checkout<br>2. Check Total | Hiển thị đúng 100k (+ship nếu có) | High | Positive |
| TC_CHECK_008 | Kiểm tra thông báo thành công | Vừa Order xong | 1. Xem trang Thank You | Có lời cảm ơn & mã đơn | Medium | Positive |
| TC_CHECK_009 | Lịch sử đơn hàng cập nhật | Vừa Order xong | 1. Vào Order History | Thấy đơn vừa đặt (Status: New) | High | Positive |
| TC_CHECK_010 | Xem chi tiết đơn hàng cũ | Có đơn hàng cũ | 1. Click đơn cũ | Hiển thị đúng list SP trong đơn | Low | Positive |
