#include <stdio.h>
#define ARRLEN 13

int main() {
    int arr[ARRLEN] = {1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10};
    int sum = 15;
    int left = 0; 
    int right = 1;
    int r[2];

    int calc = *(arr + left);
    printf("calc=%d | left=%d | right=%d\n", calc, left, right);
    while (left < ARRLEN - 1) {
        if (calc == sum) {
            if (right - left > (*(r + 1) - 1) - *(r + 0)) {
                *(r + 0) = left + 1;
                *(r + 1) = right;
            }
            printf("r=[%d, %d]\n", left, right);
        }

        if (calc <= sum && right != ARRLEN) {
            calc = calc + *(arr + right);
            right++;
        } else {
            calc = calc - *(arr + left);
            left++;
        }

        printf("calc=%d | left=%d | right=%d\n", calc, left, right);
    }
    printf("\n");

    printf("longest final r=[%d, %d]\n", *(r + 0), *(r + 1));
}
