# Catatan Minggu-03: Inheritance

## Yang saya kerjakan
Saya melengkapi class `Ruang.java`, `Laptop.java`, dan `AlatLab.java` sebagai turunan dari class `Aset`. Saya menambahkan atribut, konstruktor, getter, dan validasi sesuai ketentuan. Saya juga mengimplementasikan method `getJenis()` untuk menunjukkan jenis aset masing-masing.

## Keputusan desain
Saya menempatkan atribut umum seperti kode dan nama pada class induk `Aset`, sedangkan atribut khusus ditempatkan pada subclass masing-masing. Dengan inheritance, ketiga subclass dapat menggunakan konstruktor dan validasi dari class induk tanpa menulis ulang kode yang sama.

## Contoh Inheritance dan Komposisi
Data penanggung jawab aset lebih tepat menggunakan komposisi daripada inheritance. Penanggung jawab bukan jenis dari aset, melainkan objek yang berhubungan dengan aset. Oleh karena itu, objek `Aset` dapat memiliki objek `PenanggungJawab` tanpa menjadikan `PenanggungJawab` sebagai class turunan dari `Aset`.

## Kendala
Saya perlu memastikan setiap subclass memiliki validasi yang sesuai dengan ketentuan. Saya mengatasinya dengan memeriksa nilai masukan pada konstruktor sebelum menyimpan data aset.

## Penggunaan AI
- **Alat yang dipakai:** ChatGPT.
- **Bagian yang dibantu AI:** Implementasi class `Ruang`, `Laptop`, dan `AlatLab`.
- **Prompt utama:** Bagaimana cara membuat class `Ruang`, `Laptop`, dan `AlatLab` menggunakan inheritance sesuai aturan yang diberikan?
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:** Saya menyesuaikan kode dengan instruksi praktikum dan memastikan validasi setiap jenis aset sudah sesuai ketentuan.
- **Satu hal yang saya pahami lebih baik sekarang:** Saya memahami bahwa inheritance memungkinkan class turunan menggunakan fitur dari class induk dan menambahkan atribut atau method khusus sesuai kebutuhan masing-masing class.

## Hasil Pengujian

```
PS D:\#Semester 3\Object Oriented Programming\oop-202601-250202917> mvn -B -ntp test "-Dgroups=week3"
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
[INFO] Running id.ac.upb.asetpinjam.Minggu03HierarkiTest
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.137 s -- in id.ac.upb.asetpinjam.Minggu03HierarkiTest
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
[INFO] Aset-Pinjam (OOP 202601) ........................... SUCCESS [  0.004 s]
[INFO] Aset-Pinjam Core (minggu 1-11) ..................... SUCCESS [  4.164 s]
[INFO] Aset-Pinjam API (minggu 12-15) ..................... SUCCESS [  3.357 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  10.830 s
[INFO] Finished at: 2026-10-24T09:16:10+07:00
[INFO] ------------------------------------------------------------------------
PS D:\#Semester 3\Object Oriented Programming\oop-202601-250202917> 
```
