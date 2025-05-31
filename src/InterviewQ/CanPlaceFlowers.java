package InterviewQ;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n== 0 || flowerbed[0]==0 && flowerbed.length==1) return true;
        int inc = 0;
        for(int i=0; i<flowerbed.length; i++) {
            if(flowerbed[i] == 0) {
                boolean isLeftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean isRightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (isLeftEmpty && isRightEmpty) {
                    flowerbed[i] = 1;
                    inc++;
                    if (inc == n)
                        return true;
                }
            }
        }

        return inc >= n;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0}, 1));
        System.out.println(canPlaceFlowers(new int[]{0, 0}, 1));
        System.out.println(canPlaceFlowers(new int[]{0, 1, 0}, 1));
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 0}, 2));
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 1}, 2));
    }
}
