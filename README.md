[📘 Ứng dụng Tính Toán Đơn Giản (TH_Bai1_SimpleMath)](./TH_Bai1_SimpleMath/README.md)

## 📘 Giới thiệu
**Simple Math** là một ứng dụng Android đơn giản giúp người dùng thực hiện các phép tính cơ bản như:
- Cộng (`+`)
- Trừ (`-`)
- Nhân (`×`)
- Chia (`÷`)

Ứng dụng được viết bằng **Java** trong **Android Studio**, phù hợp cho sinh viên hoặc người mới học lập trình Android muốn tìm hiểu:
- Cách xử lý sự kiện (Event Handling)
- Cách tương tác với các thành phần giao diện (`EditText`, `Button`, `TextView`)
- Cách hiển thị thông báo (`Toast`) và xử lý lỗi nhập liệu

---

## 🚀 Tính năng chính
✅ Nhập hai số A và B  
✅ Chọn phép toán muốn thực hiện  
✅ Nhấn “**Tính kết quả**” để xem kết quả ngay lập tức  
✅ Thông báo lỗi nếu chia cho 0 hoặc nhập sai định dạng  
✅ Nút “**Làm lại**” để xóa toàn bộ dữ liệu và tính toán lại  

---

## 🖼️ Giao diện ứng dụng

### 🔹 Trước khi tính toán
<img src="./Screenshot_20251015_074401.png" alt="Giao diện ban đầu" width="300"/>

### 🔹 Sau khi tính toán
<img src="./Screenshot_20251015_074443.png" alt="Giao diện sau khi tính" width="300"/>

---

# 🧍‍♀️ Ứng dụng Tính Chỉ Số BMI (TH_Bai2_BasicGUI)

Một ứng dụng Android được xây dựng bằng **Java** trên **Android Studio**, giúp người dùng tính toán **chỉ số BMI (Body Mass Index)** và hiển thị **phân loại sức khỏe** theo hai tiêu chuẩn:  
- **Chuẩn Toàn cầu (Global Standard)**  
- **Chuẩn Châu Á (Asian Standard)**

Ứng dụng này được phát triển trong bài thực hành **TH_Bài 2 – Basic GUI Programming**, nhằm rèn luyện kỹ năng thiết kế giao diện, xử lý sự kiện, và viết logic điều kiện trong Android.

---

## 🚀 Tính năng chính

✅ Nhập **chiều cao (cm)** và **cân nặng (kg)**  
✅ Chọn tiêu chuẩn đánh giá: **Toàn cầu** hoặc **Châu Á**  
✅ Nhấn **Tính BMI** để xem kết quả  
✅ Hiển thị **chỉ số BMI** và **phân loại sức khỏe tương ứng**  
✅ Giao diện tiếng Việt thân thiện, dễ hiểu, phù hợp người mới học Android  
✅ Sử dụng hoàn toàn bằng **Java** và **XML Layout**

---



## 🖼️ Giao diện ban đầu

<img src="./Screenshot_20251022_001955.png" alt="Giao diện ban đầu" width="300"/>

## 🖼️ Giao diện lúc sau
<img src="./Screenshot_20251022_002042.png" alt="Giao diện lúc sau" width="300"/>

---

## ⚙️ Cách sử dụng

1. **Nhập chiều cao** (tính bằng cm)  
2. **Nhập cân nặng** (tính bằng kg)  
3. Chọn **tiêu chuẩn đánh giá** (Toàn cầu / Châu Á)  
4. Nhấn **Tính BMI** để xem kết quả  
5. Ứng dụng sẽ hiển thị:
   - **Chỉ số BMI** (số thập phân 2 chữ số)
   - **Phân loại sức khỏe** (Thiếu cân, Bình thường, Thừa cân, Béo phì)

---

## 🧠 Kiến thức áp dụng

| Thành phần | Mục đích |
|-------------|----------|
| `EditText` | Nhập chiều cao và cân nặng |
| `RadioGroup`, `RadioButton` | Chọn tiêu chuẩn đánh giá |
| `Button` | Bắt sự kiện tính toán |
| `TextView` | Hiển thị kết quả |
| `OnClickListener` | Xử lý sự kiện bấm nút |
| `if-else` | Logic phân loại sức khỏe |
| `Toast` | Thông báo lỗi khi thiếu dữ liệu |

---

## 💡 Bảng phân loại BMI (theo WHO)

| Phân loại | BMI (kg/m²) – Toàn cầu | BMI (kg/m²) – Châu Á |
|------------|------------------------|----------------------|
| Thiếu cân | < 18.5 | < 18.5 |
| Bình thường | 18.5 – 24.9 | 18.5 – 22.9 |
| Thừa cân | 25.0 – 29.9 | 23.0 – 24.9 |
| Béo phì | ≥ 30.0 | ≥ 25.0 |

