#include <stdio.h>

int main() {
    int number;
    do {
        printf("Enter a positive number: ");
        scanf("%d", &number);
        printf("%d\n", number);
    } while (number > 0);
    return 0;
}
