class Stuff {
    String kode, namabarang, satuan;
    int jumlah, harga;

    Stuff(String kode, String namabarang, String satuan, int jumlah, int harga) {
        this.kode = kode;
        this.namabarang = namabarang;
        this.satuan = satuan;
        this.jumlah = jumlah;
        this.harga = harga;
    }
    /**
     * @return the namabarang
     */
    public String getNamabarang() {
        return this.namabarang;
    }
}
