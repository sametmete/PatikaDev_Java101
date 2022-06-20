public class DizidekiElemanlarinOrtalamasi {
    public static void main(String[] args) {
        int[] arr = new int[]{15, 32, 8, 97, 46, 52, 77, 55};

        //dizideki elemanlarýn aritmetik ortalamasýný bulan kod
        double sum = 0, result = 0;
        for (int temp : arr) {
            sum += temp;
        }
        double average = sum / arr.length;
        System.out.println("Dizideki sayilarin aritmetik ortalamasi : "+average);

        //dizideki elemanlarýn harmonik ortalamasýný bulan kod. Foreach'den farklý bir uygulama olsun diye iç içe for yazýldý.
        for (int i = 0; i < arr.length; i++) {
            for (double j = 1; j < arr[i]; j++) {
                result += (1 / j);
            }

        }
        double harAverage = arr.length / result;

        System.out.format("Harmonik ortalama : %.2f",harAverage);

    }
}
