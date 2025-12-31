class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            reverseArray(image[i]);
        }
        for (int i=0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = image[i][j] == 0 ? 1 : 0;
            }
        }
        return image;
    }

    void reverseArray (int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }


    }
}