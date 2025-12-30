class Solution {
    public int largestAltitude(int[] gains) {
        List<Integer> altitudes = new ArrayList<>();

        altitudes.add(0);

        int sum = 0;
        for (int gain : gains) {
            sum += gain;
            altitudes.add(sum);
        }

        return Collections.max(altitudes);
    }
}