---

## ✨ Mục tiêu bài học

- Thiết kế giao diện người dùng bằng **XML**  
- Xử lý sự kiện với **OnClickListener**  
- Áp dụng **điều kiện (if-else)** trong Java  
- Hiển thị thông tin kết quả trên **TextView**  
- Làm quen với chuẩn thiết kế **Material Design đơn giản**

---

# 📱 TH_Bai3_Chuyenmanhinh_Fragment2

Ứng dụng Android minh họa **chuyển màn hình (Activity)** và **sử dụng Fragment cơ bản**, được phát triển trong khuôn khổ môn *Lập trình Giao diện Cơ bản (Basic GUI Programming)*.

---

## ✨ Tính năng chính
- Chuyển đổi giữa hai màn hình (Activity 1 → Activity 2) bằng `Intent`.
- Truyền dữ liệu giữa các màn hình.
- Sử dụng `Fragment` để hiển thị nội dung động.
- Thiết kế giao diện hiện đại với Material Components.

---

## 🛠️ Công nghệ sử dụng
- **Ngôn ngữ:** Java  
- **IDE:** Android Studio  
- **Thư viện:** AndroidX, Material Design  

---
## 🖼️ Giao diện ứng dụng ban đầu
### 🔹 Màn hình chính

<img src="./Screenshot_20251022_004521.png" alt="Giao diện ban đầu" width="300"/>

### 🔹 Màn hình thứ hai / Fragment

<img src="./Screenshot_20251022_004605.png" alt="Giao diện ban đầu" width="300"/>

## 🖼️ Giao diện ứng dụng sau khi
### 🔹 Màn hình chính

<img src="./Screenshot_20251022_004716.png" alt="Giao diện lúc sau" width="300"/>

### 🔹 Màn hình thứ hai / Fragment

<img src="./Screenshot_20251022_004735.png" alt="Giao diện lúc sau" width="300"/>

--

# 🌟 TH_Layout_Simple2

Ứng dụng Android trình bày **giao diện hồ sơ người dùng (User Profile Layout)** hiện đại, được xây dựng trong khuôn khổ môn *Lập trình Giao Diện Cơ Bản (Basic GUI Programming)*.

---

## ✨ Tính năng nổi bật
- Hiển thị **ảnh bìa** và **ảnh đại diện tròn (Circle ImageView)**.
- Thông tin cơ bản: tên, nghề nghiệp, vị trí.
- Thống kê: số lượng **followers**, **following** và **likes**.
- Các nút chức năng: **Edit profile**, **Add friends**.
- Thanh điều hướng dưới cùng (Bottom Navigation).
- Bố cục gọn gàng, dùng **LinearLayout + RelativeLayout + RecyclerView**.

---

## 🛠️ Công nghệ sử dụng
- **Ngôn ngữ:** Java  
- **IDE:** Android Studio  
- **Thư viện:**  
  - `de.hdodenhof:circleimageview` (để hiển thị ảnh đại diện tròn)  
  - Material Design Components  

---

## 🖼️ Giao diện ứng dụng

### 📱 Giao diện chính (Profile)
<img src="./Screenshot 2025-10-22 010920.png" alt="Giao diện ban đầu" width="300"/>

--

# 🔐 TH_Layout_SimpleLogin

Ứng dụng Android thiết kế **màn hình đăng ký tài khoản (Sign Up)** hiện đại, nhằm thực hành bố cục giao diện và xử lý form trong môn *Lập trình Giao diện Cơ Bản (Basic GUI Programming)*.

---

## ✨ Tính năng chính
- Nhập thông tin người dùng: **Email**, **Số điện thoại**, **Mật khẩu** và **Xác nhận mật khẩu**.
- Nút **Create Account** với hiệu ứng màu gradient.
- Biểu tượng icon trong mỗi ô nhập (Email, Phone, Password).
- Phong cách Material Design với bố cục sạch, cân đối.
- Liên kết dưới cùng để **chuyển sang trang Login**.

---

## 🛠️ Công nghệ sử dụng
- **Ngôn ngữ:** Java  
- **IDE:** Android Studio  
- **Thư viện:** Material Design, AndroidX  

---

## 🖼️ Giao diện ứng dụng

<p align="center">
  <img src="./Screenshot%202025-10-22%20010802.png" 
       alt="Giao diện đăng ký tài khoản" 
       width="300"/>
</p>
## 👨‍💻 Tác giả

**Tên sinh viên:** [Nguyễn Gia Khiêm]  
**Lớp:** [65.CNTT_CLC]  
**Trường:** [Đại học Nha Trang]  
**Email:** [gk699488@gmail.com]

---


