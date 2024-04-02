#include<stdio.h>

int calculadora(int D, int A, int N){
    int diaria, valorTotal;
    if(N < 16){
        diaria = D + A*(N-1);
    } else {
        diaria = D + A*14; 
    }
    valorTotal = diaria*(32-N);        
    return valorTotal;
}

int main(){
    int D, A, N, valorTotal; 
    scanf("%d %d %d", &D, &A, &N);
    
    if(N == 1){
        valorTotal = 31*D;
    } else {
        valorTotal = calculadora(D, A, N);
    }

    printf("%d\n", valorTotal);
     
}
