-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 17 Nov 2022 pada 05.23
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_library`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_buku`
--

CREATE TABLE `tb_buku` (
  `no_bk` int(11) NOT NULL,
  `nama_bk` varchar(255) NOT NULL,
  `pengarang_bk` varchar(255) NOT NULL,
  `stok_bk` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_buku`
--

INSERT INTO `tb_buku` (`no_bk`, `nama_bk`, `pengarang_bk`, `stok_bk`) VALUES
(1, 'Robin Hood', 'Paul Creswick.', 103),
(2, 'Para Priyayi', 'Umar Kayam', 3),
(3, 'The Missing Rose', 'Serdar Ozkan', 9),
(4, 'Musashi', 'Eiji Yoshikawa', 5),
(5, 'Manusia Kamar', 'Seno Gumira Ajidarma', 8),
(6, 'Senyum Karyamin', 'Ahmad Tohari', 10),
(7, 'seleksi alam', 'lusiwulan ', 20),
(8, 'belajar java', 'muhammad akbar', 20);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_peminjam`
--

CREATE TABLE `tb_peminjam` (
  `id` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `no_bk` int(11) NOT NULL,
  `jumlah_bk` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_users`
--

CREATE TABLE `tb_users` (
  `userID` int(11) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `nim` varchar(255) DEFAULT NULL,
  `kelas` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_users`
--

INSERT INTO `tb_users` (`userID`, `nama`, `nim`, `kelas`, `username`, `password`) VALUES
(1, 'jokowi dodo', '312110488', 'TI.21.A3', 'akbaroke', 'akbar123'),
(3, 'jokowi', '312110422', 'TI.21.A3', 'joko', 'joko123'),
(5, 'Muhammad Akbar', '312110483', 'TI.21.A3', 'akbaroke833', 'akbar123'),
(6, 'udin gilak', '312110455', 'TI.21.A2', 'udin123', '123456'),
(7, 'M.Akbar', '312110483', 'ti.21.a3', 'akbar833', 'akbar123');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_buku`
--
ALTER TABLE `tb_buku`
  ADD PRIMARY KEY (`no_bk`);

--
-- Indeks untuk tabel `tb_peminjam`
--
ALTER TABLE `tb_peminjam`
  ADD PRIMARY KEY (`id`),
  ADD KEY `no_bk` (`no_bk`),
  ADD KEY `no_bk_2` (`no_bk`);

--
-- Indeks untuk tabel `tb_users`
--
ALTER TABLE `tb_users`
  ADD PRIMARY KEY (`userID`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_buku`
--
ALTER TABLE `tb_buku`
  MODIFY `no_bk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `tb_peminjam`
--
ALTER TABLE `tb_peminjam`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `tb_users`
--
ALTER TABLE `tb_users`
  MODIFY `userID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
