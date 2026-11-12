# Prinsip SOLID yang Terlihat di Kode

## Open/Closed Principle (OCP)
`AturanDenda` di paket `id.ac.upb.asetpinjam.kontrak` menjadi abstraksi untuk perhitungan denda. `DendaFlat` dan `DendaProgresif` mengimplementasikan kontrak yang sama dengan rumus berbeda. Jenis aturan baru dapat dibuat sebagai implementasi `AturanDenda` tanpa mengubah kedua kelas yang sudah ada. `LayananDenda` belum menjalankan injeksi strategi karena konstruktor dan `hitung()` masih TODO minggu 10, sehingga diagram dan penjelasan ini tidak mengklaim pemilihan strategi sudah berfungsi pada runtime.

## Single Responsibility Principle (SRP)
`DendaFlat` bertanggung jawab menghitung denda tetap dengan meneruskan perhitungan ke `Aset.hitungDenda()`. `DendaProgresif` bertanggung jawab menghitung denda progresif berdasarkan jumlah hari keterlambatan. Keduanya tidak mengelola jadwal, status peminjaman, maupun penyimpanan aset; aturan perhitungan dipisahkan dari tanggung jawab kelas-kelas tersebut.
