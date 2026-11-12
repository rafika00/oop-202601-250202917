# Asumsi dan Keputusan Desain

Isi bagian ini sendiri. Satu entri per keputusan. Dinilai dari kejelasan alasan dan konsistensi dengan kode dan tes Anda,
bukan dari jawaban "benar".

Format tiap entri:

```
## A-NN: judul singkat
- Pertanyaan: ...
- Keputusan: ...
- Alasan: ...
- Dampak ke kode: ... (kelas/metode)
- Tes yang membuktikan: ... (nama tes di folder mahasiswa/)
```

## Aturan ambigu dari docs/aturan-bisnis.md

Salin setiap pertanyaan ambigu (nomor 1 sampai 7) ke sini dan jawab. Contoh:

## A-01: batas waktu bentrok
- Pertanyaan: 09:00-11:00 dan 11:00-13:00 pada aset yang sama bentrok atau tidak?
- Keputusan: Tidak bentrok; rentang waktu diperlakukan setengah terbuka.
- Alasan: Aset dapat langsung dipinjam peminjam berikutnya ketika jadwal sebelumnya selesai.
- Dampak ke kode: `JadwalPeminjaman.bentrok()` hanya menganggap rentang tumpang tindih jika waktu mulai lebih awal dari waktu selesai peminjaman lain.
- Tes yang membuktikan: `BatasBentrokTest.selesaiSamaDenganMulai()`.

## Asumsi lain

Tambahkan di sini keputusan lain yang Anda ambil: rumus denda progresif, perubahan skema database, format error API, dan seterusnya.

## A-02: rumus denda progresif
- Pertanyaan: Bagaimana denda progresif bertambah seiring jumlah hari keterlambatan?
- Keputusan: Total denda adalah denda flat harian dikalikan `hariTerlambat * (hariTerlambat + 1) / 2`.
- Alasan: Rumus akumulatif ini menjaga denda tidak lebih murah dari flat, tidak turun saat hari bertambah, dan lebih mahal pada hari ke-30.
- Dampak ke kode: `DendaProgresif.hitung()`.
- Tes yang membuktikan: `Minggu05AbstraksiTest.dendaProgresifMemenuhiSyaratMinimal()`.
