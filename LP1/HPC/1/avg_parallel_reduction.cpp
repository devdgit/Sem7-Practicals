#include <stdio.h>
#include<stdlib.h>
#include <omp.h>
int main()
{
int a[5]={1,2,3,4,5},i;
float avg=0.0;

#pragma omp parallel for reduction (+:avg)
for(i =0; i<5; i++) {
printf("thread id = %d and i = %d \n", omp_get_thread_num(),i);
avg += a[i];}
avg /= 5;
printf("avg = %f\n",avg); 
}
