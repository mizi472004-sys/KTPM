# CÁC CHỈ SỐ KIỂM THỬ (TEST METRICS)
**Dự án:** Website E-commerce  

## 1. Tỷ lệ thực thi kiểm thử (Test Execution Rate)
Đo lường tiến độ thực hiện kiểm thử so với kế hoạch.

$$ \text{Execution Rate} = \left( \frac{\text{Total TCs Executed}}{\text{Total TCs Planned}} \right) \times 100\% $$

*   Executed: 45
*   Planned: 45
*   **Result:** (45 / 45) * 100% = **100%**

---

## 2. Tỷ lệ Pass/Fail (Pass/Fail Rate)
Đánh giá chất lượng của bản build hiện tại.

*   Pass Rate = (39 / 45) * 100% = **86.67%**
*   Fail Rate = (6 / 45) * 100% = **13.33%**

---

## 3. Mật độ lỗi theo Module (Defect Density per Module)
Giúp xác định vùng chức năng nào yếu nhất để tập trung nguồn lực.

| Module | Số lượng Test Case | Số lượng Bug tìm thấy | Mật độ (Bug/TC) | Nhận xét |
| :--- | :--- | :--- | :--- | :--- |
| **Authentication** | 15 | 2 (1 Major, 1 Minor) | 13.3% | Tương đối ổn định |
| **Product & Cart** | 20 | 5 (1 Crit, 2 Major, 2 Minor) | 25% | **Kém ổn định (Rủi ro cao)** |
| **Checkout** | 10 | 3 (1 Crit, 2 Minor) | 30% | **Rất kém (Cần ưu tiên fix)** |
| **Tổng** | 45 | 10 | 22.2% | |

---

## 4. Phân bố mức độ nghiêm trọng (Severity Distribution)
Đánh giá mức độ ảnh hưởng của các lỗi tìm thấy.

| Mức độ (Severity) | Số lượng | Tỷ lệ % |
| :--- | :--- | :--- |
| **Critical** | 2 | 20% |
| **Major** | 4 | 40% |
| **Minor** | 4 | 40% |
| **Tổng** | 10 | 100% |

> **Nhận định:** 60% số lỗi tìm thấy là lỗi nghiêm trọng (Critical + Major), cho thấy chất lượng phần mềm hiện tại chưa đủ điều kiện để release.

---

## 5. Độ bao phủ yêu cầu (Requirement Coverage)
Đảm bảo tất cả yêu cầu người dùng đều được kiểm thử.

$$ \text{Coverage} = \left( \frac{\text{Requirements Covered}}{\text{Total Requirements}} \right) \times 100\% $$

*   Req Covered: 16
*   Total Req: 16
*   **Result:** **100%**
