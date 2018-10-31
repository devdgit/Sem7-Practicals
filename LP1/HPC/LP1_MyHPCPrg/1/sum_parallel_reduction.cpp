#include <stdio.h>
#include<stdlib.h>
#include <omp.h>
int main(int argc,char *argv[])
{
int i,n;
float a[100],b[100],sum;
//some initialization*/
n=10;//n=100

for( i=0; i<n; i++)
 a[i] = b[i]=i*1.0;

//for( i=0; i<n; i++)
// printf("a = %f\n",a[i]); 


sum=0.0;

#pragma omp parallel for reduction(+ : sum)

for( i=0;i<n; i++)
{
sum+=a[i]*b[i];
printf("sum = %f\n",sum); 

}
}
