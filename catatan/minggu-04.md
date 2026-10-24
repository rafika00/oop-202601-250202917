# Catatan Minggu 04: Polymorphism

## Yang saya kerjakan

Pada minggu keempat, saya mengerjakan penerapan polymorphism pada sistem peminjaman aset. Saya melengkapi method `hitungDenda()` pada class `Ruang`, `Laptop`, dan `AlatLab` dengan pengali denda yang berbeda sesuai jenis asetnya. Saya juga melengkapi dua method `cari()` pada class `KatalogAset` untuk mencari aset berdasarkan nama dan berdasarkan nama beserta jenis aset. Selain itu, saya mempelajari perbedaan method overriding dan overloading serta penerapan dynamic binding dalam Java.

## Keputusan desain

Saya menggunakan method pembantu `hitungDenda(int hariTerlambat, int multiplier)` pada class `Aset` agar rumus perhitungan denda tidak perlu ditulis berulang kali. Pengali denda ditentukan berdasarkan jenis aset, yaitu 1 untuk `Ruang`, 2 untuk `Laptop`, dan 4 untuk `AlatLab`. Tarif dasar denda menggunakan nilai dari `Varian.aktif().dendaPerHari` agar mengikuti konfigurasi varian proyek.

Pada class `KatalogAset`, saya menggunakan dua method `cari()` dengan parameter berbeda. Pencarian nama dilakukan tanpa membedakan huruf besar dan kecil, sedangkan pencarian dengan parameter `JenisAset` digunakan untuk membatasi hasil sesuai jenis aset yang dipilih.

## Kendala

Saya perlu memahami perbedaan overriding dan overloading karena keduanya memiliki fungsi yang berbeda meskipun menggunakan nama method yang sama. Saya juga perlu memastikan bahwa perhitungan denda menggunakan pengali yang sesuai dan menolak jumlah hari keterlambatan yang negatif. Untuk mengatasinya, saya mempelajari kembali ketentuan tugas dan memeriksa logika kode yang digunakan.

## Penggunaan AI

- **Alat yang dipakai:** ChatGPT.
- **Bagian yang dibantu AI:** Membantu memahami penerapan polymorphism dan memeriksa kode program Minggu 4.
- **Prompt utama:**
  1. "Bantu saya memahami materi polymorphism dalam Java."
  2. "Periksa apakah kode program saya sudah sesuai dengan ketentuan tugas."
  3. "Jelaskan perbedaan method overriding dan overloading serta penerapannya dalam program Java."
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:** Saya menyesuaikan saran AI dengan aturan tugas Minggu 4 dan mempertahankan penggunaan tarif dari Varian.aktif().dendaPerHari. Saya tidak menambahkan aturan baru yang tidak diminta dalam tugas.
- **Satu hal yang saya pahami lebih baik sekarang:** Saya lebih memahami bahwa overriding memungkinkan subclass memiliki implementasi method yang berbeda, sedangkan overloading memungkinkan beberapa method memiliki nama yang sama dengan parameter berbeda. Saya juga memahami bahwa dynamic binding menentukan implementasi method yang dijalankan berdasarkan objek sebenarnya.

## Hasil Pengujian
Setelah menyelesaikan implementasi, saya menjalankan pengujian menggunakan perintah `mvn -B -ntp test "-Dgroups=week4"`. Hasil pengujian menunjukkan bahwa 8 tes berhasil dijalankan tanpa kegagalan maupun error, dan proses build selesai dengan status `BUILD SUCCESS`.

```
PS D:\#Semester 3\Object Oriented Programming\oop-202601-250202917> mvn -B -ntp test "-Dgroups=week4"
[INFO] Scanning for projects...
[INFO] Loaded 24218 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] Aset-Pinjam (OOP 202601)                                           [pom]
[INFO] Aset-Pinjam Core (minggu 1-11)                                     [jar]
[INFO] Aset-Pinjam API (minggu 12-15)                                     [jar]
[INFO] 
[INFO] --------------------< id.ac.upb:asetpinjam-parent >---------------------
[INFO] Building Aset-Pinjam (OOP 202601) 0.1.0                            [1/3]
[INFO]   from pom.xml
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] ---------------------< id.ac.upb:asetpinjam-core >----------------------
[INFO] Building Aset-Pinjam Core (minggu 1-11) 0.1.0                      [2/3]
[INFO]   from core\pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] Loaded 74 auto-discovered prefixes for remote repository apache.snapshots (prefixes-apache.snapshots.txt)
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ asetpinjam-core ---
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] 
[INFO] --- compiler:3.14.1:compile (default-compile) @ asetpinjam-core ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ asetpinjam-core ---
[INFO] skip non existing resourceDirectory D:\#Semester 3\Object Oriented Programming\oop-202601-250202917\core\src\test\resources
[INFO] 
[INFO] --- compiler:3.14.1:testCompile (default-testCompile) @ asetpinjam-core ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- surefire:3.5.6:test (default-test) @ asetpinjam-core ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running id.ac.upb.asetpinjam.Minggu04PolimorfismeTest
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.111 s -- in id.ac.upb.asetpinjam.Minggu04PolimorfismeTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] ----------------------< id.ac.upb:asetpinjam-api >----------------------
[INFO] Building Aset-Pinjam API (minggu 12-15) 0.1.0                      [3/3]
[INFO]   from api\pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ asetpinjam-api ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] 
[INFO] --- compiler:3.14.1:compile (default-compile) @ asetpinjam-api ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ asetpinjam-api ---
[INFO] skip non existing resourceDirectory D:\#Semester 3\Object Oriented Programming\oop-202601-250202917\api\src\test\resources
[INFO] 
[INFO] --- compiler:3.14.1:testCompile (default-testCompile) @ asetpinjam-api ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- surefire:3.5.6:test (default-test) @ asetpinjam-api ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 0, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for Aset-Pinjam (OOP 202601) 0.1.0:
[INFO] 
[INFO] Aset-Pinjam (OOP 202601) ........................... SUCCESS [  0.003 s]
[INFO] Aset-Pinjam Core (minggu 1-11) ..................... SUCCESS [  2.752 s]
[INFO] Aset-Pinjam API (minggu 12-15) ..................... SUCCESS [  1.125 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.493 s
[INFO] Finished at: 2026-10-24T23:39:46+07:00
[INFO] ------------------------------------------------------------------------
PS D:\#Semester 3\Object Oriented Programming\oop-202601-250202917> 
```