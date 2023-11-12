package id.ac.unand.fti.si.pbo;

public class App {

    public static void main(String[] args) {

        MemberPlatinum platinumMember = new MemberPlatinum();
        int jumlahBayarPlatinum = platinumMember.menghitungJumlahBayar(11005000);
        int poin = platinumMember.getPoin();
        MemberGold goldMember = new MemberGold();
        int jumlahBayarGold = goldMember.menghitungJumlahBayar(7000000);
        int poinGold = goldMember.getPoin();
        MemberReguler regulerMember = new MemberReguler();
        int totalBayarReguler = goldMember.menghitungJumlahBayar(7000000);
        int poinReguler = goldMember.getPoin();
        MemberSilver silverMember = new MemberSilver();
        int totalBayarSilver = goldMember.menghitungJumlahBayar(7000000);
        int poinSilver = goldMember.getPoin();

        // Platinum
        System.out.println("MEMBER PLATINUM");
        System.out.println("Total Harga Belanja Platinum: " + 11005000);
        System.out.println("potongan Harga: " + jumlahBayarPlatinum);
        System.out.println("Poin :" + poin);
        System.out.println("\n");

        System.out.println("MEMBER GOLD");
        System.out.println("Total Harga Belanja Gold: " + 7000000);
        System.out.println("Potongan Harga: " + jumlahBayarGold);
        System.out.println("Poin :" + poinGold);
        System.out.println("\n");

        System.out.println("MEMBER REGULER");
        System.out.println("Total Harga Belanja Reguler: " + 500000);
        System.out.println("Potongan Harga: " + totalBayarReguler);
        System.out.println("Poin: " + poinReguler);
        System.out.println("\n");

        // Member silver
        System.out.println("MEMBER SILVER");
        System.out.println("Total Harga Belanja Silver: " + 800000);
        System.out.println("Potongan Harga: " + totalBayarSilver);
        System.out.println("Poin: " + poinSilver);
    }

    @Override
    public String toString() {
        return "App class";
    }
}