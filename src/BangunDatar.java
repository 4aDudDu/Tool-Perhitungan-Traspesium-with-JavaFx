// ini abstraksi
interface BangunDatar {
    double hitungLuas();
}

// ini contoh dari kelas abstraksinya pak
abstract class Trapesium implements BangunDatar {
    protected double panjangSisiAtas;
    protected double panjangSisiBawah;
    protected double tinggi;

    public Trapesium(double panjangSisiAtas, double panjangSisiBawah, double tinggi) {
        this.panjangSisiAtas = panjangSisiAtas;
        this.panjangSisiBawah = panjangSisiBawah;
        this.tinggi = tinggi;
    }

    // ini menggunakan overriding
    @Override
    public double hitungLuas() {
        return 0.5 * (panjangSisiAtas + panjangSisiBawah) * tinggi;
    }
}

// ini contoh overloadingnya
class TrapesiumSikuSiku extends Trapesium {
    public TrapesiumSikuSiku(double panjangSisiAtas, double panjangSisiBawah, double tinggi) {
        super(panjangSisiAtas, panjangSisiBawah, tinggi);
    }


    public double hitungLuas(double sisiMiring) {
        return super.hitungLuas() + 0.5 * sisiMiring;
    }
}