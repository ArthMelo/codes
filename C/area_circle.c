#include<stdio.h>
int main(){
    double raio, area;
    double pi = 3.14159;
    printf("Digite o raio do seu circulo: ");
    scanf("%lf", &raio);
    area = pi * (raio*raio);
    printf("A: %.4lf", area);
}
