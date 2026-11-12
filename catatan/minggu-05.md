# Catatan Minggu 05: Abstraction

## Yang saya kerjakan
Saya melengkapi method `bisaDipinjam()` untuk menentukan apakah aset dapat dipinjam berdasarkan status dan kondisinya. Saya juga menerapkan konsep abstraction pada class `Aset` dengan menjadikannya abstract class dan menggunakan method abstrak `hitungDenda()`. Selain itu, saya membuat implementasi perhitungan denda flat dan progresif.

## Keputusan desain
Saya menggunakan rumus denda progresif akumulatif, yaitu denda harian dikalikan `hariTerlambat * (hariTerlambat + 1) / 2`. Rumus ini digunakan untuk membedakan perhitungan denda flat dan progresif sesuai ketentuan tugas.

## Kendala
Saya menyesuaikan perhitungan denda agar hasilnya sesuai dengan aturan yang ditentukan. Saya juga memastikan jumlah hari keterlambatan tidak boleh bernilai negatif.

## Penggunaan AI
- **Alat yang dipakai:** ChatGPT.
- **Bagian yang dibantu AI:** Membantu memahami dan mengimplementasikan abstraction pada class Aset, method `bisaDipinjam()`, serta strategi perhitungan denda flat dan progresif.
- **Prompt utama:** "Bagaimana cara mengerjakan minggu 05 sesuai instruksi dan aturan yang diberikan tanpa mengubah bagian kode yang tidak diperlukan?"
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:** Saya menyesuaikan beberapa bagian kode agar sesuai dengan ketentuan tugas dan struktur program yang sudah ada.
- **Satu hal yang saya pahami lebih baik sekarang:** Saya lebih memahami penggunaan abstract class dan interface dalam menerapkan konsep abstraction pada Java.

## Hasil Pengujian

```
PS D:\#Semester 3\Object Oriented Programming\oop-202601-250202917> mvn -B -ntp test "-Dgroups=week5"
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
[INFO] Running id.ac.upb.asetpinjam.Minggu05AbstraksiTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.095 s -- in id.ac.upb.asetpinjam.Minggu05AbstraksiTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
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
[INFO] Aset-Pinjam Core (minggu 1-11) ..................... SUCCESS [  2.676 s]
[INFO] Aset-Pinjam API (minggu 12-15) ..................... SUCCESS [  4.045 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.321 s
[INFO] Finished at: 2026-11-12T14:22:18+07:00
[INFO] ------------------------------------------------------------------------
PS D:\#Semester 3\Object Oriented Programming\oop-202601-250202917> 
```
