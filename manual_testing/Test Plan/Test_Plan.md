# KẾ HOẠCH KIỂM THỬ (TEST PLAN)
**Dự án:** Website E-commerce Bán Hàng Online  
**Phiên bản tài liệu:** 1.0  
**Ngày tạo:** 04/02/2026  

## 1. Giới thiệu (Introduction)
Tài liệu này mô tả kế hoạch kiểm thử cho hệ thống Website E-commerce giả lập. Mục tiêu là xác minh tính đúng đắn, ổn định và tin cậy của các chức năng chính bao gồm Xác thực người dùng, Quản lý sản phẩm & Giỏ hàng, và Thanh toán. Phương pháp kiểm thử chủ đạo là kiểm thử thủ công (Manual Testing).

## 2. Phạm vi kiểm thử (Scope)
### 2.1 Trong phạm vi (In-scope)
Kiểm thử chức năng (Functional Testing) và kiểm thử giao diện người dùng (User Interface Testing) cho các phân hệ sau:
1.  **Module 1 – Xác thực người dùng (Authentication):**
    *   Đăng ký tài khoản
    *   Đăng nhập
    *   Quên mật khẩu
    *   Đăng xuất
2.  **Module 2 – Sản phẩm & Giỏ hàng (Product & Cart):**
    *   Tìm kiếm sản phẩm, Lọc theo giá/danh mục
    *   Xem chi tiết sản phẩm
    *   Thêm sản phẩm vào giỏ, cập nhật số lượng, xóa sản phẩm
3.  **Module 3 – Thanh toán (Checkout):**
    *   Nhập địa chỉ giao hàng
    *   Chọn phương thức thanh toán
    *   Đặt hàng và xem lịch sử đơn hàng

### 2.2 Ngoài phạm vi (Out-of-scope)
*   **Kiểm thử hiệu năng (Performance Testing):** Load test, Stress test.
*   **Kiểm thử bảo mật chuyên sâu (Security Testing):** Penetration testing, DDoS.
*   **Kiểm thử tự động (Automation Testing):** Chưa áp dụng trong giai đoạn này.
*   **Module quản trị (Admin/Backend):** Chỉ tập trung vào Front-office của người dùng cuối.

## 3. Phương pháp kiểm thử (Test Approach)
*   **Kiểm thử chức năng (Functional Testing):** Tập trung xác minh các chức năng hoạt động đúng theo yêu cầu (Requirements).
*   **Kiểm thử giao diện (UI Testing):** Đảm bảo giao diện hiển thị đúng, đồng nhất và thân thiện trên trình duyệt quy định.
*   **Kiểm thử biên & tiêu cực (Boundary & Negative Testing):** Kiểm tra khả năng xử lý lỗi của hệ thống với dữ liệu không hợp lệ hoặc các trường hợp biên.
*   **Kiểm thử hồi quy (Regression Testing):** Chạy lại các test case quan trọng (Smoke Test) sau khi có bản vá lỗi.

## 4. Môi trường kiểm thử (Test Environment)
*   **Phần cứng:** PC/Laptop cá nhân.
*   **Hệ điều hành:** Windows 10/11.
*   **Trình duyệt công cụ:** Google Chrome (Latest Version).
*   **Dữ liệu Test:**
    *   Tài khoản giả lập (User/Pass).
    *   Dữ liệu sản phẩm mẫu trong DB giả lập.
    *   Thông tin thẻ tín dụng giả lập để test thanh toán.

## 5. Điều kiện bắt đầu & kết thúc (Entry / Exit Criteria)
### 5.1 Điều kiện bắt đầu (Entry Criteria)
*   Mã nguồn đã được triển khai lên môi trường kiểm thử (Staging/Test).
*   Tài liệu yêu cầu (SRS) đã được phê duyệt.
*   Kế hoạch kiểm thử (Test Plan) đã được thông qua.
*   Dữ liệu mẫu đã sẵn sàng.

### 5.2 Điều kiện kết thúc (Exit Criteria)
*   100% test case trong phạm vi đã được thực thi.
*   Độ bao phủ yêu cầu (Requirement Coverage) đạt ≥ 90%.
*   Không còn lỗi mức độ **Critical** hoặc **High** mở lại.
*   Báo cáo kiểm thử (Test Report) đã được hoàn tất và gửi đi.

## 6. Rủi ro & Biện pháp giảm thiểu (Risks & Mitigation)
| Rủi ro | Mức độ | Biện pháp giảm thiểu |
| :--- | :--- | :--- |
| Thiếu hụt thời gian kiểm thử do phát triển chậm tiến độ | High | Ưu tiên kiểm thử các luồng chính (Main flow/Happy path) trước. Thực hiện OT nếu cần. |
| Môi trường test không ổn định | Medium | Yêu cầu đội Dev hỗ trợ nhanh chóng khi server down. Chuẩn bị môi trường backup cục bộ. |
| Yêu cầu thay đổi phút chót | Medium | Đóng băng yêu cầu (Req freeze) trước giai đoạn test cuối. Cập nhật RTM ngay khi có thay đổi. |

## 7. Vai trò & Trách nhiệm (Roles & Responsibilities)
*   **Test Manager:** Lập kế hoạch, theo dõi tiến độ, phê duyệt tài liệu.
*   **QA Tester:** Thiết kế Test Case, thực thi Test, báo cáo Bug.
*   **Developer:** Fix bug, hỗ trợ môi trường.

## 8. Lịch trình kiểm thử (Test Schedule - Giả lập)
| Hoạt động | Ngày bắt đầu | Ngày kết thúc | Người thực hiện |
| :--- | :--- | :--- | :--- |
| Lập Test Plan | 04/02/2026 | 05/02/2026 | QA Team |
| Thiết kế Test Case | 05/02/2026 | 07/02/2026 | QA Team |
| Thực thi Test (Vòng 1) | 08/02/2026 | 10/02/2026 | QA Team |
| Fix Bug & Retest | 11/02/2026 | 12/02/2026 | Dev & QA |
| Tổng hợp báo cáo | 13/02/2026 | 13/02/2026 | QA Team |

---
*Phê duyệt bởi:*
*Quản lý dự án: [Tên quản lý]*
*Ngày: ...*
