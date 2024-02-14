#include <stdio.h>

int sinnDesLebens() {
    return 42;
}

typedef double(*myMathPtr)(double, double);

double add(double a, double b) {
    return a + b;
}

double sub(double a, double b) {
    return a - b;
}

int main() {
    int result =(int) sinnDesLebens;

    myMathPtr ptr[] = {add,sub};

    for (int i = 0; i < 2; ++i) {
        printf("Sinn = %lf\n", ptr[i](3,4));
    }

    return 0;
}
