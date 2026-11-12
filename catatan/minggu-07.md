# Catatan Minggu 07: Koleksi

## Yang saya kerjakan
Saya melengkapi `JadwalPeminjaman` untuk memeriksa bentrok, mengurutkan peminjaman berdasarkan waktu mulai, mengelompokkan peminjaman berdasarkan kode aset, dan menghapus peminjaman berdasarkan ID. Saya juga menambahkan tes batas waktu untuk peminjaman yang dimulai tepat saat peminjaman lama selesai, serta peminjaman yang selesai tepat saat peminjaman lama dimulai.

## Keputusan desain
Saya memutuskan bahwa peminjaman yang selesai tepat saat peminjaman lain dimulai pada aset yang sama tidak bentrok. Pemeriksaan tumpang tindih memakai rentang setengah terbuka. Saya mempertahankan `List` sebagai satu-satunya struktur penyimpanan internal; hasil pengurutan dibuat dari salinan daftar, sedangkan pengelompokan dibuat saat diminta menggunakan `HashMap`.

## Kendala
Hal yang perlu dipastikan adalah kasus batas waktu tidak keliru dianggap sebagai tumpang tindih. Saya mengatasinya dengan membandingkan waktu mulai secara ketat terhadap waktu selesai peminjaman lain, lalu membuktikan keputusan tersebut dengan tes khusus.

## Penggunaan AI
- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Implementasi metode minggu 07 dan penulisan tes batas waktu.
- Prompt utama: "Bagaimana cara mengerjakan tugas minggu 07 tentang koleksi sesuai instruksi praktikum, termasuk implementasi fitur yang diminta, penggunaan struktur data yang tepat, dan pengujian agar hasilnya sesuai ketentuan?"
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya sendiri memilih bahwa waktu selesai yang sama dengan waktu mulai berikutnya tidak dianggap bentrok, karena aset dapat langsung digunakan pada waktu tersebut.
- Satu hal yang saya pahami lebih baik sekarang: Dengan syarat `mulaiBaru < selesaiLama` dan `selesaiBaru > mulaiLama`, dua peminjaman yang hanya bertemu di batas waktu tidak dianggap tumpang tindih.

## Hasil Pengujian

```
PS D:\#Semester 3\Object Oriented Programming\oop-202601-250202917> mvn -B -ntp test "-Dgroups=week7"
[INFO] Scanning for projects...
[INFO] Loaded 24457 auto-discovered prefixes for remote repository central (prefixes-central.txt)
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
[INFO] Loaded 64 auto-discovered prefixes for remote repository apache.snapshots (prefixes-apache.snapshots.txt)
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
[INFO] Running id.ac.upb.asetpinjam.mahasiswa.BatasBentrokTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.080 s -- in id.ac.upb.asetpinjam.mahasiswa.BatasBentrokTest
[INFO] Running id.ac.upb.asetpinjam.Minggu07JadwalTest
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.038 s -- in id.ac.upb.asetpinjam.Minggu07JadwalTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0
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
[INFO] Aset-Pinjam Core (minggu 1-11) ..................... SUCCESS [  3.064 s]
[INFO] Aset-Pinjam API (minggu 12-15) ..................... SUCCESS [  1.220 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.923 s
[INFO] Finished at: 2026-11-12T21:19:23+07:00
[INFO] ------------------------------------------------------------------------
PS D:\#Semester 3\Object Oriented Programming\oop-202601-250202917> 
```