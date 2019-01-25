public static void toBase(int number, int base) {
    String binary = "";
    int temp = number/2+1;
    for (int j = 0; j < temp ; j++) {
        try {
            binary += "" + number % base;

            number /= base;
        } catch (Exception e) {
        }
    }
    for (int j = binary.length() - 1; j >= 0; j--) {
        System.out.print(binary.charAt(j));
    }
}