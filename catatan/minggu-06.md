# Catatan Minggu 06: UML dan SOLID

## Yang saya kerjakan
Saya membuat Class Diagram menggunakan Mermaid (`.mmd`) berdasarkan class, atribut, method, dan hubungan antarclass yang ada di program. Saya juga membuat Sequence Diagram untuk menggambarkan proses pengajuan peminjaman dengan dua kondisi, yaitu pengajuan berhasil dan ketika terjadi bentrok. Selain itu, saya melengkapi dokumentasi penerapan prinsip SOLID di `docs/uml/solid.md`.

## Keputusan desain
Saya memilih tiga prinsip SOLID, yaitu Open/Closed Principle (OCP), Liskov Substitution Principle (LSP), dan Dependency Inversion Principle (DIP). OCP diterapkan melalui interface `AturanDenda` yang memiliki implementasi `DendaFlat` dan `DendaProgresif`. LSP ditunjukkan melalui class `Laptop`, `Ruang`, dan `AlatLab` yang merupakan turunan dari `Aset`. Sedangkan DIP ditunjukkan melalui penggunaan `AturanDenda` sebagai abstraksi pada `LayananDenda`.

## Kendala
Saat membuat diagram, saya perlu menyesuaikan hubungan antarclass dan alur peminjaman dengan struktur kode yang sudah ada. Saya juga perlu memperhatikan beberapa bagian yang masih dalam tahap pengerjaan agar diagram dan dokumentasi tetap sesuai dengan kondisi program.

## Penggunaan AI
- **Alat yang dipakai:** Copilot AI di VS Code.
- **Bagian yang dibantu AI:** Membantu menyusun diagram UML menggunakan Mermaid dan memahami prinsip SOLID
- **Prompt utama:** "Bagaimana cara membuat Class Diagram dan Sequence Diagram menggunakan Mermaid serta menjelaskan penerapan prinsip SOLID pada project minggu 06?"
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:** Saya menyesuaikan hasil diagram dan penjelasannya agar sesuai dengan struktur kode yang sudah ada.
- **Satu hal yang saya pahami lebih baik sekarang:** Saya lebih memahami bahwa prinsip SOLID membantu mengatur hubungan antarclass agar program lebih terstruktur dan mudah dikembangkan.

## Hasil Pengujian

```
PS D:\#Semester 3\Object Oriented Programming\oop-202601-250202917> mvn -B -ntp test "-Dgroups=week6"
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
[INFO] Running id.ac.upb.asetpinjam.Minggu06DokumenTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.097 s -- in id.ac.upb.asetpinjam.Minggu06DokumenTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
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
[INFO] Aset-Pinjam Core (minggu 1-11) ..................... SUCCESS [  3.896 s]
[INFO] Aset-Pinjam API (minggu 12-15) ..................... SUCCESS [  1.042 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.478 s
[INFO] Finished at: 2026-11-12T17:10:27+07:00
[INFO] ------------------------------------------------------------------------
PS D:\#Semester 3\Object Oriented Programming\oop-202601-250202917> 
```