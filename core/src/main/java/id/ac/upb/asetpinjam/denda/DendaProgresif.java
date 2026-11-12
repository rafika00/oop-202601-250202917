package id.ac.upb.asetpinjam.denda;

import id.ac.upb.asetpinjam.kontrak.AturanDenda;
import id.ac.upb.asetpinjam.model.Aset;

/**
 * Minggu 5: denda yang makin berat bila makin lama terlambat.
 *
 * <p>Rumus progresifnya KEPUTUSAN ANDA (catat di docs/asumsi.md). Syarat minimal yang diuji:
 * 0 hari = 0; tidak pernah lebih murah dari DendaFlat; tidak pernah turun saat hari bertambah.
 */
public class DendaProgresif implements AturanDenda {

    @Override
    public long hitung(Aset aset, int hariTerlambat) {
        if (hariTerlambat < 0) {
            throw new IllegalArgumentException("hariTerlambat tidak boleh negatif");
        }

        long dendaHarian = aset.hitungDenda(1);
        long faktorProgresif = (long) hariTerlambat * (hariTerlambat + 1L) / 2;
        return Math.multiplyExact(dendaHarian, faktorProgresif);
    }
}
