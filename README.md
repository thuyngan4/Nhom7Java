## Hướng dẫn cài đặt chương trình:
### Yêu cầu: 
- Cài đặt Java JDK 22
- SQL Server

### Các bước cài đặt:
- Clone hoặc tải xuống repo
- Mở và chạy file ?.sql trong thư mục Database (SQL SERVER)
- Mở project bằng Eclipse
- Mở file src/quanlydienthoai/Connect/ConnectDB.java: Thay đổi CODE, USERNAME và PASSWORD kết nối với SQL SERVER

### Chạy chương trình:
- Màn hình đăng nhập được hiển thị(chạy file login)
- Đăng nhập với tài khoản mặc định:
  * Tài khoản Admin
    ``` bash
      Tài khoản: admin
      Mật khẩu: 123
    ```
  * Tài khoản Employee
    ``` bash
      Tài khoản: ngan123
      Mật khẩu: 123
    ```

#### Chức năng trưởng phòng (đăng nhập với admin)
- Đăng nhập/ đăng xuất
- Quản lý nhân viên:
  * Xem
  * Thêm
  * Sửa 
  * Xóa
  * Tìm kiếm nhân viên theo tên
  * Nhập/xuất dữ liệu giữa SQL 
  * Xem chi tiết các đơn hàng đã thực hiện bởi 1 nhân viên
- Báo cáo doanh thu
  * Tất cả:
    * Hiển thị tất cả
    * Hiển thị theo năm
    * Hiển thị theo tháng và năm

#### Chức năng nhân viên (đăng nhập với user)
- Đăng nhập/ đăng xuất
- Quản lý điện thoại:
  * Hiển thị tất cả điện thoại
  * Thêm điện thoại mới
  * Sửa điện thoại
  * Xóa điện thoại
  * Tìm kiếm điện thoại theo tên 
- Quản lý đơn hàng:
  * Hiển thị tất cả điện thoại
  * Thêm vào giỏ hàng
  * Xóa điện thoại trong giỏ hàng
  * Thanh toán để tạo đơn hàng
  * Tìm kiếm điện thoại trong bảng Phone
  * Hiện lịch sử giao dịch của nhân viên đó
