class Solution {
    public boolean uniqueOccurrences(int[] arr) {

     // Find minimum and maximum values
    int min = arr[0];
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }

        if (arr[i] > max) {
            max = arr[i];
        }
    }

    // Frequency array
    int[] fre = new int[max - min + 1];

    for (int i = 0; i < arr.length; i++) {
        fre[arr[i] - min]++;
    }

    // Check whether frequencies are unique
    for (int i = 0; i < fre.length; i++) {

        if (fre[i] == 0) {
            continue;
        }

        for (int j = i + 1; j < fre.length; j++) {

            if (fre[j] == 0) {
                continue;
            }

            if (fre[i] == fre[j]) {
                return false;
            }
        }
    }

    return true;
}
}