#include <stdio.h>

#include <omp.h>
int main()

{
double arr[10]={1.1,5.1,8.1,2.5,6.3,9.2,4.5,5.5,6.4,8.3};

omp_set_num_threads(4);
double max_val=0.0;

int i;
for( i=0; i<10; i++)
arr[i] = 2.0 + i;

for( i=0; i<10; i++)
printf("\na value%f",arr[i] );

#pragma omp parallel for reduction(max : max_val)

for( i=0;i<10; i++)
{

printf("thread id = %d and i = %d \n", omp_get_thread_num(), i); if(arr[i] > max_val)

{
max_val = arr[i];

}
}

printf("\nmax_val = %f", max_val);
}
