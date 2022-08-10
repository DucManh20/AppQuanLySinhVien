-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th8 10, 2022 lúc 04:02 PM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `students`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bang_diem`
--

CREATE TABLE `bang_diem` (
  `Ma` int(10) NOT NULL,
  `MaSinhVien` char(7) NOT NULL,
  `ThanhPhan1` float DEFAULT NULL,
  `ThanhPhan2` float DEFAULT NULL,
  `CuoiKy` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `bang_diem`
--

INSERT INTO `bang_diem` (`Ma`, `MaSinhVien`, `ThanhPhan1`, `ThanhPhan2`, `CuoiKy`) VALUES
(17, 'AT16000', 10, 9, 8),
(23, 'AT16001', 10, 10, 10),
(24, 'AT16005', 8, 5, 9),
(25, 'AT16009', 7, 7, 7);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nguoi_dung`
--

CREATE TABLE `nguoi_dung` (
  `TenDangNhap` varchar(100) NOT NULL,
  `MatKhau` varchar(50) DEFAULT NULL,
  `VaiTro` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `nguoi_dung`
--

INSERT INTO `nguoi_dung` (`TenDangNhap`, `MatKhau`, `VaiTro`) VALUES
('admin', 'admin', 'Admin'),
('manh', 'manh', 'Đào Tạo'),
('Nguyen Van A', 'a', 'Giảng Viên');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sinh_vien`
--

CREATE TABLE `sinh_vien` (
  `MaSinhVien` char(7) NOT NULL,
  `HoTen` varchar(50) NOT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `SoDT` varchar(50) DEFAULT NULL,
  `GioiTinh` varchar(6) DEFAULT NULL,
  `DiaChi` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `sinh_vien`
--

INSERT INTO `sinh_vien` (`MaSinhVien`, `HoTen`, `Email`, `SoDT`, `GioiTinh`, `DiaChi`) VALUES
('AT16000', 'B', 'B@gmail.com', '00000', 'Nữ', 'Hải Dương'),
('AT16001', 'A', 'A@gmail.com', '00000', 'Nam', 'Hà Nội'),
('AT16003', 'C', 'B@gmail.com', '00000', 'Nữ', 'Hưng Yên'),
('AT16005', 'H', 'H@gmail.com', '00000', 'Nam', 'Hà Nội'),
('AT16009', 'B', 'B@gmail.com', '00000', 'Nam', 'Hưng Yên');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `bang_diem`
--
ALTER TABLE `bang_diem`
  ADD PRIMARY KEY (`Ma`),
  ADD UNIQUE KEY `index_name` (`Ma`),
  ADD UNIQUE KEY `MaSinhVien` (`MaSinhVien`),
  ADD KEY `Ma` (`Ma`),
  ADD KEY `Ma_2` (`Ma`);

--
-- Chỉ mục cho bảng `nguoi_dung`
--
ALTER TABLE `nguoi_dung`
  ADD PRIMARY KEY (`TenDangNhap`);

--
-- Chỉ mục cho bảng `sinh_vien`
--
ALTER TABLE `sinh_vien`
  ADD PRIMARY KEY (`MaSinhVien`),
  ADD UNIQUE KEY `MaSinhVien` (`MaSinhVien`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `bang_diem`
--
ALTER TABLE `bang_diem`
  MODIFY `Ma` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `bang_diem`
--
ALTER TABLE `bang_diem`
  ADD CONSTRAINT `bang_diem_ibfk_1` FOREIGN KEY (`MaSinhVien`) REFERENCES `sinh_vien` (`MaSinhVien`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
