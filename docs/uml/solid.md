# Prinsip SOLID pada Kode Saat Ini

## Open/Closed Principle (OCP)
`AturanDenda` pada paket `id.ac.upb.asetpinjam.kontrak` menjadi kontrak untuk variasi perhitungan denda. `DendaFlat` dan `DendaProgresif` mengimplementasikan kontrak itu dengan algoritma berbeda. Aturan denda baru dapat ditambahkan sebagai implementasi lain tanpa mengubah dua kelas aturan yang sudah ada. `Aset` juga menggunakan metode abstrak `hitungDenda(int)` yang dioverride oleh `Laptop`, `Ruang`, dan `AlatLab`, sehingga setiap jenis aset menentukan perhitungan denda masing-masing. Catatan: `LayananDenda` direncanakan menerima `AturanDenda`, tetapi implementasinya masih TODO minggu 10.

## Liskov Substitution Principle (LSP)
`Laptop`, `Ruang`, dan `AlatLab` adalah turunan `Aset` dan masing-masing mengimplementasikan operasi abstrak `hitungDenda(int)` serta menyediakan `getJenis()`. Metode aturan denda menerima parameter bertipe `Aset`, bukan tipe konkret; karena itu objek dari ketiga subclass dapat diberikan melalui kontrak tersebut. Pemanggil tetap dapat menggunakan operasi umum seperti `bisaDipinjam()` dan `hitungDenda(...)` tanpa perlu mengetahui subclass yang digunakan.

## Dependency Inversion Principle (DIP)
Signature konstruktor `LayananDenda(AturanDenda aturan)` menunjukkan bahwa layanan dirancang bergantung pada abstraksi `AturanDenda`, bukan langsung membuat atau memilih `DendaFlat` maupun `DendaProgresif`. Kedua kelas tersebut mengimplementasikan abstraksi yang sama, sehingga aturan dapat dipilih dari luar layanan. Namun, konstruktor dan `hitung()` masih TODO minggu 10 dan kelasnya belum memiliki field untuk menyimpan aturan; karena itu DIP baru tampak pada kontrak/signature dan belum berfungsi sebagai dependency injection pada runtime.

## Catatan
Diagram kelas mengikuti kelas dan method yang benar-benar ada di `core/src/main/java`. Method yang masih berupa TODO pada minggu berikutnya tetap digambar sesuai signature-nya, bukan ditambah kelas baru yang belum ada di kode. Diagram sequence juga mencatat ketika suatu kelas yang relevan untuk prinsip SOLID tidak terlibat dalam alur yang sedang digambarkan.
