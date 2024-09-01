public class KonversiTipeDataNumber {

    public static void main(String[] args) {
        //WIDENING
        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;
        float tipeDataFLoat = tipeDataLong;
        double tipeDataDouble = tipeDataFLoat;

        //NARROWING
        int tipeDataInteger = -129;
        byte tipeDataByte2 = (byte) tipeDataInteger;

        System.out.println(tipeDataByte2);

        String firstName, lastName;
        firstName = "Andrew";
        lastName  = "Simbolon";

        System.out.printf("%s,%s", firstName, lastName);
    }
}
