package Tugasprak1;

public class Nilai {
	String NIM;
	String Nama;
	float Absen ;
	float Tugas ;
	float Uts ;
	float Uas ;
	
	
	public Nilai(String NIM, String Nama, float Absen, float Tugas, float Uts, float Uas) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Absen = Absen;
        this.Tugas = Tugas;
        this.Uts = Uts;
        this.Uas = Uas;
	}
	
	public double hitungNilaiAkhir() {
        double nilaiAbsen = this.Absen * 0.10;
        double nilaiTugas = this.Tugas * 0.20;
        double nilaiUts = this.Uts * 0.30;
        double nilaiUas = this.Uas * 0.40;
        return nilaiAbsen + nilaiTugas + nilaiUts + nilaiUas;
    }
	
	void nilai () {
		System.out.println("NIM                  :"+this.NIM);
		System.out.println("Nama                 :"+this.Nama);
		System.out.println("Nilai Absen[10%]     :"+this.Absen);
		System.out.println("Nilai Tugas[20%]     :"+this.Tugas);
		System.out.println("Nilai UTS[30%]       :"+this.Uts);
		System.out.println("Nilai UAS[40%]       :"+this.Uas);
		System.out.printf("Nilai Akhir          :%.2f\n", this.hitungNilaiAkhir()); 
	}
	
	void cetaknilai () {
		this.nilai();
	}

}
