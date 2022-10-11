public class TablicaInt {
    public static void main(String[] args) {
        //utworzenie tablicy
        int[] lottoNumbers = new int[] {0,2,5,7,8,9,};
// długośc tablicy
        System.out.println(lottoNumbers.length);

//wypisanie elementów tablicy
        //sposób prosty
  /*        System.out.println(lottoNumbers[0]);
            System.out.println(lottoNumbers[1]);
            System.out.println(lottoNumbers[2]);
            System.out.println(lottoNumbers[3]);
            System.out.println(lottoNumbers[4]);
            System.out.println(lottoNumbers[5]);*/

        // wypisanie za pomocą pętli
            for (int i=0; i<lottoNumbers.length; i++){
                System.out.println(lottoNumbers[i]);
            }
    }
}
