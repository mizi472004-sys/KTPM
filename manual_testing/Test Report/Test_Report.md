# BÁO CÁO TỔNG HỢP KIỂM THỬ (TEST SUMMARY REPORT)
**Dự án:** Website E-commerce Bán Hàng Online  
**Ngày báo cáo:** 13/02/2026  
**Người thực hiện:** QA Team  

## 1. Tóm tắt kết quả (Executive Summary)
Đợt kiểm thử chức năng (Functional Testing) cho phiên bản 1.0 đã hoàn tất. Nhóm kiểm thử đã thực hiện toàn bộ 45 test case theo kế hoạch.
Kết quả cho thấy hệ thống đáp ứng tốt các luồng nghiệp vụ cơ bản (Happy path), tuy nhiên vẫn tồn tại một số lỗi nghiêm trọng liên quan đến Thanh toán và Giỏ hàng cần được khắc phục gấp trước khi Release.

## 2. Thống kê thực thi (Execution Summary)
*   **Tổng số Test Case:** 45
*   **Số TC Pass:** 39
*   **Số TC Fail:** 6
*   **Số TC Blocked:** 0
*   **Tỷ lệ thực thi (Execution Rate):** 100%

## 3. Danh sách lỗi nghiêm trọng (Top Critical/Major Issues)
Các lỗi sau đây có tác động lớn đến trải nghiệm người dùng hoặc chức năng cốt lõi:

1.  **BUG_CHECK_001 (Critical):** Lỗi 500 Server Error khi thanh toán qua thẻ Visa. (Chặn đứng luồng doanh thu).
2.  **BUG_CART_002 (Critical):** Hệ thống crash khi set số lượng = 0.
3.  **BUG_AUTH_005 (Major):** Email quên mật khẩu không gửi đi -> Người dùng mất tài khoản không lấy lại được.
4.  **BUG_CART_004 (Major):** Sai lệch tính toán tổng tiền khi số lượng lớn.
5.  **BUG_PROD_003 (Major):** Tìm kiếm phân biệt hoa thường, gây khó khăn cho việc tìm sản phẩm.

## 4. Đánh giá chất lượng (Quality Assessment)
*   **Module Xác thực:** Khá ổn định, ngoại trừ chức năng Quên mật khẩu.
*   **Module Sản phẩm & Giỏ hàng:** Chức năng cơ bản tốt, nhưng tính toán và xử lý biên (Boundary) còn yếu.
*   **Module Thanh toán:** Rất rủi ro do lỗi thanh toán Visa.

## 5. Kết luận & Quyết định (Conclusion & Decision)
Dựa trên kết quả kiểm thử và tiêu chí kết thúc (Exit Criteria):
*   Còn tồn tại 2 lỗi **Critical** và 4 lỗi **Major**.
*   Tiêu chí "Không còn lỗi Critical/High" **CHƯA ĐẠT**.

👉 **Quyết định: KHÔNG CHO PHÉP PHÁT HÀNH (NO-RELEASE)**.
Đề nghị đội phát triển khắc phục các lỗi Critical & Major nêu trên và gửi lại bản build mới để thực hiện Regression Test.
